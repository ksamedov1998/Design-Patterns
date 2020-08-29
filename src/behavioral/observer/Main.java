package behavioral.observer;

import creational.factory.Website;

/*
*   Concept
*       One to Many relationship
*       Decoupled
*       Event Handling
*       Typically called Pub/Sub pattern
*       M-V-C
*   Example
*       java.util.Observer
*       java.util.EventListener
*       javax.jms.Topic
*   Design
*       Subject (interface or abstract class)
*       Observer (interface based) <register themselves>
*       Views are Observers
*   Pitfalls
*       Unexpected updates
*       Large sized consequences
*
*/
public class Main {
    public static void main(String[] args) {
        Subject subject = new MessageStream("newMessage");
        Subject subject1 = new MessageStream("hi");

        //phone client is accepting multiple subject
        PhoneClient phoneClient = new PhoneClient(subject.getSubjectName(),subject);
        //web client is accepting only one subject
        WebClient webClient = new WebClient(subject);

        phoneClient.addSubject(subject1.getSubjectName(),subject1);

        phoneClient.addMessage("Here is a new message!",subject.getSubjectName());
        phoneClient.addMessage("Message from Instagram!",subject.getSubjectName());
        phoneClient.addMessage("Hi!!",subject1.getSubjectName());
        phoneClient.addMessage("WP!!",subject1.getSubjectName());
        webClient.addMessage("Hello user!");
    }
}
