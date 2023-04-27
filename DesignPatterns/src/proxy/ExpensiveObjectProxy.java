package org.example.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject{
    private static ExpensiveObject expensiveObject;

    @Override
    public void process() {
        if(expensiveObject == null) {
            expensiveObject = new ExpensiveObjectImpl();
        }
        expensiveObject.process();
    }
}
