package structural.bridge.nonbridge;

/*
*
* Adapter integrates with legacy, in contrast bridge works with newer code/system
*
*   Concept :
*       Decouple abstraction and implementation
*       Encapsulation, composition, inheritance,
*       Changes in abstraction won't affect client
*       Details won't be right
*
* Examples :
*   Drivers
*   JDBC
*
*   Design
*   Complicated
*   Composition over inheritance
*   Expect change from both sides
*
* Has ->
*   Abstraction, Implementor,Refined Abstraction,Concrete Implementor
*
* Pitfalls
*   More than OOP
*   Conceptually difficult to plan
*   Increases complexity
*
*/
public class BridgeMain {
    public static void main(String[] args) {
        Circle circle =  new BlueCircle();

        Square square = new RedSquare();

        Square greenSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    }
}
