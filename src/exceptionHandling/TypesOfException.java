package exceptionHandling;

import java.io.*;

public class TypesOfException {

	public static void main(String[] args) {
		try {
			checkedExceptionWithThrows();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			checkedExceptionWithTryCatch();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			unCheckedExceptionWithTryCatch();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// In the below method exception is handled using throws
	public static void checkedExceptionWithThrows() throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("D:/myfile.txt");
		int k;

		while ((k = fis.read()) != -1) {
			System.out.print((char) k);
		}
		fis.close();
	}

	// In the below method exception is handled using try catch
	public static void checkedExceptionWithTryCatch() throws IOException {

		FileInputStream fis = null;
		try {
			// System.out.println(System.getProperty("user.dir"));
			fis = new FileInputStream("C:\\Users\\886257\\git\\JavaInterviewCodingQuestions\\myfile");

		} catch (FileNotFoundException fnfe) {
			System.out.println("The specified file is not " + "present at the given path");
		}
		int k;
		try {
			// While loop will return -1 once end of file isreached
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
			fis.close();
		} catch (IOException npe) {
			System.out.println("I/O error occurred: " + npe );
		}
	}

	// In the below method exception is handled using try catch
	public static void unCheckedExceptionWithTryCatch() throws IOException {
		try {
			int arr[] = { 1, 2, 3, 4, 5 };
			System.out.println(arr[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\n" + "The specified index does not exist " + "in array. Please correct the error.");
		}
	}

}
