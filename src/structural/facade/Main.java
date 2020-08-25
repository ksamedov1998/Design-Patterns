package structural.facade;

/*
* Concepts
*   Make api easy to use
*   Reduces dependencies on outside code
*   Simplify the interface or client code
*   Usually a refactoring pattern
*
* Example
*   java.net.URL
*
* Design
*   Class utilizes composition
*   No inheritance
*/
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        DumpProcessionFacade dumpProcessionFacade = new DumpProcessionFacade(person);

        dumpProcessionFacade.processPerson();
        dumpProcessionFacade.insertPerson();
        dumpProcessionFacade.retrievePerson(person);
    }
}
