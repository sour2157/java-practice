package functionalInterface;

//program using bifunction to find product of two integers

public class BiFunction {

	public static void main(String[] args) {
		java.util.function.BiFunction<Integer, Integer, Integer> f = (a,b) -> a * b;
		
		System.out.println(f.apply(10, 20));
		System.out.println(f.apply(23, 56));

	}

}
