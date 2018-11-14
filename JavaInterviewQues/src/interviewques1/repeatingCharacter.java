package interviewques1;

public class repeatingCharacter {
	public static void main(String args[]) {	
		test ("w3schoolsl3");
	}
  public static void test (String str){
	  //int cnt = 0;
	  //we need to create a array with characters of the string passed using method toCharArray()
	  char[] inp = str.toCharArray();
	 // System.out.println(inp);
	  System.out.println("Duplicate Characters are:");
	  for (int i = 0; i < str.length(); i++) {
	   for (int j = i + 1; j < str.length(); j++) {
	    if (inp[i] == inp[j]) {
	     System.out.println(inp[j]);
	     //cnt++;
	     //break;
	    }
	   }
	  }
  }
  
}
