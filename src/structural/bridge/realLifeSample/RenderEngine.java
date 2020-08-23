package structural.bridge.realLifeSample;

public abstract class RenderEngine  {
    protected InformationFormatter formatter;

    public RenderEngine(InformationFormatter formatter) {
        this.formatter = formatter;
    }

    abstract void renderInformation();
}
