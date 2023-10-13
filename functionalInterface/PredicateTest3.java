package functionalInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateTest3 {
	//Predicate to check where a collection like arraylist or hashset is empty or not
	public static void main(String[] args) {
		Predicate<Collection> p = C -> C.isEmpty();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		
		System.out.println(p.test(a));
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		System.out.println(p.test(a2));

	}

}
