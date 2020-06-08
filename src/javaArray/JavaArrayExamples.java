package javaArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class JavaArrayExamples {
	public static void main(String[] args) {
		//CreateIntegerArray();
		//FindMinInArray(new int[]{10,22,44,66,4});
		//FindMaxInArray(new int[]{10,22,44,66,4});
		SortArray(new int[]{10,22,44,66,4});
	}

	public static void CreateIntegerArray() {
		int[] intarray = new int[6]; // Declare and instatiate array
		intarray[0] = 10;
		intarray[1] = 120;
		intarray[2] = 13;
		intarray[3] = 60;
		intarray[4] = 55;
		intarray[5] = 55;
		for (int i : intarray) {
			System.out.println("values from array intarray: " + i);
		}
		// Array two
		int[] intarraytwo = { 1, 2, 4, 6, 8, 10 }; // declaration, instantiation and initialization
		for (int i : intarraytwo) {
			System.out.println(i);
		}

		// Sort array using Arrays
		Arrays.sort(intarraytwo);
		System.out.println("After sorting array intarraytwo : " + Arrays.toString(intarraytwo));

		// Sort array using for loop
		for (int i = 0; i < intarray.length; i++) {
			for (int j = i + 1; j < intarray.length; j++) {
				if (intarray[i] > intarray[j]) {
					int temp = intarray[i];
					intarray[i] = intarray[j];
					intarray[j] = temp;
				}
			}
		}
		System.out.println("After sorting intarray using for loop : " + Arrays.toString(intarray));
	}

	
	public static int FindMinInArray(int[] inputarray) {		
		int minInteger = inputarray[0] ;
		for (int i : inputarray) {
			if (i < minInteger) {
				minInteger = i;
			}
		}
		System.out.println(minInteger);
		return minInteger;
	}
	
	public static int FindMaxInArray(int[] inputarray) {		
		int maxInteger = inputarray[0] ;
		for (int i : inputarray) {
			if (i > maxInteger) {
				maxInteger = i;
			}
		}
		System.out.println(maxInteger);
		return maxInteger;
	}
	
	public static void SortArray(int[] inputarray) {
		Arrays.sort(inputarray);
		System.out.println(Arrays.toString(inputarray));
	}
	
	
}
