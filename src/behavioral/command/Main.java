package behavioral.command;

import java.util.ArrayList;
import java.util.List;

/*
    Concept
        Encapsulate request as an Object
        Object-oriented callback
        Decouple sender from processor
        Often used for "undo" functionality

    Examples
        java.lang.Runnable
        javax.swing.Action

    Design
        Object per command (commands are verbs)
        Command Interface
        Execute method
        "Unexecute" method
        Advance implementation uses Reflection
        
    UML
        Command
             - ConcreteCommand
        Receiver
        Client
    Sample code
        Task task1 = new Task(10,22); // Task implements Runnable
        Task task2 = new Task(10.13);

        Thread thread1 = new Thread(task1);
        thread1.start(); // invoker method
        Thread thread2 = new Thread(task2);
        thread2.start(); 
    Pitfalls
        Dependence on other patterns
        Hard to handle multiple Commands
        Make use of Memento
        
*/
public class Main {
    public static void main(String[] args) {
        Light bedRoom = new Light();
        Light kitchenLight = new Light();
        
        Switch lightSwitch = new Switch();

        // simplest command does only turning on
        // Command onCommand = new OnCommand(light);
        // Command toggleCommand = new ToggleCommand(light); 

        // saving state
        // lightSwitch.storeAndExecute(toggleCommand);
        // lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedRoom);
        lights.add(kitchenLight);

        // macro command
        Command command = new AllLightsCommand(lights);
        
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
    }
}