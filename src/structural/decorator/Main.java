package structural.decorator;

/*
*  Concept
*       Also called a wrapper
*       Add new behavior without affecting others
*       More than just inheritance
*       Single Responsibility Principle
*       Compose behavior dynamically
*  Examples
*        java.io.InputStream
*        java.util.Collection#checkedList
*
*  Design
*   Inheritance based
*   Utilize composition and inheritance
*   Alternative to subclassing
*   Constructor requires instance from hierarchy
*
* Component class is interface has concrete instance and
* concrete component uses Decorator and Decorator itself is interface
* and concrete decorator implementing decorator
*

* Pitfalls
*   New class for every feature
*   Multiple little objects
*   Often confused with simple inheritance
*/

public class Main {
    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}
