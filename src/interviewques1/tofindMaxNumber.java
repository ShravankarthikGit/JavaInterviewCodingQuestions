package interviewques1;

public class tofindMaxNumber {
	public static void main(String args[]){
		int[] test = {1,4,6,3,6,20};
		int maxnum = 0;		
		for (int i: test){
			if(i > maxnum){
				maxnum = i;
				
			}
		}
		System.out.println (maxnum);
	}
}
