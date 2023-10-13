package functionalInterface;

import java.util.function.Function;

//Program to find square of a number using function interface

public class FunctionTest2 {

	public static void main(String[] args) {
		Function<Integer, Integer> square = num -> num * num;

		System.out.println(square.apply(100));
		System.out.println(square.apply(49));
		System.out.println(square.apply(7));
	}

}
