package testpackage1;

import java.util.ArrayList;

public class ArrayList1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add("a");
		list.add(12.50);
		
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(0));
		
		for(Object obj: list) {
			System.out.println("Values are : "+obj);
		}

	}

}
