package testpackage1;

public class Array2 {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 1;
		System.out.println(a.length);

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//System.out.println(a[5]); // as there is no such memory allocated to array
	}

}
