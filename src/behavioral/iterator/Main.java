package behavioral.iterator;

import java.util.Iterator;

/* 
    Concept
        Traverse a container
        Don't expose underlying structure
        Decouple algorithms
        Sequential
    Example
        java.util.Iterator
        java.util.Enumeration
    Design
        Interface based
        Factory Method based
        Each iterator independent, but fail fast
        Enumerators are fail safe
    UML
        Iterator
            - ConcreteIterator
    Sample Code
        List<String> names = new ArrayList<>();
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");
        
        Iterator<String> nameItr = names.iterator();

        while(nameItr.hasNext()){
            ...
        }
    Pitfalls
        No access to index
        Base iterator is only directional (ListIterator has unidirectional)
        Can be slightly slower
*/
public class Main {
    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();

        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");
        repo.addBike("Kross");


        Iterator<String> bikeIterator =  repo.iterator();

        while(bikeIterator.hasNext()){
            System.out.println(bikeIterator.next());
            bikeIterator.remove();
        }

        System.out.println(repo.getSize());
        repo.print();
    }
}