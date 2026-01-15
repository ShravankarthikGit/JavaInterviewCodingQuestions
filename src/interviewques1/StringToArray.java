package interviewques1;

import java.util.ArrayList;
import java.util.Arrays;

public class StringToArray {
	static String a = "1,2,3,4,5,6,7";
	
	public static void main (String args[]){
		//convert string to String array
		String[] testarray = a.split(",");
		 int blength = testarray.length;
		 //System.out.println(blength);
		 //in case of for loop we use the index directly
		 for (int i =0; i<blength; i++){
			 System.out.println(testarray[i]);
		 }
		 
		//Convert string array to list array
		 ArrayList<String> itemList = new ArrayList<String> (Arrays.asList(testarray));
		// System.out.println(itemList);
		 int alength = itemList.size();
		 //System.out.println(alength);
		 //in case os array list we need to identify the elements using the get
		 for (int i =0; i<alength; i++){
			 System.out.println(itemList.get(i));
		 } 
	}
}
