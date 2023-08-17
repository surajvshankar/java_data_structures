import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class LinkedListExamples {
  public static void main(String[] args) {
    List<String> doublyLinked = new LinkedList<String>();
    doublyLinked.add("apple");
    doublyLinked.add("mango");
    doublyLinked.add("orange");

    doublyLinked.add(1, "pear");
    // doublyLinked, therefore, can be spliced (added, deleted) easily.
    // However, slower at randomly accessing elements.

    System.out.println(doublyLinked);

    List<String> usingArrays = new ArrayList<String>(); // Default capacity: 10 / 1.8.0_172
    usingArrays.add("dog");
    usingArrays.add("cat");
    usingArrays.add("monkey");

    usingArrays.add(1, "donkey");
    // Backed by an array:, therefore, takes longer to grow.
    // However, quicker for randomly accessing elements.

    System.out.println(usingArrays);

    // To create a synchronized (thread safe) List:
    List<String> synchronizedList = Collections.synchronizedList(doublyLinked);
    System.out.println(synchronizedList);
    synchronizedList = Collections.synchronizedList(usingArrays);
    System.out.println(synchronizedList);
  }
}
