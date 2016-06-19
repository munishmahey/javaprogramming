package collection;

import java.util.TreeSet;
import java.util.Set;

public class Tree {

	public static void main(String[] args) {
		Set<String> list = new TreeSet<String>();// TreeSet provides uniqueness
													// as well as maintain the
													// order
		
		list.add("apple");
		list.add("pine apple");
		list.add("mango");
		list.add("pine apple");
		list.add("mango");
		
		for (String value : list)// instead of iterator we can use for each loop
									// for simplicity
		{
			System.out.println(value);

		}

	}
}
