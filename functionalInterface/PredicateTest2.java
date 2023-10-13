package functionalInterface;

import java.util.function.Predicate;

public class PredicateTest2 {
	//Predicate to check string is greater than 5 or not
	public static void main(String[] args) {
		Predicate<String> p = I -> I.length() > 5;
		
		System.out.println(p.test("Hello"));
		System.out.println(p.test("Hello1234"));

	}

}
