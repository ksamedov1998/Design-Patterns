package creational.singleton;

/*
 * Real time examples that uses creation Singleton design pattern:
 *      - Runtime
 *      - Logger
 *      - Spring Beans
 *      - Graphics Managers
 * Design :
 *  Class is responsible for lifecycle
 *  ** Needs to be thread safe
 *  private instance and should have private constructor
 * */

/**
 * @implNote
 * eager loaded singleton creates object when application start to run
 * simply when even you don't need it, it will be there (in memory).
 * */
class SimpleSingleton {
    private static SimpleSingleton singleton = new SimpleSingleton();
    private SimpleSingleton(){}

    // NOTE -> IntelliJ IDEA smart enough to suggest method name "getInstance"
    public static SimpleSingleton getInstance(){
        return singleton;
    }
}

/**
 * @implNote  When you use Lazy loading option u gain some advantages of to run application
 * start time will be less and does not create an instance until it is needed.
 *
 * */
class LazyLoadedSingleton {
    private static LazyLoadedSingleton singleton = null;
    private LazyLoadedSingleton(){}

    public static LazyLoadedSingleton getInstance(){
            if(singleton == null){
                singleton = new LazyLoadedSingleton();
            }
        return singleton;
    }
}

// todo can be check with multiple thread
/**
 * for thread safe manner we are using double-check mechanism inside
 * getInstance() method, that case if thread try to get inside boolean
 * statement while it is false after another thread already created an instance
 * ,it will be locked there .
 * */
class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton singleton = null;
    private ThreadSafeSingleton(){
            // can not be instantiated by reflection or JVM stuff
        if(singleton != null) {
            throw new RuntimeException("Use getInstance method to create!");
        }
    }

    public static ThreadSafeSingleton getInstance(){

        if(singleton == null){
            synchronized (ThreadSafeSingleton.class){
                if(singleton == null){
                    singleton = new ThreadSafeSingleton();
                }
            }
        }
        return singleton;
    }
}

public class SingletonMain{
    public static void main(String[] args) {
        processSimpleSingleton();
        processLazyLoadedSingleton();
    }

    private static void processLazyLoadedSingleton() {
        LazyLoadedSingleton simpleSingleton = LazyLoadedSingleton.getInstance();
        LazyLoadedSingleton simpleSingleton1 = LazyLoadedSingleton.getInstance();
        checkEquality(simpleSingleton,simpleSingleton1,"Simple singleton");
    }

    private static void processSimpleSingleton() {
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();
        checkEquality(simpleSingleton,simpleSingleton1,"Lazy loaded singleton");
    }

    private static <U> void checkEquality(U s1,U s2,final String type){
        if(s1== s2){
            printMessage(type ,true);
        }else{
            printMessage(type ,false);
        }
    }
    private static void printMessage(String name,boolean isCorrect) {
        System.out.printf("Both object are the same,%s implemented %s \n",name,isCorrect?"successfully":"deficient");
    }
}
