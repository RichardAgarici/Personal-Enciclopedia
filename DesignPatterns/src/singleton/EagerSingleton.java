package singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("Singleton being initialized");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
