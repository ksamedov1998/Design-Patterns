package structural.bridge.bridge;


/*
* Bridge solves problem of 2 side and develop them independently
*
* */
public class BridgeMain {
    public static void main(String[] args) {
        Color blue = new Blue();
        Color green =  new Green();
        Shape square =  new Square(blue);
        Shape round = new Round(green);
        square.applyColor();
        round.applyColor();
    }
}
