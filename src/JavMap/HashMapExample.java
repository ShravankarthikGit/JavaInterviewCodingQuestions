package JavMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String args[]) {
		HashMap<String, String> hashmapexample = new HashMap<String, String>();
		hashmapexample.put("StudentOne", "Amit");
		hashmapexample.put("StudentTwo", "Vijay");
		hashmapexample.put("StudentThree", "Rahul");
		//hashmapexample.put("StudentThree", "Laddu");

		// Get values using entryset
		for (Map.Entry m : hashmapexample.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Key-Values in map" + " " + hashmapexample.entrySet());

		// Get values using keyset
		for (String key : hashmapexample.keySet()) {
			System.out.println(key + ":" + hashmapexample.get(key));
		}
		System.out.println("Keys in map using keyset" + " " + hashmapexample.keySet());

		System.out.println("Values in map" + " " + hashmapexample.values());

		// Insert value only if absent to hashmap
		hashmapexample.putIfAbsent("StudentFour", "Gaurav");
		System.out.println("After invoking putIfAbsent() method ");
		for (Map.Entry m : hashmapexample.entrySet()) {
			System.out.println("hashmap after inserting 4th value " + m.getKey() + " " + m.getValue());
		}

		// Insert hashmapexample into newmap
		HashMap<String, String> newmap = new HashMap<String, String>();
		newmap.put("Newstudent", "Ravi");

		newmap.putAll(hashmapexample);
		System.out.println("After invoking putAll() method ");
		for (Map.Entry m : newmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		RemoveValueFromHashmapBasedOnKey(hashmapexample, "newstudent");
		
		RemoveValueFromHashmapBasedOnKeyValuePair(hashmapexample, "StudentOne", "Amit");
		
		ReplaceValueFromHashmapBasedOnKey(hashmapexample, "StudentTwo", "Raamu");
		
		ReplaceValueFromHashmapBasedOnKey(hashmapexample, "StudentFour", "Gaurav", "Raaju");
		
		ReplaceAllValuesFromHashmap  (hashmapexample, "Johnny");

	}

	public static void RemoveValueFromHashmapBasedOnKey(HashMap<String, String> hashmapexample, String key) {

		hashmapexample.remove(key);
		// Get values using entryset
		for (Map.Entry m : hashmapexample.entrySet()) {
			System.out.println("hashmap after removing key newstudent: " + m.getKey() + " " + m.getValue());
		}
	}
	
	public static void RemoveValueFromHashmapBasedOnKeyValuePair(HashMap<String, String> hashmapexample, String key ,String value) {

		hashmapexample.remove(key, value);
		// Get values using entryset
		for (Map.Entry m : hashmapexample.entrySet()) {
			System.out.println("hashmap after removing value Amit: " + m.getKey() + " " + m.getValue());
		}
	}
	
	public static void ReplaceValueFromHashmapBasedOnKey(HashMap<String, String> hashmapexample, String key, String value) {

		hashmapexample.replace(key, value);
		// Get values using entryset
		for (Map.Entry m : hashmapexample.entrySet()) {
			System.out.println("hashmap after replacing Vijay with Raamu: " + m.getKey() + " " + m.getValue());
		}
	}
	
	public static void ReplaceValueFromHashmapBasedOnKey(HashMap<String, String> hashmapexample, String key, String currentvalue, String NewValue) {

		hashmapexample.replace(key, currentvalue, NewValue );
		// Get values using entryset
		for (Map.Entry m : hashmapexample.entrySet()) {
			System.out.println("hashmap after replacing Gaurav with Raaju: " + m.getKey() + " " + m.getValue());
		}
	}
	
	
	public static void ReplaceAllValuesFromHashmap(HashMap<String, String> hashmapexample, String key) {

		hashmapexample.replaceAll((k,v)-> key);
		// Get values using entryset
		for (Map.Entry m : hashmapexample.entrySet()) {
			System.out.println("hashmap after replacing all values with Johnny: " + m.getKey() + " " + m.getValue());
		}
	}

}
