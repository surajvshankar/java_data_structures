import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;


public class StackExamples {
  /**
   * Using Deque (not Stack) to build a stack.
   * Stack allows removal of items from inbetween the stack. Deque does not.
   */

  public static void main(String[] args) {
    Deque<String> stack = new ArrayDeque<String>(); // NOT thread-safe
    stack.push("First request");
    stack.push("Second request");
    stack.push("Third request");
    System.out.println(stack); // [Third request, Second request, First request]
    System.out.println(stack.peek()); // Third request
    stack.pop();
    System.out.println(stack);

    Stack<String> badStack = new Stack<String>(); // Synchronized
    badStack.push("First request");
    badStack.push("Second request");
    badStack.push("Third request");
    System.out.println(badStack); // [First request, Second request, Third request]
    System.out.println(badStack.peek()); // Third request
  }
}
