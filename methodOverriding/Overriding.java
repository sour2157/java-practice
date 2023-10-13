package methodOverriding;

class Super {
	public void display() {
		System.out.println("Super class display");
	}
}

class Sub extends Super {
	public void display() {
		System.out.println("Sub class display");
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		Sub s = new Sub();
		s.display();

	}

}
