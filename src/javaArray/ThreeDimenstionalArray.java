package javaArray;

public class ThreeDimenstionalArray {

	public static void main(String args[]) {

		TraverseThreeDArray();
	}

	static void ThreeDExample() {

		// initialize 3D array
		int[][][] x = new int[2][3][4];

		// explanation
		// In this example, x is declared to be a 3D array in which there are two table
		// values, each table having three rows and four columns.
		// The range of table-number is from 0 to 1. The range of row is from 0 to 2 and
		// the column range from 0 to 3.
		//
		// x[0][0][0] refers to the data in the first table, first row, and first
		// column.
		// x[1][0][0] refers to the data in the second table, first row, and first
		// column.
		// x[1][2][3] refers to the data in the second table, third row, and fourth
		// column.

		/*
		 * Key Points:
		 * 
		 * a) A multidimensional array in Java is actually an array in which each
		 * element represents another array.
		 * 
		 * b) The difference between three-dimensional array and two-dimensional array
		 * is that 3D array consists of an array of 2D arrays, whereas, 2D array
		 * consists of an array of 1D arrays.
		 * 
		 * c) Three for loops (nested loop) are used to access each element in the
		 * tables.
		 * 
		 * d) First for loop is used to select each table.
		 * 
		 * e) Second for loop is used to select each row of the selected table.
		 * 
		 * f) Third for loop is used to access each element (value) in the row and table
		 * selected.
		 */

		// Student example
		// Here, tables represent departments, rows indicate students, and columns
		// indicate subject scores. Look at the following source code to understand
		// better.

		String[] department = { "Electronics", "CS", "IT" };
		int dept, st, sc, total = 0;
		double perc = 0;

		// Take the scores of students in a 3D array.
		int[][][] scores = { { { 75, 87, 69 }, { 90, 87, 85 }, { 56, 67, 76 } },
				{ { 78, 67, 75 }, { 87, 98, 76 }, { 67, 56, 66 } },
				{ { 72, 63, 72 }, { 82, 91, 71 }, { 64, 56, 66 } } };
		// Display the scores of students from 3D array.
		for (dept = 0; dept < 3; dept++) {
			for (int i = 0; i < 3; i++) {
				System.out.println("Department " + department[i] + ": ");
				for (st = 0; st < 3; st++) {
					System.out.println("Student" + (st + 1) + " scores: ");
					for (sc = 0; sc < 3; sc++) {
						System.out.print(scores[dept][st][sc] + " ");
						total += scores[dept][st][sc];
						perc = (double) total / 3;
					}
					System.out.println("\nTotal scores: " + total); // Displaying total marks of student.
					System.out.println("Percentage: " + perc); // Displaying percentage.
					total = 0; // reset total to zero.
				}
				System.out.println();
			}
			break;
		}
	}

	static void TraverseThreeDArray() {

		int x = 3, y = 3, z = 3;

		int[][][] arr;
		arr = new int[x][y][z];

		int it = 1;

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++)
				for (int k = 0; k < z; k++)
					arr[i][j][k] = it;
			it++;
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Table-" + (i + 1));
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++)
					System.out.print(arr[i][j][k] + " ");
				System.out.println();
			}
			System.out.println();
		}

//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < y; j++) {
//				for (int k = 0; k < z; k++) {
//					System.out.println(arr[i][j][k]);
//				}
//			}
//		}
	}

}
