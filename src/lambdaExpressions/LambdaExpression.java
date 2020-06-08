package lambdaExpressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaExpression {
	// Syntax of lambda expression
	// (parameter_list) -> {function_body}

	public static void main(String[] args) {
		IterateListUsingLambda();
		System.out.println("\n" + "output from IterateMapUsingLambda" + "\n");
		IterateMapUsingLambda();
	}

	// Iterating collections using foreach loop with kambda
	static void IterateListUsingLambda() {
		List<String> list = new ArrayList<String>();
		list.add("Rick");
		list.add("Negan");
		list.add("Daryl");
		list.add("Glenn");
		list.add("Carl");

		// lambda expression
		list.forEach(name -> System.out.println(name));
	}

	// Iterating map using foreach loop with lambda
	static void IterateMapUsingLambda() {
		Map<String, Integer> prices = new HashMap<>();
		prices.put("Apple", 50);
		prices.put("Orange", 20);
		prices.put("Banana", 10);
		prices.put("Grapes", 40);
		prices.put("Papaya", 50);
		
		/* Iterate without using Lambda
		   for (Map.Entry<String, Integer> entry : prices.entrySet()) {
		   System.out.println("Fruit: " + entry.getKey() + ", Price: " + entry.getValue());
		   }
		*/ 
		
		prices.forEach((k,v)->System.out.println("Fruit: " + k + ", Price: " + v));
	}
}
