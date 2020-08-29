package behavioral.visitor;

/*
* Concept
*       Separate Algorithm from Object
*       Adding new features
*       Maintain Open/Closed principles
*       Visitor changes
* Example
*       java.lang.mode.element.Element
*       java.lang.mode.element.ElementVisitor
* Design
*       Interface based
*       Visitor and Element
*       Elements have visit method
*       Visitor knows every Element
*       Visitor (visit())
*           - ConcreteVisitor
*       Element(accept(Visitor))
*           - ConcreteElement
* Pitfalls
*       Plan for adaptability
*       Indirection somewhat confusing
*       You might need to implement adapter pattern
*
*/
public class Main {
    public static void main(String[] args) {
        PartsOrder partsOrder =  new PartsOrder();
        partsOrder.addPart(new Oil());
        partsOrder.addPart(new Defender());
        partsOrder.addPart(new Wheel());

        partsOrder.accept(new AtvShippingVisitor());
    }
}
