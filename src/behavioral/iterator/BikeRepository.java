package behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class BikeRepository implements Iterable<String> {
    private String[] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[10];
    }

    public void addBike(String bike) {
        if (index == bikes.length) {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }
        bikes[index++] = bike;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<>() {
            private int removedElementCount = 0;
            private int curIndex = 0;

            @Override
            public boolean hasNext() {
                return curIndex < bikes.length && bikes[curIndex] != null;
            }

            @Override
            public String next() {
                return bikes[curIndex++];
            }

            @Override
            public void remove() {
                bikes[curIndex-1] = null;
                removedElementCount++;
                if (removedElementCount >= 5) {
                    String[] shrank = new String[bikes.length - 5];
                    for (int i = 0, j = 0; i < bikes.length; i++) {
                        if (bikes[i] != null) {
                            shrank[j++] = bikes[i];
                        }
                    }
                    bikes = shrank;
                    removedElementCount = 0;
                }
            }
        };
        return it;
    }

    public Integer getSize(){
        return bikes.length;
    }

    public void print() {
        System.out.println(Arrays.toString(bikes));
    }
}