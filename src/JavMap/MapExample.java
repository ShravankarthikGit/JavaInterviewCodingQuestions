package JavMap;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String args[]) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("StudentOne", "Amit");
		map.put("StudentTwo", "Vijay");
		map.put("StudentThree", "Rahul");
		
		
		// Elements can traverse in any order
		//Get values using entryset
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Key-Values in map" + " " + map.entrySet());
		
		//Get values using keyset
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println("Keys in map using keyset" + " " + map.keySet());
		
		System.out.println("Values in map" + " " + map.values());
		map.values();
		
		System.out.println("Value of key using keyset: " + GetValueFromKeyUsingkeySet(map, "StudentOne"));
		System.out.println("Value of key using mapset: " + GetValueFromKeyUsingMapSet(map, "StudentOne"));
		System.out.println("Key of value using mapset: " + GetKeyFromValueUsingMapSet(map, "Amit"));
		System.out.println("Value of key : " + map.get("StudentOne"));
	}
	
	//Get value passing a key using keySet
	public static String GetValueFromKeyUsingkeySet(Map<String, String> Hashmap, String keyvalue) {
		String value = null;
		
		for (String key: Hashmap.keySet()) {
			if(key == keyvalue) {
				return Hashmap.get(key); // the get(key) will return value associated with key
			}
		}
		return value;
	}
	
	//Get value passing a key using entrySet
	public static Object GetValueFromKeyUsingMapSet(Map<String, String> Hashmap, String keyvalue) {
		String value = null;
		
		for (Map.Entry m: Hashmap.entrySet()) {
			if(m.getKey() == keyvalue) {
				return m.getValue(); // the get(key) will return value associated with key
			}
		}
		return value;
	}
	
	//Get key passing a value using entrySet
	public static Object GetKeyFromValueUsingMapSet(Map<String, String> Hashmap, String value) {
		String key = null;
		
		for (Map.Entry m: Hashmap.entrySet()) {
			if(m.getValue() == value) {
				return m.getKey(); // the get(key) will return value associated with key
			}
		}
		return key;
	}
	
}
