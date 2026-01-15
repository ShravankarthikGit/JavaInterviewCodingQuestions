package string;

public class StringBuilderEXP {

	
//	In Java, the StringBuilder class (part of the java.lang package) provides a mutable sequence of characters. Unlike the String class (which is immutable), StringBuilder allows modification of character sequences without creating new objects, making it memory-efficient and faster for frequent string operations.
//
//	It provides similar functionality to StringBuffer, but without thread safety.
//	StringBuilder is not synchronized, so it performs better in single-threaded applications.
//	Use StringBuffer only when thread safety is required; otherwise, prefer StringBuilder for improved performance.
			
			
	 public static void main(String[] args) {
	        StringBuilder sb1 = new StringBuilder("GeeksforGeeks");
	        System.out.println("Initial StringBuilder: " + sb1);

	        sb1.append(" is awesome!");
	        System.out.println("After append: " + sb1);
	        
			/*
			 * StringBuilder Constructors StringBuilder class provides multiple constructors
			 * for different use cases.
			 * 
			 * StringBuilder() : Creates an empty builder with a default capacity of 16
			 * characters. 
			 * 
			 * StringBuilder(int capacity) : Creates an empty builder with a specified initial capacity. 
			 * 
			 * StringBuilder(String str) : Initializes the builder with the content of the given String. 
			 * 
			 * StringBuilder(CharSequence cs) : Initializes the builder with the given CharSequence (for example, String or
			 * StringBuffer).
			 */
	        
	        StringBuilder sb2 = new StringBuilder();
	        sb2.append("Hello");
	        System.out.println("sb1: " + sb2);

	        StringBuilder sb3 = new StringBuilder(50);
	        sb3.append("This has initial capacity 50");
	        System.out.println("sb2: " + sb3);

	        StringBuilder sb4 = new StringBuilder("Geeks");
	        sb4.append("ForGeeks");
	        System.out.println("sb4: " + sb4);

	        CharSequence cs = "Java";
	        StringBuilder sb5 = new StringBuilder(cs);
	        sb5.append("Programming");
	        System.out.println("sb4: " + sb5);
	        
	        // StringBuilder Methods
	        StringBuilder sb = new StringBuilder("GeeksforGeeks");
	        System.out.println("Initial: " + sb);

	        sb.append(" is awesome!");
	        System.out.println("After append: " + sb);

	        sb.insert(13, " Java");
	        System.out.println("After insert: " + sb);

	        sb.replace(0, 5, "Welcome to");
	        System.out.println("After replace: " + sb);

	        sb.delete(8, 14);
	        System.out.println("After delete: " + sb);

	        sb.reverse();
	        System.out.println("After reverse: " + sb);

	        System.out.println("Capacity: " + sb.capacity());
	        System.out.println("Length: " + sb.length());

	        char c = sb.charAt(5);
	        System.out.println("Character at index 5: " + c);

	        sb.setCharAt(5, 'X');
	        System.out.println("After setCharAt: " + sb);

	        String sub = sb.substring(5, 10);
	        System.out.println("Substring (5–10): " + sub);

	        sb.reverse(); // Revert for search
	        System.out.println("Index of 'Geeks': " + sb.indexOf("Geeks"));

	        sb.deleteCharAt(5);
	        System.out.println("After deleteCharAt: " + sb);

	        String result = sb.toString();
	        System.out.println("Final String: " + result);
	        
	        
			/*
			 * Advantages of StringBuilder Performs faster string manipulations in
			 * single-threaded environments. Reduces memory overhead by modifying content in
			 * place. Automatically increases capacity when needed. Suitable for operations
			 * inside loops where strings are frequently changed.
			 * 
			 * Disadvantages of StringBuilder Not synchronized; unsuitable for
			 * multi-threaded environments. May allocate extra memory if the initial
			 * capacity is set too high. Requires manual synchronization if used across
			 * multiple threads.
			 */
	        

			/*
			 * When to Use Which
			 * 
			 * Use StringBuilder in most general programming scenarios, especially in
			 * single-threaded environments, such as loops or data formatting, where
			 * performance is a priority. 
			 * 
			 * 
			 * Use StringBuffer only when you have a specific
			 * requirement for thread safety, meaning multiple threads need to modify the
			 * same character sequence concurrently. In such cases, the synchronization
			 * ensures data integrity.
			 * 
			 * For simple string concatenation operations using the + operator, modern Java
			 * compilers often optimize by internally using a StringBuilder.
			 */
	    }
}
