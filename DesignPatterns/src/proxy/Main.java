package org.example.proxy;

public class Main {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
        object.process();
    }
}
