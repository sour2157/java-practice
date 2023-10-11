package functionalInterface;

import java.util.function.Function;

//program to find the number of spaces present in a string

public class FunctionTest4 {

	public static void main(String[] args) {
		String str = "Hello world today I am doing great as usual";
		
		Function<String, Integer> f = s -> s.length() - s.replaceAll(" ", "").length();
		
		System.out.println(f.apply(str)); 

	}

}
