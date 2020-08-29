package behavioral.templateMethod;

import structural.flyweight.Order;

/*
*  Concept
*       Code reuse
*       Common in libraries/frameworks
*       IoC
*       Algorithm emphasis
*  Example
*       java.util.Collections
*       java.util.AbstractList#indexOf
*  Design
*       Abstract Base class
*       Base calls Child
*       Hooks
*       Operations
*       AbstractBase,ConcreteClass
*  UML
*       AbstractBase(templateMethod(),mOne(),mTwo()) <- ConcreteClass (mOne(),mTwo())
*  Pitfalls
*       Restrict access
*       Confusing hierarchy
*       Difficult Program flow
*/
public class Main {
    public static void main(String[] args) {
        //other order class has different processing within the same steps as Web order
        OrderTemplate template = new WebOrder();
        template.processOrder();
    }
}
