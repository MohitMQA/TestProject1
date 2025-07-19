package testpackage1;

public class ElseIfLadderExample1 {
	static int b;
	
	public static void main(String[] args) {
		int a=10;
		//int b=20;
		if(a<b) {
			//body
			System.out.println("a is smaller than b");		
		}else if(a==b) {
			System.out.println("Both are equal");
		} else if (b<a){
			System.out.println("B is smaller than a");
		} else{
			System.out.println("Invalid input");	
		}
		System.out.println("outside if else");
	}

}
