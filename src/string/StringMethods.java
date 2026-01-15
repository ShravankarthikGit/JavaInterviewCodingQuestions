package string;

public class StringMethods {
    public static void main(String args[]) {
        
        // String Initialization
        String s = "Geeks";
       
        // Use concat() method for string concatenation
        s = s.concat("forGeeks");
        System.out.println(s);
        
        // Change case of letters
        // String toLowerCase() Method
        // String toUpperCase() Method
        String str = "GeeksforGeeks";
        System.out.println("Length: " + str.length());  
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring: " + str.substring(2, 6));
        
        // Using length()
        String st = "Hello, World!";
        System.out.println(st.length());
        
        // charAt(int i) Method
        String s1 = "Hello, World!";
        System.out.println(s1.charAt(7));
        
        // String substring(int i) Method
        String s2 = "Hello, World!";
        System.out.println(s2.substring(7));
        
        // String substring(int i, int j) Method
        String s3 = "Hello, World!";
        System.out.println(s3.substring(7, 12));
        
        // int indexOf(String s) Method
        String s4 = "Hello, World!";
        System.out.println(s4.lastIndexOf("l"));
        
        // boolean equals(Object otherObj) Method
        String s5 = "Hello, World!";
        System.out.println(s5.equals("Hello, World!"));
        
        // boolean equalsIgnoreCase(String anotherString) Method
        String s6 = "Hello, World!";
        System.out.println(s6.equalsIgnoreCase("hello, world!"));
        
        // int compareTo(String anotherString) Method
        String s7 = "Hello, World!";
        System.out.println(s7.compareTo("Hello, Java!"));
        
        // int compareToIgnoreCase(String anotherString) Method
        String s8 = "Hello, World!";
        System.out.println(s8.compareToIgnoreCase("hello, java!"));
        
        // String trim() Method
        String s9 = "   Hello, Trim!   ";
        System.out.println("'" + s9.trim() + "'");
        
        // String replace(char oldChar, char newChar) Method
        String s10 = "Hello, World!";
        System.out.println(s10.replace('l', 'x'));
        
        // boolean contains(CharSequence sequence) Method
        String s11 = "Hello, World!";
        System.out.println(s11.contains("World"));
        
        // char[] toCharArray() Method
        String str12 = "Hello";
        char[] chars = str12.toCharArray();
        for(char c : chars) {
            System.out.print(c + " ");
        }
        
        // boolean startsWith(String prefix) Method
        String s13 = "Hello, World!";
        System.out.println(s13.startsWith("Hello"));
        
    
    }
}
