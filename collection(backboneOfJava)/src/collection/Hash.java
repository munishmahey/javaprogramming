package collection;

import java.util.HashSet;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {

		Set<String> list = new HashSet<String>();// HashSet provides uniqueness
													// but not in the same order
		list.add("mango");
		list.add("apple");
		list.add("mango");
		list.add("pine apple");
		list.add("mango");
		list.add("pine apple");
		for (String value : list)// instead of iterator we can use for each loop
									// for simplicity
		{
			System.out.println(value);
		}

	}

}
