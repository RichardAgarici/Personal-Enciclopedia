package org.example.singleton;

public class LazySingleton {
    private static LazySingleton instance;
    private int number;

    private LazySingleton() {
        System.out.println("Singleton being initialized");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
