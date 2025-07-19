package testpackage1;

public class BreakStmt3 {

	public static void main(String[] args) {
		int i = 0;
		do {
			if (i == 3) {
				break;
			}
			System.out.println(i);
			i++;
		} while (i < 5);
	}

}
 	