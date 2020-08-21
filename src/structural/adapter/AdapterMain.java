package structural.adapter;

import javax.imageio.stream.IIOByteBuffer;
import java.util.Arrays;
import java.util.List;

/*
 * Simple real life sample is real plugs
 *
 * Concepts:
 *   Convert interface into another interface
 *   Connects new to legacy
 *   Translates request
 *   Client,Adapter,Adaptee
 *
 * Examples:
 *   Arrays -> Lists
 *   Streams
 *
 * Design
 *   Client centric
 *   Integrate new with old
 *   Interface, but not required
 *   Adaptee can be the implementation
 *
 * We create adapter to connect the older one to new
 *
 * Example:
 *   Integer[] arraysOfInts = new Ingeter[]{42,43,44};
 *   List<Integer> listofInts =  Arrays.asList(arrayOfInts);
 *   System.out.println(arrayOfInts);
 *   System.out.println(listOfInts);
 *
 *
 *
 */
public class AdapterMain {
    public static void main(String[] args) {
//        Integer[] arraysOfInts = new Integer[]{42, 43, 44};
//        List<Integer> listOfInts = Arrays.asList(arraysOfInts);
//        System.out.println(arraysOfInts);
//        System.out.println(listOfInts);
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);

    }
}
