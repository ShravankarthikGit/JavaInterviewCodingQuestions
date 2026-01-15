package javaArray;

import java.util.Scanner;

public class TwoDimenaionalArray {
	public static void main(String[] args) {
//		InitializeMultiDArray();
//
//		UpdateMultiDArray();
//
		AccessTwoDArray();
		
		//TwoDArrayWithScanner();

	}

	static void InitializeMultiDArray() {

		// Array Initialized and Assigned
		int[][] arr = { { 1, 2 }, { 3, 4 } };

		// Printing the Array
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

	static void UpdateMultiDArray() {

		// Row and Columns in Array
		int n = 2;
		int m = 2;

		// Array declared and initialized
		int[][] arr = new int[n][m];

		int it = 1;

		// Assigning the values to array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = it;
				it++;
			}
		}

		// Printing the Array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

	static void AccessTwoDArray() {

		int[][] arr = { { 1, 2 }, { 3, 4 } };

		System.out.println("a[1][1] : " + arr[1][1]);
	}

	static void TwoDArrayWithScanner() {

		Scanner sc = new Scanner(System.in);

		// Taking Number of Rows and Columns from User
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];

		System.out.println("Enter elements of array: ");

		// Taking input from user for each element of array using nested for loop
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elements of array are: ");
		// Printing Elements of Arrays
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
		sc.close();
	}

}
