package testpackage1;

public class StringComparision3 {
	
	public static void main(String[] args) {
		
		String s="tEst1";
		String t="tesT1";
		
		if(s.equalsIgnoreCase(t)) {
			System.out.println("Both strings are equal");
		}else {
			System.out.println("Not equal");
		}
	}

}
