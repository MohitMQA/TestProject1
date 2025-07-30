package testpackage1;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String[] args) {

		// Int type arrayList example

		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		for (int list : intList) {
			System.out.println(list);

		}
		System.out.println("Size of array is:" + intList.size());
		intList.set(0, 2);
		intList.set(1, 0);
		for (int list : intList) {
			System.out.println(list);

		}

	}

}
