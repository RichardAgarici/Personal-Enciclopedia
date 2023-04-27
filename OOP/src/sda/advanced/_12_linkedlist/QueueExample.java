package sda.advanced._12_linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {


  public static void main(String[] args) {

    // FIFO - FIRST IN FIRST OUT
    Queue<String> myQueue = new LinkedList<>();

    myQueue.offer("Person 1");
    myQueue.offer("Person 2");
    myQueue.offer("Person 3");
    myQueue.offer("Person 4");
    myQueue.offer("Person 5");

    System.out.println("My queue is: " + myQueue);

    String element = myQueue.poll();

    System.out.println("First element polled from queue: " + element);

    System.out.println("My queue is: " + myQueue);


    System.out.println("--------------------------------------------");

    element = myQueue.poll();

    System.out.println("Second element polled from queue: " + element);

    System.out.println("My queue is: " + myQueue);


    System.out.println("--------------------------------------------");

    element = myQueue.peek();

    System.out.println("Third element polled from queue: " + element);

    System.out.println("My queue is: " + myQueue);


    System.out.println("--------------------------------------------");


    Queue<String> empty = new LinkedList<>();

    // element returned is null because we don't have elements in the queue
    String emptyElement = empty.poll();
    System.out.println(emptyElement);

    // this will throw an exception (NoSuchElementException)
//    emptyElement = empty.remove();
    
  }
}
