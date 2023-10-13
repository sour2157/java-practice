package innerClasses;

abstract class My {
	abstract void display();
}

class Outer1 {
	public void meth() {
		//anonymous inner class
		My my = new My() {
			
			@Override
			void display() {
				System.out.println("Hello");
			}
		};
		my.display();
	}
}

public class AnonymousInnerDemo {

	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.meth();

	}

}
