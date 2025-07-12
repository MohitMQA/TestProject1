package testpackage1;

public class UnaryOperatorsEx {

	public static void main(String[] args) {

		int a = 5;
		System.out.println(a); // 5
		System.out.println(a++); // 5
		System.out.println(a); // 6
		System.out.println(++a); // 7

		System.out.println(a--); // 7
		System.out.println(--a); // 5

		System.out.println(a-- + ++a - --a); // 5,5,4 , 6

	}

}
