package sda.advanced._19_multithreading;

import java.util.HashMap;
import java.util.Map;

public class SecondExample {

  static Map<String, String> sharedMap = new HashMap<>();

  static {
    sharedMap.put("key", "something");
  }

  public static void main(String[] args) {

//    Thread t1 = new Thread(new MyRunnable());
//    Thread t2 = new Thread(new MyRunnable());
//    Thread t3 = new Thread(new MyRunnable());
//
//    t1.start();
//    t2.start();
//    t3.start();
  
    Thread t5 = new Thread(new MyRunnableSync());
    Thread t6 = new Thread(new MyRunnableSync());
    Thread t7 = new Thread(new MyRunnableSync());
    
    t5.start();
    t6.start();
    t7.start();
    
  }

  static class MyRunnable implements Runnable {

    @Override
    public void run() {

      if (sharedMap.containsKey("key")) {

        System.out.println(Thread.currentThread().getName());

        // heavy work
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        String val = sharedMap.remove("key");

        if (val == null) {
          System.out.println("Value for 'key' was null");
        }
      } else {
        System.out.println("Condition was false");
      }
    }
    
  }

  static class MyRunnableSync implements Runnable {

    @Override
    public void run() {

      synchronized (sharedMap) {

        if (sharedMap.containsKey("key")) {

          System.out.println(Thread.currentThread().getName());

          // heavy work
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }

          String val = sharedMap.remove("key");

          if (val == null) {
            System.out.println("Value for 'key' was null");
          }
        } else {
          System.out.println("Condition was false");
        }
      }
    }
  }

}
