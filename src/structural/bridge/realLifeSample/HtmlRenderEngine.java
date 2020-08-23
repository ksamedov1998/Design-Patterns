package structural.bridge.realLifeSample;

public class HtmlRenderEngine extends RenderEngine{

    public HtmlRenderEngine(InformationFormatter formatter) {
        super(formatter);
    }

    @Override
    void renderInformation() {
        System.out.println("<html>\n"+ formatter.formatHeader() + formatter.formatBody() + "</html>");
    }
}
