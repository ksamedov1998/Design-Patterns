package structural.bridge.realLifeSample;


public class XMLFormatter extends InformationFormatter {

    public XMLFormatter(Object object) {
        super(object);
    }

    @Override
    String formatHeader() {
        return  "<header> { \n" +
                "\t<name> : " + object.getName() + "</name> \n"
                + "\t<age> : " +object.getAge()+ "</age> \n</header> \n"  ;
    }

    @Override
    String formatBody() {
        return "<body> \n" +
                "\t<about> : " + object.getAbout() + "</about> \n"
                + "\t<cvUrl> : " +object.getCvUrl()+ "</cvUrl>\n"
                + "\t<date> : " +object.getDate()+ "</date>\n"
                + "\t<father's name> : " +object.getFatherName()+ "</father's name>\n"
                + "\t<mother's name> : " +object.getMotherName()+ "</mother's name>\n </body>\n";
    }
}
