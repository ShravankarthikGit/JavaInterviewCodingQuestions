package string;

public class StringBufferEXP {
    public static void main(String[] args){
        
      	// Creating StringBuffer
        StringBuffer s = new StringBuffer();
      
      	// Adding elements in StringBuffer
        s.append("Hello");
        s.append(" ");
        s.append("world");
        
      	// String with the StringBuffer value
      	String str = s.toString();
        System.out.println(str);
    
    
	/*
	 * StringBuffer(): It reserves room for 16 characters without reallocation
	 * StringBuffer(int size): It accepts an integer argument that explicitly sets
	 * the size of the buffer. StringBuffer(String str): It accepts a string
	 * argument that sets the initial contents of the StringBuffer object and
	 * reserves room for 16 more characters without reallocation.
	 */
    
    // 1. Using default constructor
    StringBuffer sb1 = new StringBuffer();
    sb1.append("Hello");
    System.out.println("Default Constructor: " + sb1);

    // 2. Using constructor with specified capacity
    StringBuffer sb2 = new StringBuffer(50);
    sb2.append("Java Programming");
    System.out.println("With Capacity 50: " + sb2);

    // 3. Using constructor with String
    StringBuffer sb3 = new StringBuffer("Welcome");
    sb3.append(" to Java");
    System.out.println("With String: " + sb3);
    
    // Implementation of Java StringBuffer Method
    
    // 1. append() Method
    StringBuffer sb4 = new StringBuffer("Hello ");
    sb4.append("Java"); // now original string is changed
    System.out.println(sb4);
    
    
    // insert() Method
    StringBuffer sb5 = new StringBuffer("Hello ");
    sb5.insert(1, "Java");
    
    // Now original string is changed
    System.out.println(sb5);
    
    // replace() Method
    StringBuffer sb6 = new StringBuffer("Hello");
    sb6.replace(1, 3, "Java");
    System.out.println(sb6);
    
    // delete() Method
    StringBuffer sb7 = new StringBuffer("Hello");
    sb7.delete(1, 3);
    System.out.println(sb7);
    
    // reverse() Method
    StringBuffer sb8 = new StringBuffer("Hello");
    sb8.reverse();
    System.out.println(sb8);
    
    // capacity() Method
    StringBuffer sb9 = new StringBuffer();
    
	  	// default 16
	    System.out.println(sb9.capacity()); 
	    sb9.append("Hello");
	  
	  	// now 16
	    System.out.println(sb9.capacity()); 
	    sb9.append("java is my favourite language");
	    
	  	// (oldcapacity*2)+2
	  	System.out.println(sb9.capacity());
	  	
	 // length()
	  	
        // Creating and storing string by creating object of StringBuffer
        StringBuffer sb10 = new StringBuffer("GeeksforGeeks");

        // Getting the length of the string
        int p = sb10.length();

        // Getting the capacity of the string
        System.out.println("Length of string GeeksforGeeks=" + p);
  
  	
  	
//        Advantages of StringBuffer
//        Mutable: Its content can be modified after creation while String remains immutable.
//        Better for Repeated Updates: Frequent concatenations perform efficiently because no new objects are created for each change.
//        Thread-Safe: All methods are synchronized making it safe in multithreaded environments.
//        
//        Disadvantages of StringBuffer
//        Slower in Single-Threaded Code: Synchronization adds overhead when thread safety is not needed.
//        Less Efficient Than StringBuilder: StringBuilder provides the same features with better performance in non-threaded scenarios.
//    
    
    }
    
    
}
