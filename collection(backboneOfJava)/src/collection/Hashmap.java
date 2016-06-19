package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("employeeID", "1005");
		map.put("employeeName", "VeenuGoyal");
		map.put("employeeColor", "ExtraWhite");
		System.out.print(map);
		Set<String> KeySet = map.keySet();
		Iterator<String> iterator = KeySet.iterator();
		System.out.println(" ");
		while (iterator.hasNext()) {
			String Key = (String) iterator.next();
			System.out.println("key :" + Key);
			System.out.println("value:" + map.get(Key));
			System.out.println("======================");
		}

		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry myObject : entrySet) {
			System.out.println(myObject.getKey() + " :: " + myObject.getValue());
		}
		
		Set<String> keySet1 = map.keySet();
		for(String key : keySet1){
			System.out.println(key+ " :: " + map.get(key));	
		}
	}

}
