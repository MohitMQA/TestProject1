package testpackage1;

public class DLEligibilityExample {
	
	public static void main(String[] args) {
		
		double age = 101;
		
		if(age>=18 && age<=60) {
			System.out.println("You can vote as your age is below 61");
		} else if ((age>0 && age<18.00) || (age>60.00 && age<=100.00)) {
			System.out.println("You can't vote");
		}else {
			System.out.println("Please enter valid age!");
		}
	}

}
