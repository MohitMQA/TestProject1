package testpackage1;

public class BreakStmtEx1 {
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
//			System.out.println(i);
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
	}

}
