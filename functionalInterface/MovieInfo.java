package functionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

//program to display movie info using consumer interface

class Movie {
	String name;
	String actor;
	String actress;
	
	public Movie(String name, String actor, String actress) {
		this.name = name;
		this.actor = actor;
		this.actress = actress;
	}
}

public class MovieInfo {

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		populate(list);
		
		Consumer<Movie> c = m -> {
			System.out.println("Movie name: " + m.name);
			System.out.println("Movie actor: " + m.actor);
			System.out.println("Movie actress: " + m.actress);
			System.out.println("******************************");
		};
		
		for (Movie movie : list) {
			c.accept(movie);
		}

	}
	
	public static void populate(ArrayList<Movie> l) {
		l.add(new Movie("Gadar", "Sunny", "Amisha"));
		l.add(new Movie("Lagaan", "Amir", "Preety"));
		l.add(new Movie("Villian", "Sid", "Isha"));
		l.add(new Movie("Soilder", "Bobby", "Rani"));
	}

}
