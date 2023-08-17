import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class CollectionsExercise {
  protected void addSixToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
    numbers.add(i);
  }

  protected void addZeroToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
    numbers.add(0, i); // Or addFirst
  }

  protected void removeItemFromTopOfStack(Deque<Integer> stack) {
    stack.pop();
  }

  protected void removeItemFromFrontOfQueue(Queue<Integer> queue) {
    queue.poll();
  }

  protected void addItemToTreeSet(Set<String> set, String item) {
    set.add(item);
  }
}
