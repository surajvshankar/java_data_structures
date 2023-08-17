import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetExamples {
  /**
   * Unique elements in a Sorted order.
   */
  public static void main(String[] args) {
    Set<Integer> treeSet = new TreeSet<Integer>();
    treeSet.add(1);
    treeSet.add(6);
    treeSet.add(300);
    treeSet.add(47);
    treeSet.add(6);
    System.out.println(treeSet);

    Set<String> wordSet = new TreeSet<String>();
    wordSet.add("tiger");
    wordSet.add("giraffe");
    wordSet.add("bear");
    System.out.println(wordSet);

    wordSet = new TreeSet<String>(Comparator.comparing(String::length));
    wordSet.add("tiger");
    wordSet.add("giraffe");
    wordSet.add("bear");
    System.out.println(wordSet); // [bear, tiger, giraffe]
    wordSet.add("wolf");
    System.out.println(wordSet); // [bear, tiger, giraffe] : IMPORTANT:
    // Since, wolf and bear have same length, therefore not unique in the tree (stored by length).

    wordSet.remove("wolf");
    System.out.println(wordSet); // [tiger, giraffe] : IMPORTANT: Removed bear
  }
}
