package testpackage1;

public class Array5Ex {

	static int[] a = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {

		int b = a[1]; // assigning the value, 2

		for (int i = 0; i < a.length; i++) {
			if (b > a[i]) {
				System.out.println(b);
			} else {
				System.out.println("ABCD...");
			}
		}

	}

}
