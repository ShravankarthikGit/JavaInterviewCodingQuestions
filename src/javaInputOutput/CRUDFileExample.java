package javaInputOutput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CRUDFileExample {
	public static void main(String[] args) {
		 //CreateFile();
		 //GetAbsolutePath();
		// WriteToFile();
		// ReadFromFile();
		DeleteFile();
	}

	static void CreateFile() {
		try {
			File file = new File("C:\\Users\\886257\\git\\JavaInterviewCodingQuestions\\newfile.txt");
			/*
			 * If file gets created then the createNewFile() method would return true or if
			 * the file is already present it would return false
			 */
			boolean fvar = file.createNewFile();
			if (fvar) {
				System.out.println("File has been created successfully");
			} else {
				System.out.println("File already present at the specified location");
			}
		} catch (IOException e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}
	}

	static void WriteToFile() {
		FileOutputStream fos = null;
		try {
			File file = new File("C:\\Users\\886257\\git\\JavaInterviewCodingQuestions\\newfile.txt");
			fos = new FileOutputStream(file);
			String mycontent = "This is my Data which needs" + " to be written into the file";

			/*
			 * String content cannot be directly written into a file. It needs to be
			 * converted into bytes
			 */
			byte[] bytesArray = mycontent.getBytes();
			fos.write(bytesArray);
			System.out.println("Data written to file newfile.txt");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException ioe) {
				System.out.println("Error in closing the Stream");
			}
		}
	}

	static void ReadFromFile() {
		// Specify the path of the file here
		File file = new File("C:\\Users\\886257\\git\\JavaInterviewCodingQuestions\\newfile.txt");
		/*
		 * String filepath = file.getAbsolutePath(); System.out.print(filepath);
		 */
		BufferedInputStream bis = null;
		FileInputStream fis = null;

		try {
			// FileInputStream to read the file
			fis = new FileInputStream(file);

			/*
			 * Passed the FileInputStream to BufferedInputStream For Fast read using the
			 * buffer array.
			 */
			bis = new BufferedInputStream(fis);

			/*
			 * available() method of BufferedInputStream returns 0 when there are no more
			 * bytes present in the file to be read
			 */
			while (bis.available() > 0) {
				System.out.print((char) bis.read());
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("The specified file not found" + fnfe);
		} catch (IOException ioe) {
			System.out.println("I/O Exception: " + ioe);
		} finally {
			try {
				if (bis != null && fis != null) {
					fis.close();
					bis.close();
				}
			} catch (IOException ioe) {
				System.out.println("Error in InputStream close(): " + ioe);
			}
		}
	}

	static void DeleteFile() {
		try {
			// Specify the file name and path
			File file = new File("C:\\Users\\886257\\git\\JavaInterviewCodingQuestions\\newfile.txt");
			/*
			 * the delete() method returns true if the file is deleted successfully else it
			 * returns false
			 */

			if (file.delete()) {
				System.out.println("\n" + file.getName() + " is deleted!");
			} else {
				System.out.println("Delete failed: File didn't delete");
			}
		} catch (Exception e) {
			System.out.println("Exception occurred");
			e.printStackTrace();
		}
	}
	
	public static void GetAbsolutePath() {
		  
        // try catch block to handle exceptions 
        try { 
  
            // Create a file object 
            File f = new File("newfile"); 
  
            // Get the absolute path of file f 
            String absolute = f.getAbsolutePath(); 
  
            // Display the file path of the file object 
            // and also the file path of absolute file 
            System.out.println("Original path: "
                               + f.getPath()); 
            System.out.println("Absolute path: "
                               + absolute); 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
    } 

}
