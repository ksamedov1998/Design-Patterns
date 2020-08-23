package structural.bridge.realLifeSample;


public class PrettyPrintJsonFormatter extends InformationFormatter {

    public PrettyPrintJsonFormatter(Object object) {
        super(object);
    }

    @Override
    String formatHeader() {
        return "header { \n" +
                "\tname : " + object.getName() + " \n"
                 + "\tage : " +object.getAge()+ "\n}"  ;
    }

    @Override
    String formatBody() {
        return "body { \n" +
                "\tabout : " + object.getAbout() + " \n"
                + "\tcvUrl : " +object.getCvUrl()+ "\n"
                + "\tdate : " +object.getDate()+ "\n"
                + "\tfather's name : " +object.getFatherName()+ "\n"
                + "\tmother's name : " +object.getMotherName()+ "\n }";
    }
}
