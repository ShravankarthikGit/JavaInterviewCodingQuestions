package javaControlStatements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



public class ForEachLoopExample {

	public static void main(String[] args) {
		//IterateOnList();
		//System.out.println( "\n" + "Output from method IterateOnMap");
		//IterateOnMap();
		//ForEachIterateOnStream();
		ForEachOrderedIterateOnStream();
	}

	static void IterateOnList() {
		List<String> workList = new ArrayList<String>();
		workList.add("Apple");
		workList.add("Banana");
		workList.add("Orange");
		workList.add("Melon");
		workList.add("Pear");
		workList.add("Mango");
		workList.add("Milly");
		workList.add("Apple");

		/* Iterate list using for loop */
		System.out.println("\n" + "Print using for loop");
		for (int i = 0; i < workList.size(); i++) {
			System.out.println(workList.get(i).toString());
		}

		/* Iterate list using foreach loop */
		System.out.println("\n" + "Print using for each loop");
		for (String name : workList) {
			System.out.println(name);
		}

		/* Print using lambda expression */
		System.out.println("\n" + "Print using lambda expression");
		workList.forEach(name -> System.out.println(name));
		
		/*Iterate using iterator*/
		// Displaying the list 
		System.out.println("\n" + "Print using iterator and While expression");
        System.out.println("The list is: \n"+ workList); 
        // Create an iterator for the list using iterator() method 
        Iterator<String> iter = workList.iterator(); 
        // Displaying the values after iterating through the list 
        System.out.println("\n" + "The iterator values" + " of list are: "); 
        while (iter.hasNext()) { 
            System.out.print(iter.next() + " ");
        }
	}

	static void IterateOnMap() {
		Map <String, String> fruitColor = new HashMap<String, String>();	
		fruitColor.put("Apple", "Red");
		fruitColor.put("Mango", "Yellow");
		fruitColor.put("GreenApple", "Green");
		fruitColor.put("Pear", "Brown");
		fruitColor.put("Pappaya", "Orange");
		fruitColor.put("Orange", "Orange");
		fruitColor.put("Melon", "Biscuit");
		fruitColor.put("chikku", "black");
		//fruitColor.put("chikku", "red"); --> Note that hash map wont allow duplicate keys but so in case 
		//duplicate key addedd then it will override existing one
		
		/* Iterate list using foreach and entryset loop - Iterating over Map.entrySet() using For-Each loop */
		System.out.println("\n" + "Print using for loop");
		for (Map.Entry<String,String> entry : fruitColor.entrySet()) {
			 System.out.println("Key = " + entry.getKey() + 
                     ", Value = " + entry.getValue()); 
		}
		
		/*Iterating over keys or values using keySet() and values() methods*/
        // using keySet() for iteration over keys 
        for (String name : fruitColor.keySet())  
            System.out.println("key: " + name); 
          
        // using values() for iteration over keys  
        for (String url : fruitColor.values())  
            System.out.println("value: " + url); 
        
        /*Using Iterator and While loop - Iterating using iterators over Map.Entry<K, V>*/
        Iterator<Map.Entry<String, String>> itr = fruitColor.entrySet().iterator();
        System.out.println("\n" + "Print using iterator and while loop");
        while(itr.hasNext()) {
        	Map.Entry<String, String> entry = itr.next(); 
   		 System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
        }
        
        /*Iterate using for each and lamba on map*/
        fruitColor.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
        
        /* forEach to iterate a Map and display the value of a particularkey*/ 
        fruitColor.forEach((key,value)->{ 
           if(key == "Apple"){ 
              System.out.println("Value associated with key apple is: "+value); 
           }  
        });    
        /* forEach to iterate a Map and display the key associated with a particular value*/
        fruitColor.forEach((key,value)->{
           if("Orange".equals(value)){ 
              System.out.println("Key associated with Value Orange is: "+key);
           }
        });   
	}
	
	/*forEach method to iterate a Stream*/
	static void ForEachIterateOnStream() {
		List<String> names = new ArrayList<String>();
	    names.add("Maggie");
	    names.add("Michonne");
	    names.add("Rick");
	    names.add("Merle");
	    names.add("Governor");
	    names.stream() //creating stream 
	   .filter(f->f.startsWith("M")) //filtering names that starts with M 
	   .forEach(System.out::println); //displaying the stream using forEach
	}
	
	
	/*forEachOrdered method to iterate a Stream*/
	static void ForEachOrderedIterateOnStream() {
		List<String> names = new ArrayList<String>();
	    names.add("Maggie");
	    names.add("Michonne");
	    names.add("Rick");
	    names.add("Merle");
	    names.add("Governor");
	    System.out.println("Print using forEach"); 
	    names.stream() //creating stream 
	   .filter(f->f.startsWith("M")) //filtering names that starts with M 
	   .forEach(System.out::println); //displaying the stream using forEach
	    
	    /* forEachOrdered - the output would always be in this order:  Maggie, Michonne, Merle */ 
	     System.out.println("Print using forEachOrdered"); 
	     names.stream()  
	     .filter(f->f.startsWith("M"))  
	     .parallel() 
	     .forEachOrdered(n->System.out.println(n));
	}
}
