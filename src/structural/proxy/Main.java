package structural.proxy;

/*
* Concept
*       Interface by wrapping
*       Can add functionality
*       Security,Simplicity,Remote,Cost
*       Proxy called to real object
* Examples:
*   java.lang.reflect.Proxy
*   java.rmi.*
*
* Design
*       Interface based
*       Interface and implementation Class
*       java.lang.reflect.InvocationHandler
*       java.lang.reflect.Proxy
*
* Client do some subject and proxy take it process it
* if necessary send it to process Real Object
*
*/
public class Main {
    public static void main(String[] args) {
  TwitterService service = (TwitterService) SecurityProxy.
          newInstance(new TwitterServiceStub());
        System.out.println(service.getTimeLine("blk2k@"));
    }
}
