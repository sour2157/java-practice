package staticDemo;

public class StaticBlockDemo {
	
	static int s;
	
	static {
		System.out.println("Block 1");
		s = 10;
		System.out.println(s);
	}
	
	static {
		System.out.println(s);
	}

	public static void main(String[] args) {
		System.out.println("Main");

	}

}
