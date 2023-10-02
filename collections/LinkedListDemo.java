package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> al1 = new LinkedList<>();
		LinkedList<Integer> al2 = new LinkedList<>(List.of(50,60,70,80,90,70));
		
		al1.add(10);
		al1.add(1, 20);
		al1.addAll(al2);
		
		//linked list specific methods
		al1.addFirst(12);
		al1.addLast(110);
		al1.removeFirst();
		al1.removeLast();
		//----------------------------
		
		System.out.println(al1.contains(10));
		
		System.out.println(al1.containsAll(al2));
		
		System.out.println(al1.get(1));
		
		System.out.println(al1.indexOf(70));
		
		System.out.println(al1.lastIndexOf(70));
		
		System.out.println(al1);
		
		al1.remove(1);
		
		al1.set(1, 30);
		
		for(int i=0; i<al1.size();i++) {
			System.out.println(al1.get(i));
		}
		
		Iterator<Integer> it = al1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
