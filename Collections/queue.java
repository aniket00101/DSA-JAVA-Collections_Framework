package Collections;
import java.util.Queue;
import java.util.LinkedList;

class QueueDemo {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Mango");
        System.out.println("Initial Queue: " + queue);
        // Initial Queue: [Apple, Banana, Mango]

        queue.offer("Orange");
        System.out.println("After offer: " + queue);
        // After offer: [Apple, Banana, Mango, Orange]

        System.out.println("Peek element: " + queue.peek());
        // Peek element: Apple

        queue.poll();
        System.out.println("After poll: " + queue);
        // After poll: [Banana, Mango, Orange]

        System.out.println("Head element using element(): " + queue.element());
        // Head element using element(): Banana

        queue.remove();
        System.out.println("After remove: " + queue);
        // After remove: [Mango, Orange]

        System.out.println("Queue size: " + queue.size());
        // Queue size: 2

        System.out.println("Is queue empty? " + queue.isEmpty());
        // Is queue empty? false
    }
}
