package interviewques1;

public class ConsecRepeatingchars {
	public static void main(String args[]) {	
		test ("w3schooll");
	}
  public static void test (String str){
	  //we need to create a array with characters of the string passed using method toCharArray()
	  char[] inp = str.toCharArray();
	  System.out.println("Repeating Characters are:");
	  for (int i = 0; i < str.length()-1; i++) {
	    if (inp[i] == inp[i+1]) {
	     System.out.println(inp[i]);
	    }
	  }
  }
  
}
