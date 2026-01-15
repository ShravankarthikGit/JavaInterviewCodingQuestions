package javaArray;

public class Practice {
	public static void main(String[] args) {

		int[][] arr = new int[2][2];

		// add elements to array
		arr[0][0] = 1;
		arr[0][1] = 2;

		arr[1][0] = 3;
		arr[1][1] = 4;

		// Print elements from array
		System.out.println("a[0][0] : " + arr[0][0]);
		System.out.println("a[0][1] : " + arr[0][1]);
		System.out.println("a[1][0] : " + arr[1][0]);
		System.out.println("a[1][1] : " + arr[1][1]);

		int n = 2;
		int m = 2;
		int it = 1;
		
		int[][] arr2 = new int[n][m];

		// Populate array using for loop
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr2[i][j] =  it;
				it = it +1;
			}
		}
		
		// Print array after population
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println(arr2[i][j]);
			}
		}
	}

}
