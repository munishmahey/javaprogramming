package collection;

import java.util.LinkedList;
import java.util.List;

public class Link {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		list.add("mango");
		list.add("apple");
		list.add("mango");
		for (String value : list)// instead of iterator we can use for each loop
									// for simplicity
		{
			System.out.println(value);
		}

	}

}
