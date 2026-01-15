package interviewques1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(3);
        ll.add(2);

        System.out.println("Original list: " + ll);

        LinkedList<Integer> ll1 = new LinkedList<>();
        ll.descendingIterator().forEachRemaining(ll1::add);  // adds in reverse order

        System.out.println("Reversed copy: " + ll1);
        
        SortComparator();
    }
    
    public static void SortComparator() {
        List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango"));
        System.out.println("without sorting" + list); // Output: [Mango, Banana, Apple]
        list.sort(Comparator.reverseOrder());
        System.out.println("after sort and reverse" + list); // Output: [Mango, Banana, Apple]
    }

}
