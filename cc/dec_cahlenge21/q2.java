// Java Program to Find Entry with largest Value in Map
// Using max() method from Collections class

// Importing required classes
import java.util.*;

// main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating HashMap
		// Declaring objects of string and integer type
		HashMap<Integer, Integer> map
			= new HashMap<Integer, Integer>();
		
		
		// Inserting elements in the Map
		// using put() method

		// Custom input addition
		map.put(1, 4);
		map.put(2, 5);
		map.put(3, 7);
		map.put(4, 2);

		// Using Collections.max() method returning max
		// value in HashMap and storing in a integer
		// variable
		int maxValueInMap = (Collections.max(map.values()));
        System.out.println(maxValueInMap);
        
		// Iterate through HashMap
		// for (Entry<Integer, Integer> entry : map.entrySet()) {

		// 	if (entry.getValue() == maxValueInMap) {

		// 		// Print the key with max value
		// 		System.out.println(entry.getKey());
		// 	}
		// }
	}
}

