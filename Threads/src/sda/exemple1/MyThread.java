package sda.exemple1;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 12; i++) {
            System.out.println(Thread.currentThread().getName()+" is alive");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName()+" is dead");
    }
}