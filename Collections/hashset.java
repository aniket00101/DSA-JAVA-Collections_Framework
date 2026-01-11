package Collections;
import java.util.HashSet;

class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        System.out.println("Initial HashSet: " + set);
        // Initial HashSet: [Apple, Banana, Mango]

        set.add("Orange");
        System.out.println("After add: " + set);
        // After add: [Apple, Banana, Mango, Orange]

        set.add("Apple");
        System.out.println("After adding duplicate: " + set);
        // After adding duplicate: [Apple, Banana, Mango, Orange]

        set.remove("Banana");
        System.out.println("After remove: " + set);
        // After remove: [Apple, Mango, Orange]

        System.out.println("Contains Mango? " + set.contains("Mango"));
        // Contains Mango? true

        System.out.println("Size of HashSet: " + set.size());
        // Size of HashSet: 3

        System.out.println("Is HashSet empty? " + set.isEmpty());
        // Is HashSet empty? false

        set.clear();
        System.out.println("After clear: " + set);
        // After clear: []
    }
}
