package interviewques1;

public class toFindMaxMinNumbers {
	public static void main(String args[]){
		int[] test = {1,5,9,45,30};
		
			int maxnum =test[0];
			int minnumber = test[0];
			
			for (int i = 0; i< test.length; i ++) {
				if(maxnum < test[i]) {
					maxnum = test[i];
				}
			}
			
			for (int i = 0; i< test.length; i ++) {
				if(minnumber > test[i]) {
					minnumber = test[i];
				}
			}
			
			System.out.println (maxnum + " is maxnumber in array");
			System.out.println (minnumber + " is maxnumber in array");
		
	}
}
