package Collections;
import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("Initial List: " + list);
        // Initial List: [Apple, Banana, Mango]

        list.add(1, "Orange");
        System.out.println("After add at index: " + list);
        // After add at index: [Apple, Orange, Banana, Mango]

        list.addFirst("Grapes");
        System.out.println("After addFirst: " + list);
        // After addFirst: [Grapes, Apple, Orange, Banana, Mango]

        list.addLast("Pineapple");
        System.out.println("After addLast: " + list);
        // After addLast: [Grapes, Apple, Orange, Banana, Mango, Pineapple]

        list.remove("Orange");
        System.out.println("After remove element: " + list);
        // After remove element: [Grapes, Apple, Banana, Mango, Pineapple]

        list.removeFirst();
        System.out.println("After removeFirst: " + list);
        // After removeFirst: [Apple, Banana, Mango, Pineapple]

        list.removeLast();
        System.out.println("After removeLast: " + list);
        // After removeLast: [Apple, Banana, Mango]

        System.out.println("Get element at index 1: " + list.get(1));
        // Get element at index 1: Banana

        list.set(1, "Kiwi");
        System.out.println("After set at index 1: " + list);
        // After set at index 1: [Apple, Kiwi, Mango]

        System.out.println("Contains Mango? " + list.contains("Mango"));
        // Contains Mango? true

        System.out.println("Size of list: " + list.size());
        // Size of list: 3

        System.out.println("Peek element: " + list.peek());
        // Peek element: Apple

        list.poll();
        System.out.println("After poll: " + list);
        // After poll: [Kiwi, Mango]

        list.clear();
        System.out.println("After clear: " + list);
        // After clear: []
    }
}
