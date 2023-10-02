package collections;

import java.util.PriorityQueue;

public class PriorityDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(10);
		p.add(45);
		p.add(15);
		p.add(19);
		p.add(12);
		
		System.out.println(p.peek());
		
		p.forEach((x)->System.out.println(x));
	}

}
