package Collections;
import java.util.Stack;
// Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation
// getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
class SpecialStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    int maxSize;
    public SpecialStack(int size) {
        //main stack to store all elements
        // min stack to track current minimum
        this.maxSize = size;
    }
    public void push(int x) {
        if (isFull()) {
            System.out.println("full");
            return;
        }
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("empty");
            return -1;
        }
        int removed = mainStack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
        return removed;
    }
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }
    public boolean isFull() {
        return mainStack.size() == maxSize;
    }
    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("empty");
            return -1;
        }
        return minStack.peek();
    }
    public int peek() {
        if (mainStack.isEmpty()) {
            System.out.println("empty");
            return -1;
        }
        return mainStack.peek();
    }
}
public class Ans3 {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("current mini " + stack.getMin()); // 1
        stack.pop(); // pop 3
        System.out.println("current mini" + stack.getMin()); // 1
        stack.pop(); // pop 1
        System.out.println("current mini" + stack.getMin()); // 2
    }
}