package functionalInterface;

//program using two string values and print concatenation result

public class BiConsumer {

	public static void main(String[] args) {
		java.util.function.BiConsumer<String, String> c = (s1, s2) -> System.out.println(s1 + s2);
		
		c.accept("Hello", "World");

	}

}
