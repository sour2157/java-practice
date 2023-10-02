package collections;

import java.util.HashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>(10);
		
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("F");
		hs.add("T");
		hs.add("X");
		
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
