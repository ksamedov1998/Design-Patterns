package behavioral.chainOfResponsibility;

/* 
    Can be implemented with interface and that would be contstructor based
    and while handler is creating it needs to know its successor. 
*/
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}