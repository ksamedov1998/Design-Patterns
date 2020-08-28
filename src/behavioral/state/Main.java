package behavioral.state;

/*
*   Used to represent a application state
*   Concept
*       Localize state behavior
*       State Object
*       Separate what from where
*       OCP
*   Example
*       None!
*       Only JSF
*   Design
*       Abstract class / Interface
*       Each state class Based
*       Context unaware
*       Pieces
*            - Context ( request() )
*            - State ( handle() )
*                   - ConcreteState
*   Sample code ( if/else clauses)
*       final static int ON = 0;
*       final static int OFF = 1;
*       public void pullChain(){
*           if(state == ON){
*               System.out.print("Fain is already on");
*           }else if(state == OFF){
*               System.out.print("Turning Fan on.");
*               state = ON;
*           }
*       }
*   Pitfalls
*       Must know all state beforehand
*       More classes
*       Keeping logic out of Context, keep it in state
*       Sate change triggers
*/
public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
    }
}
