package collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>(20,0.25f);
		
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);
		
		h.forEach((x)->System.out.println(x));
		
		System.out.println(h.size());

	}

}
