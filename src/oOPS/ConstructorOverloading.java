package oOPS;

import java.io.*;

class Geeks1{
    
    // constructor with one argument
	Geeks1(String name){
        
        System.out.println("Constructor with one "
                           + "argument - String: " + name);
    }

    // constructor with two arguments
	Geeks1(String name, int age){

        System.out.println(
            "Constructor with two arguments: "
            + " String and Integer: " + name + " " + age);
    }

    // Constructor with one argument but with different
    // type than previous
	Geeks1(long id)
    {
        System.out.println(
            "Constructor with one argument: "
            + "Long: " + id);
    }
}

class ConstructorOverloading {
    public static void main(String[] args){
        
        // Creating the objects of the class named 'Geek'
        // by passing different arguments
    	Geeks1 geek2 = new Geeks1("Sweta");

        // Invoke the constructor with two arguments
    	Geeks1 geek3 = new Geeks1("Amiya", 28);

        // Invoke the constructor with one argument of
        // type 'Long'.
    	Geeks1 geek4 = new Geeks1(325614567);
    }
}