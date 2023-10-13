package functionalInterface;

import java.util.function.Consumer;

class MovieInfor {
	String name;
	String actor;
	
	public MovieInfor(String name, String actor) {
		this.name = name;
		this.actor = actor;
	}
}

public class ConsumerChaining {

	public static void main(String[] args) {
		Consumer<MovieInfor> c1 = m -> System.out.println("Movie name: " + m.name + " , Actor name: " + m.actor);
		Consumer<MovieInfor> c2 = m -> System.out.println("Movie Actor name: " + m.actor);
		Consumer<MovieInfor> c3 = m -> System.out.println("Movie name: " + m.name + " information storing in database.");
		
		Consumer<MovieInfor> chainedC = c1.andThen(c2).andThen(c3);
		MovieInfor m1 = new MovieInfor("Bahubali", "Prabhas");
		
		chainedC.accept(m1);
	}

}
