package structural.flyweight;
/*
 *   Concept
 *       More efficient use of memory
 *       Large number of similar object
 *       Immutable (state can nor be changed in runtime)
 *       Also cacheable
 *   Example
 *       java.lang.String
 *       java.lang.Integer(Character,Long,..),valueOf(int)
 *
 *   Design
 *       Pattern of patterns
 *       Utilizes a factory
 *       Encompasses Creation and Structure
 *       Client,Factory,Flyweight, ConcreteFlyweight
 */

public class Main {
    public static void main(String[] args) {
        InventorySystem system = new InventorySystem();

        system.takeOrder("Roomba", 221);
        system.takeOrder("Samsung TV", 225);
        system.takeOrder("Bose Headphone", 200);

        system.process();
        System.out.println(system.report());
    }
}
