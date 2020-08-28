package behavioral.observer;

public class WebClient extends Observer {
    private Subject subject;

    public WebClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String s) {
        subject.setState(s);
    }

    @Override
    void update(String subjectName) {
        System.out.println("Web client : " + subject.getState());
    }
}
