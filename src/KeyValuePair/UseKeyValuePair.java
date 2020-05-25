package KeyValuePair;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


public class UseKeyValuePair {

	public static void main(String args[]) throws IOException {

		String absoluteFilePath = "";
		String filename = "TextFileWithKeyValue";
		String workingDirectory = System.getProperty("user.dir");
		absoluteFilePath = workingDirectory + File.separator + filename;
		System.out.println(absoluteFilePath);

		Path flatfilePath = Paths.get(absoluteFilePath);
		System.out.println(flatfilePath);
		HashMap<String, String> map = new HashMap<String, String>();
		BufferedReader productlines = Files.newBufferedReader(flatfilePath);
		String line;
		while ((line = productlines.readLine()) != null) {

			String[] lines = line.split("=", 2);
			if (lines.length >= 2) {
				String key = lines[0];
				String value = lines[1];
				map.put(key, value);
			}
		}
		productlines.close();
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

        // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + map); 
  
        // Using keySet() to get the set view of keys 
        System.out.println("The key set is: " + map.keySet()); 
        
        // Using keySet() to get the set view of keys 
        System.out.println("The entry set is: " + map.entrySet()); 
        
       //Get value passing a key
        String val2=map.get("SEX");
        System.out.println("Initial Mappings are: " +  val2);
        
        
        //Get value passing a key
        String key=map.get("gender");
        System.out.println("Initial Mappings are: " +  key);
        

	}
}
