package interviewques1;

public class toFindMaxMinNumbers {
	public static void main(String args[]){
		int[] test = {1,5,9,45,30};
		int maxnum = 0;
		int minnum = 0;
		for (int i : test){
			if(i>maxnum){
				maxnum = i;
			}
			else if(i<minnum){
				minnum = i;
			}
		}
		System.out.println("maxnumber is: "+ maxnum);
		System.out.println("maxnumber is: "+ minnum);
	}
}
