package interviewques1;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.addFirst("Mango");
        list.addLast("Orange");

        // Print list
        System.out.println(list);  // Output: [Mango, Apple, Banana, Orange]

        // Access elements
        System.out.println("First: " + list.getFirst());  // Mango
        System.out.println("Last: " + list.getLast());    // Orange

        // Remove elements
        list.removeFirst();  // Removes Mango
        list.removeLast();   // Removes Orange

        // Iterate over list
        for (String fruit : list) {
            System.out.println(fruit);
        }
        // Output:
        // Apple
        // Banana

        // Check if list contains an element
        System.out.println(list.contains("Banana"));  // true

        // Size of the list
        System.out.println("Size: " + list.size());  // 2
    }
}
