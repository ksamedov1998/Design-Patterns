package structural.bridge.realLifeSample;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Object person =  new Object() ;
        person.setName("John");
        person.setAbout("I am John, John Wick :)");
        person.setAge(5);
        person.setCvUrl("https://dumpInformation.com/profile/id=1234");
        person.setMotherName("none");
        person.setFatherName("Jonny Bravo");
        person.setDate(LocalDate.now());
        InformationFormatter jsonFormatter = new PrettyPrintJsonFormatter(person);
        InformationFormatter xmlFormatter = new XMLFormatter(person);
        RenderEngine renderEngine = new HtmlRenderEngine(jsonFormatter);
        RenderEngine xmlRenderEngine = new HtmlRenderEngine(xmlFormatter);

        renderEngine.renderInformation();
        xmlRenderEngine.renderInformation();

    }
}
