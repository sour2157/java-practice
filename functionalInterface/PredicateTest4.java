package functionalInterface;

import java.util.function.Predicate;

public class PredicateTest4 {
	
	//Program to check and display name that start with K

	public static void main(String[] args) {
		String[] names = {"Sunny", "Katrina", "Mallika", "Kareena", "Johny"};
		
		Predicate<String> p = name -> name.charAt(0) == 'K';
		
		for (String string : names) {
			if (p.test(string)) {
				System.out.println(string);
			}
		}

	}

}
