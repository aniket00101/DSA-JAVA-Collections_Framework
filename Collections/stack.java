package Collections;
import java.util.Stack;

class StackDemo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");
        System.out.println("Initial Stack: " + stack);
        // Initial Stack: [Apple, Banana, Mango]

        stack.push("Orange");
        System.out.println("After push: " + stack);
        // After push: [Apple, Banana, Mango, Orange]

        System.out.println("Peek element: " + stack.peek());
        // Peek element: Orange

        stack.pop();
        System.out.println("After pop: " + stack);
        // After pop: [Apple, Banana, Mango]

        System.out.println("Search Mango: " + stack.search("Mango"));
        // Search Mango: 1

        System.out.println("Is stack empty? " + stack.empty());
        // Is stack empty? false

        System.out.println("Stack size: " + stack.size());
        // Stack size: 3
    }
}
