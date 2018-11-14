package PracticePackage;

public class PractceReverseStringWithOutReverse {
public static void main (String args[]){
	String st = "Baalu";
	
	String revstring = "";
	
	for (int i=4; i>=0; --i){
		revstring = revstring + st.charAt(i);
	}
	
	System.out.println (revstring);
}
}
