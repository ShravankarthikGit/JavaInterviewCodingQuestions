package TestEncapsulation;

public class TestEncapsulation {
	private String st;
	private int num;
	
	//Setters method
	public void setName(String name){
		st = name;
	}
	
	public void setNum(int number){
		num = number;
	}
	
	//getters method
	public String getName(){
		return st;
	}
	
	public int getNum(){
		return num;
	}

}
