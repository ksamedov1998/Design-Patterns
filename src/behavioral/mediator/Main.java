package behavioral.mediator;

/* 
    Concept
        Loose coupling
        Well-defined,but complex
        Reusable components
        Hub/Router
    Examples
        java.util.Timer
        java.lang.reflect.Method
    Design
        Interface based
        Concrete class
        Minimizes inheritance
        Mediator knows about colleagues
    UML
        Mediator
            - ConcreteMediator
        Colleague
            - ConcreteColleague1
            - ConcreteColleague2

*/
public class Main {
    public static void main(String[] args) {
        Light light1 = new Light("bathroom");
        Light light2 = new Light("kitchen");
        Light light3 = new Light("hall");

        Mediator mediator = new Mediator();

        mediator.registerLight(light1);
        mediator.registerLight(light2);
        mediator.registerLight(light3);

        Command command = new TurnOnAllLightsCommand(mediator);

        command.execute();
    }
}