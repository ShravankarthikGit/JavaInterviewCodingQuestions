package PracticePackage;

public class PracticeFibonacciClass {
	public static void main(String args[]){
		
		int[] fibarray = new int[10];
		
		fibarray[0] = 0;
		fibarray[1] = 1;
		
		for (int i =2 ; i< 10; i++){
			fibarray[i] = fibarray[i-1] + fibarray[i-2] ;
		}
		
		for (int j=0; j<=fibarray.length;j++){
			System.out.println(fibarray[j]);
		}
		
		
	}

}
