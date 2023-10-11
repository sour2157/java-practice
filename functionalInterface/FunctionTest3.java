package functionalInterface;

import java.util.function.Function;

//program to remove empty spaces from a string

public class FunctionTest3 {

	public static void main(String[] args) {
		String str = "Hello world today I am doing great as usual";
		
		Function<String, String> f = s -> s.replaceAll(" ", "");
		
		System.out.println(f.apply(str));

	}

}
