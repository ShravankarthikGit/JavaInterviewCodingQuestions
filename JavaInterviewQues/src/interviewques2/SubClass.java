package interviewques2;

import test.sClass;

public class SubClass extends sClass {
	public void main(String args[]) {
		//static String color = "black";
		printColor();
	}

	void printColor() {
		//System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}
}
