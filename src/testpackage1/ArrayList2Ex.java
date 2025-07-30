package testpackage1;

import java.util.ArrayList;

public class ArrayList2Ex {

	public static void main(String[] args) {

		ArrayList<String> fruit = new ArrayList<>();

		fruit.add("Apple"); // index 0
		fruit.add("Mango"); // index 1
		fruit.add("Banana");// index 2

		/*
		 * //accessing the element from the arraylist using .get method
		 * System.out.println(fruit.get(0)); // getting the fruit from index 0
		 * System.out.println(fruit.get(1)); // Mango System.out.println(fruit.get(2));
		 * // Banana
		 * 
		 * System.out.println("********************"); fruit.set(0, "Banana");
		 * //updating the element at index 0 System.out.println(fruit.get(0)); //
		 * getting the fruit from index 0 fruit.set(1, "Mango"); //updating the element
		 * at index 1 System.out.println(fruit.get(1)); // Mango fruit.set(2, "Apple");
		 * //updating the element at index 2 System.out.println(fruit.get(2)); // Banana
		 */
		fruit.remove(0);
		System.out.println(fruit.get(0)); // getting the fruit from index 0
		fruit.remove(0);
		System.out.println(fruit.get(0));
		fruit.remove(0);
		System.out.println("***");
		System.out.println(fruit.isEmpty()); // true
		/*
		 * System.out.println(fruit.get(0)); System.out.println(fruit.get(1)); // Mango
		 * System.out.println(fruit.get(2)); // Banana
		 */
		// getting the size
		System.out.println(fruit.size()); // 0 as we removed all items from list
		// again adding
		fruit.add("Apple"); // index 0
		fruit.add("Mango"); // index 1
		fruit.add("Banana");// index 2

		fruit.clear();
		System.out.println(fruit.size()); // we have clear the arraylist
		System.out.println(fruit.get(0));

	}

}
