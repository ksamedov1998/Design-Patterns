package structural.facade;

public class DumbProcessing {
    private Person person;

    public DumbProcessing(Person person) {
        this.person = person;
    }

    public void processAndInsertData(){
        // process and insert the person all in here this would lead spaghetti and uncontrolled code
    }

}
