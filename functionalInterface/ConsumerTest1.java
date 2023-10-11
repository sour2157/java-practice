package functionalInterface;

import java.util.function.Consumer;

//program to check consumer interface working

public class ConsumerTest1 {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		
		c.accept("Hello");
		c.accept("Sam");

	}

}
