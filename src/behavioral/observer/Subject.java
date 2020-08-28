package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> subs = new ArrayList<>();
    private String subjectName;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    abstract void setState(String state);
    abstract  String getState();

    public void attach(Observer observer){
        subs.add(observer);
    }

    public void detach(Observer observer){
        subs.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : subs){
           observer.update(subjectName);
        }
    }
}
