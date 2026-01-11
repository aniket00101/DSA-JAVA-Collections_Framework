package Collections;
import java.util.HashMap;

class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        System.out.println("Initial HashMap: " + map);
        // Initial HashMap: {1=Apple, 2=Banana, 3=Mango}

        map.put(2, "Orange");
        System.out.println("After updating key 2: " + map);
        // After updating key 2: {1=Apple, 2=Orange, 3=Mango}

        System.out.println("Get value for key 1: " + map.get(1));
        // Get value for key 1: Apple

        map.putIfAbsent(4, "Grapes");
        System.out.println("After putIfAbsent: " + map);
        // After putIfAbsent: {1=Apple, 2=Orange, 3=Mango, 4=Grapes}

        map.remove(3);
        System.out.println("After remove key 3: " + map);
        // After remove key 3: {1=Apple, 2=Orange, 4=Grapes}

        System.out.println("Contains key 2? " + map.containsKey(2));
        // Contains key 2? true

        System.out.println("Contains value Apple? " + map.containsValue("Apple"));
        // Contains value Apple? true

        System.out.println("Key set: " + map.keySet());
        // Key set: [1, 2, 4]

        System.out.println("Values: " + map.values());
        // Values: [Apple, Orange, Grapes]

        System.out.println("Entry set: " + map.entrySet());
        // Entry set: [1=Apple, 2=Orange, 4=Grapes]

        System.out.println("Size of HashMap: " + map.size());
        // Size of HashMap: 3

        System.out.println("Is HashMap empty? " + map.isEmpty());
        // Is HashMap empty? false

        map.clear();
        System.out.println("After clear: " + map);
        // After clear: {}
    }
}
