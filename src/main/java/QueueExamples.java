import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueExamples {
  public static void main(String[] args) {
    Queue<String> queue = new ArrayDeque<String>(); // | LinkedList<String>();
    queue.offer("Person One");
    // If queue is full return false. queue.add("Person One") - if queue is full, throw an exception.
    queue.offer("Person Two");
    queue.offer("Person Three");
    System.out.println(queue); // [Person One, Person Two, Person Three]
    System.out.println(queue.peek()); // Person One
    queue.poll(); // No pop - use poll instead
    System.out.println(queue); // [Person Two, Person Three]

    queue = new PriorityQueue<String>();
    queue.offer("Person One");
    queue.offer("Person Two");
    queue.offer("Person Three");
    System.out.println(queue); // [Person One, Person Two, Person Three]
    System.out.println(queue.peek()); // Person One
    queue.poll(); // No pop - use poll instead
    System.out.println(queue); // IMPORTANT: [Person Three, Person Two] -
    // RETRIVAL order is the natural order - in case of strings, alphabetic order.
    queue.poll();
    System.out.println(queue); // IMPORTANT: [Person Two]

    queue = new PriorityQueue<String>();
    queue.offer("Person Zone");
    queue.offer("Person Two");
    queue.offer("Person Three");
    System.out.println(queue); // [Person Three, Person Zone, Person Two]
    System.out.println(queue.peek()); // Person Three
    queue.poll();
    System.out.println(queue);
    queue.poll();
    System.out.println(queue); // IMPORTANT: [Person Zone]

    Queue<Integer> intQueue = new PriorityQueue<Integer>();
    intQueue.offer(4);
    intQueue.offer(2);
    intQueue.offer(9);
    intQueue.offer(0);
    intQueue.offer(1);
    System.out.println(intQueue); // [0, 1, 9, 4, 2]
    System.out.println(intQueue.peek()); // 0
    intQueue.poll(); // 0
    intQueue.poll(); // 1
    System.out.println(intQueue.peek()); // 2
    System.out.println(intQueue); // [2, 4, 9]
  }
}
