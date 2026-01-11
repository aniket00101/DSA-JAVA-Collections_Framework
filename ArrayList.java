import java.util.ArrayList;
import java.util.Collections;

class ArrayListDemo {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // add()
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("After add(): " + list);  //After add(): [Apple, Banana, Mango]

        // add at index
        list.add(1, "Orange");
        System.out.println("After add at index: " + list);  //After add at index: [Apple, Orange, Banana, Mango]

        // get()
        System.out.println("Element at index 2: " + list.get(2));  //Element at index 2: Banana

        // set()
        list.set(2, "Grapes");
        System.out.println("After set(): " + list);  //After set(): [Apple, Orange, Grapes, Mango]

        // remove by index
        list.remove(1);
        System.out.println("After remove(index): " + list);  //After remove(index): [Apple, Grapes, Mango]

        // remove by object
        list.remove("Mango");
        System.out.println("After remove(object): " + list);  //After remove(object): [Apple, Grapes]

        // size()
        System.out.println("Size: " + list.size());  //Size: 2

        // contains()
        System.out.println("Contains Apple? " + list.contains("Apple"));  //Contains Apple? true

        // isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());    //Is list empty? false

        // addAll()
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Pineapple");
        list2.add("Cherry");

        list.addAll(list2);
        System.out.println("After addAll(): " + list);      //After addAll(): [Apple, Grapes, Pineapple, Cherry]

        // sort()
        Collections.sort(list);
        System.out.println("After sort(): " + list);   // After sort(): [Apple, Cherry, Grapes, Pineapple]

        // indexOf()
        System.out.println("Index of Apple: " + list.indexOf("Apple"));    //Index of Apple: 0

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);   //After clear(): []
    }
}
