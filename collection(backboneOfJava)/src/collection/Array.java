package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("apple");
		list.add("mango");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
		Object value  = (String) iterator.next();
			System.out.println(value);
		}
	}

}
