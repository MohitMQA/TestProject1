package testpackage1;

public class LogicalOper1 {

	public static void main(String[] args) {

		// logical Operator, if 1st condition is false 2nd will not be checked

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;

		System.out.println(a++ < b && c++ < d); // true + true = true
		System.out.println("1. " + a + " " + c);
		System.out.println(a++ > b && c++ < d); // false, true = false
		System.out.println("2. " + a + " " + c);
		System.out.println(a++ < b && c++ > d); // true, false = false
		System.out.println("3. " + a + " " + c);
		System.out.println(a++ > b && c++ > d); // false, false = false
		System.out.println("4. " + a + " " + c);

	}

}
