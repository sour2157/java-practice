package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		//params are size, loading factor and default access
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5,.75f,true) {
			//oldest entry will be removed - cache
			protected boolean removeEldestEntry(Map.Entry e) {
				return size()>5;
			}
		};
		
		lhm.put(1, "A");
		lhm.put(2, "B");
		lhm.put(3, "C");
		lhm.put(4, "D");
		lhm.put(5, "E");
		lhm.put(6, "F");
		lhm.put(9, "G");
		lhm.put(8, "H");
		
		lhm.get(5);

		lhm.forEach((k,v)->System.out.println(k + " " + v));
	}

}
