package functionalInterface;

import java.util.function.Predicate;

public class PredicateJoining {
	
	public static void name(Predicate<Integer> p, int[] x) {
		for (int x1 : x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
		
	}

	public static void main(String[] args) {
		int[] x = {5,4,3,7,8,9,11,45,23};
		Predicate<Integer> p = I -> I > 10;
		Predicate<Integer> p2 = I -> I%2==0;
		
		System.out.println("The numbers greater than 10 are - ");
		name(p, x);
		
		System.out.println("The even numbers are - ");
		name(p2, x);
		
		System.out.println("Then numbers not greater than 10 are - ");
		name(p.negate(), x);
		
		System.out.println("The numbers greater than 10 and even numbers are - ");
		name(p.and(p2), x);
		
		System.out.println("The numbers greater than 10 or even numbers are - ");
		name(p.or(p2), x);

	}

}
