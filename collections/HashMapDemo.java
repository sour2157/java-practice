package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> tm = new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
		
		tm.put(4, "E");
		tm.put(5, "F");
		tm.put(null, "");
		
		System.out.println(tm);
		
		System.out.println(tm.get(4));

	}

}
