package structural.bridge.realLifeSample;

public abstract class InformationFormatter {
    Object object;

    public InformationFormatter(Object object) {
        this.object = object;
    }

    abstract  String formatHeader();
    abstract  String formatBody();
}
