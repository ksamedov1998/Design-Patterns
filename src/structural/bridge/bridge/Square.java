package structural.bridge.bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
       color.applyColor();
    }
}
