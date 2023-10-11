package functionalInterface;

import java.util.function.Function;

//Program to find length of a string using function interface

public class FunctionTest1 {

	public static void main(String[] args) {
		Function<String, Integer> length = s -> s.length();
		
		System.out.println(length.apply("Hello"));
		System.out.println(length.apply("Hello World"));

	}

}
