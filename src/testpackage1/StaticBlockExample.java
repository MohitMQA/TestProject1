package testpackage1;

public class StaticBlockExample {

	static {
		System.out.println("This can be run below java 1.6 but not on later version directly, we have to use main method to call it");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
