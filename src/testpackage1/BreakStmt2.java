package testpackage1;

public class BreakStmt2 {

	public static void main(String[] args) {
		int i = 0;

		while (i < 5) {
			if (i == 2) {
				break;
			}
			System.out.println(i);
			i++;
		}
	}

}
