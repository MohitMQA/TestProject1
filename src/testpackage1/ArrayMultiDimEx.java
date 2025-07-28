package testpackage1;

public class ArrayMultiDimEx {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		System.out.println("Rows: "+a.length);
		System.out.println("Column "+a[0].length);
		
		System.out.print(a[0][0]);
		System.out.print(" "+a[0][1]);
		System.out.print(" "+a[0][2]);
		System.out.print(" "+a[0][3]);
		System.out.println(" "+a[0][4]);
		System.out.print(a[1][0]);
		System.out.print(" "+a[1][1]);
		System.out.print(" "+a[1][2]);
		System.out.print(" "+a[1][3]);
		System.out.println(" "+a[1][4]);
		System.out.print(a[2][0]);
		System.out.print(" "+a[2][1]);
		System.out.print(" "+a[2][2]);
		System.out.print(" "+a[2][3]);
		System.out.print(" "+a[2][4]);

	}

}
