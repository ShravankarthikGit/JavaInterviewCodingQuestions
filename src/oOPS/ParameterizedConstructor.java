package oOPS;

import java.io.*;

class ParameterizedConstructor {

	// data members of the class
	String name;
	int id;

	// Parameterized Constructor
	ParameterizedConstructor(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// Method to display object data
	void display() {
		System.out.println("GeekName: " + name + " and GeekId: " + id);
	}

	// main() method — placed inside the same class for
	// universal compatibility
	public static void main(String[] args) {
		// This will invoke the parameterized constructor
		ParameterizedConstructor geek1 = new ParameterizedConstructor("Sweta", 68);
		geek1.display();
	}

}