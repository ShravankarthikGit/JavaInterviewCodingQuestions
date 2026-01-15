package interviewques1;

import java.util.Arrays;

public class BinarySearchExample {

    // Binary search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // prevent overflow

            if (arr[mid] == target) {
                return mid; // found the element
            } else if (arr[mid] < target) {
                left = mid + 1; // search in right half
            } else {
                right = mid - 1; // search in left half
            }
        }

        return -1; // element not found
    }

    public static int builtInBinarySearch(int[] array, int target) {
    	int index = Arrays.binarySearch(array, target);  // returns index 2
		return index;
    }
    
    
    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10, 12, 14};

        int index = binarySearch(data, 10);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");
        
        // using builtInBinarySearch
        int index1 = builtInBinarySearch(data, 6);
        System.out.println(index1);
    }
}
