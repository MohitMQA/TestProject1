package testpackage1;

public class Array4Ex {

	static int[] i = { 1, 2, 3, 4, 5 };

	static int a[] = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		System.out.println(i[0]);
		System.out.println("The value of a[" + 1 + "] :" + a[1]);

		Object[] obj = { 1, 2, 3, "A", "B", 1.0 / 2.0, 2.5, "Hello" };
		System.out.println(obj.length); // 8
		System.out.println(obj[1]);
		System.out.println(obj[4]);
		System.out.println(obj[6]);
		System.out.println(obj[7]);
		System.out.println(obj[5]);
		System.out.println("-----");
		/*//This is enhanced for loop
		 * for(Object obj2 :obj) { System.out.println(obj2); }
		 */
		//traditional loop
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}

}
