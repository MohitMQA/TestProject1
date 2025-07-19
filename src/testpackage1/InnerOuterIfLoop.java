package testpackage1;

public class InnerOuterIfLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 19;
		int weight = 51;

		if (age > 18) {

			if (weight > 50) {
				System.out.println("You are eligble");
			} else {
				System.out.println("Gain weight");
			}

		} else {
			System.out.println("Age is less, come back next year");
		}

	}

}
