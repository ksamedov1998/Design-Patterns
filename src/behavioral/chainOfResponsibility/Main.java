package behavioral.chainOfResponsibility;
/*
 Concepts
    Decouple sender and receiver
    Receiver contains reference to next receiver
    Promote loose coupling
    No Handler 
 Example:
    java.util.logging.Logger#log()
    Spring Security Filter Chain

 Design
    Chain of receiver object (commonly list)
    Handler is Interface based
    ConcreteHandler for each implementation
    Each handler has a reference to the next
 Sample code
    logger.setLevel(Level.FINER);

    ConsoleHandler handler = new ConsoleHandler();
    handler.setLevel(Level.FINER);
    logger.addHandler(handler);

    logger.finest(...); //  won't print
    logger.finer(...);
    logger.fine(...);


    #Personal_Note : Each handler has its successor in the case of not able to handle it
    let the process move to the next one and if last of chain can't handle it 
    process will be skipped
*/
public class Main{
    public static void main(String args[]){
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();
        
        
        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE,500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE,1000);
        bryan.handleRequest(request);
        
        request = new Request(RequestType.CONFERENCE,2000);
        crystal.handleRequest(request);
        
    }
}