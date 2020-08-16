package creational;

/**
 * @implNote
 * Real time examples that uses creational.Singleton design pattern:
 *      - Runtime
 *      - Logger
 *      - Spring Beans
 *      - Graphics Managers
 * Design :
 *  Class is responsible for lifecycle
 *  ** Needs to be thread safe
 *  private instance and should have private constructor
 * */
class SimpleSingleton {
    private static SimpleSingleton singleton = new SimpleSingleton();
    private SimpleSingleton(){}

    // NOTE -> IntelliJ IDEA smart enough to suggest method name "getInstance"
    public static SimpleSingleton getInstance(){
        return singleton;
    }
}

public class SingletonMain{
    public static void main(String[] args) {
        processSimpleSingleton();
    }

    private static void processSimpleSingleton() {
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();
        checkEquality(simpleSingleton,simpleSingleton1);
    }

    private static void checkEquality(SimpleSingleton s1,SimpleSingleton s2){
        if(s1== s2){
            printMessage("Simple Singleton",true);
        }else{
            printMessage("Simple Singleton",false);
        }
    }
    private static void printMessage(String name,boolean isCorrect) {
        System.out.printf("Both object are the same,%s implemented %s ",name,isCorrect?"successfully":"deficient");
    }
}
