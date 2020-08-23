package structural.bridge.bridge;

public class Round extends Shape {
    public Round(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        color.applyColor();
    }
}
