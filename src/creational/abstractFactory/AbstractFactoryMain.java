package creational.abstractFactory;

/*
* Concept:
*   Factory of Factories
*   Factory of related object
*   Common Interface and its subclasses
*
* Examples:
*   DocumentBuilder
*   Often implemented in framework
*
* Design
*   Group Factories together
*   Common interface
*   Has Parameterized create method
*   Typically build via composition
*
* Example code
*   DocumentBuilderFactory abstractFactory =  DocumentBuilderFactory.newInstance();
*   DocumentBuilder factory =  abstractFactory.newDocumentBuilder();
*   Document doc = factory.parse(...);
*
*Pitfall:
*   Most Complex
*   Runtime switch
*   Pattern within a pattern
*   Problem specific
*   Starts as factory but becomes Abstract factory
*/
public class AbstractFactoryMain {
    public static void main(String[] args) {
        
    }
}
