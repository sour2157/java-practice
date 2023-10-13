package functionalInterface;

import java.util.function.Predicate;

public class PredicateTest {
	//Predicate to check if integer is greater than 100 or not
	public static void main(String[] args) {
		Predicate<Integer> p = I -> I > 10;
		
		System.out.println(p.test(100));
		System.out.println(p.test(5));

	}

}
