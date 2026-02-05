package interviewques1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AISelenium {

	public static void main(String[] args) throws InterruptedException {
		AISelenium obj = new AISelenium();
		// obj.safeClick();
		//obj.mapwithlist();
		// obj.ListtoMap();
		obj.BuildQuery();
	}

	public void safeClick() throws InterruptedException {
		int retryCount = 2;

		for (int i = 0; i <= retryCount; i++) {
			try {
				int a = 10;
				int b = 0;
				int c = a / b;
				return;
			} catch (ArithmeticException e) {
				System.out.println("error thrown");
				if (i == retryCount) {
					// If it's the LAST attempt, don't just sleep... FAIL.
					throw new RuntimeException("Automation failed after " + retryCount + " retries", e);
				}
				Thread.sleep(2000);
			}
		}
	}

	public void mapwithlist() {
		/*
		 * QA: ["https://qa-app.com", "https://qa-api.com", "https://qa-db.com"]
		 * Staging: ["https://stage-app.com", "https://stage-api.com"] Goal: Write the
		 * code to retrieve the second URL from the "QA" environment.
		 */
		List<String> QAURL = List.of("https://qa-app.com", "https://qa-api.com", "https://qa-db.com");
		List<String> STGURL = List.of("https://stage-app.com", "https://stage-api.com");

		Map<String, List<String>> env = new HashMap<String, List<String>>();
		env.put("QA", QAURL);
		env.put("STG", STGURL);
		env.keySet().stream().filter(s -> s.contains("QA")).toList();

		String secondQAUrl = env.entrySet().stream().filter(s -> s.getKey().equals("QA")) // Find the QA entry
				.map(Map.Entry::getValue) // Get the List<String>
				.flatMap(List::stream) // "Flatten" the list into a stream of individual URLs
				.skip(1) // Skip the 1st URL ("https://qa-app.com")
				.findFirst() // Grab the 2nd URL ("https://qa-api.com")
				.orElse("N/A");
		System.out.println(secondQAUrl);
	}

	public void ListtoMap() {
		/*
		 * You are building a Health Check tool for your env map. You have a list of
		 * service statuses for a "PROD" environment, but the data is messy:
		 * List<String> prodData = List.of("Auth:UP", "DB:DOWN", "Search:UP",
		 * "Gateway:ERROR"); Your Task Add prodData to your env map with the key "PROD".
		 * Use a Stream to find all services in the "PROD" list that are not "UP". If a
		 * service is "DOWN", add it to a List<String> failures. If a service is
		 * "ERROR", throw a custom RuntimeException with the message "System Critical".
		 */

		List<String> prodData = List.of("Auth:UP", "DB:DOWN", "Search:UP", "Gateway:ERROR");
		Map<String, String> newmap = new HashMap<String, String>();
		newmap = prodData.stream().map(s -> s.split(":", 2))
				.collect(Collectors.toMap(arr -> arr[0], arr -> arr[1]));
		
		System.out.println(newmap);
		List<String> failures = newmap.entrySet().stream().filter(s -> !s.getValue().equalsIgnoreCase("UP")).map( s -> s.getKey()).toList();
		System.out.println(failures);
	}
	
	public void BuildQuery() {
		StringBuilder sb = new StringBuilder("SELECT * FROM Users WHERE id IN (");
		
		int[] ids = {101, 102, 103, 104, 105};
		
		for (int i=0; i<ids.length; i++) {
			if(i<ids.length-1) {
				sb.append(ids[i]);
				sb.append(",");
			}
			else {
				sb.append(ids[i]);
				sb.append(")");
			}
		}
		System.out.println(sb);
	}
	
	public void tryCatchFinally() {
		/*
		 * Write a try-catch-finally block that: Try: Attempts to read a file (simulated
		 * by a println). Catch: Catches an IOException.
		 */

		String path = "";
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			 String line = br.readLine();
		}
		catch(IOException e ){
			System.out.println("Handle error here");
		}
		finally {
			System.out.println("Closing File Stream");
		}
	}
}

















