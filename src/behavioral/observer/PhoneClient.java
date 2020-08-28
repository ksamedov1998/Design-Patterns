package behavioral.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class PhoneClient extends Observer {
    private Map<String,Subject> subjects = new HashMap<>();

    public PhoneClient(String subjectName,Subject subject) {
        subjects.put(subjectName,subject);
        subject.attach(this);
    }

    public void addSubject(String subjectName,Subject subject){
        subjects.put(subjectName,subject);
        subject.attach(this);
    }

    public void addMessage(String s,String subjectName) {
        if(!subjects.containsKey(subjectName)){
            throw new NoSuchElementException(String.format("There is %s named subject",subjectName));
        }
        (subjects.get(subjectName)).setState(s);
    }

    @Override
    void update(String subjectName) {
        System.out.println("Phone Client : " + subjects.get(subjectName).getState());
    }
}
