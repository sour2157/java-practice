package collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		dq.addLast(10);
		dq.offerLast(20);
		dq.offerLast(30);
		dq.offerLast(40);
		
		dq.offerFirst(1);
		dq.offerFirst(2);
		dq.offerFirst(3);
		dq.offerFirst(4);
		
		dq.removeFirst();
		
		dq.forEach((x)->System.out.println(x));
	}

}
