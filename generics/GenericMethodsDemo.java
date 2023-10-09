package generics;

public class GenericMethodsDemo {
	
	static <E> void show(E[] list) {
		for(E x:list) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		show(new String[] {"Hi", "Hello", "Bye"});
		show(new Integer[] {1,2,3,4,5});

	}

}
