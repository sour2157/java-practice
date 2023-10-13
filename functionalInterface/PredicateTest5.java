package functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

//Program to remove empty string and null values from array of strings

public class PredicateTest5 {

	public static void main(String[] args) {
		String[] names = {"Sourabh", "", "Ravi", null, "", "Ram"};
		
		Predicate<String> notEmpty = S -> S != null && !S.isEmpty();
		
		ArrayList<String> list = new ArrayList<String>();
		
		for (String string : names) {
			if(notEmpty.test(string)) {
				list.add(string);
			}
		}
		System.out.print("The list of valid strings - ");
		System.out.print(list);
	}

}
