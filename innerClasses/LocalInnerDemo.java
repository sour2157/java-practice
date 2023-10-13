package innerClasses;

abstract class My1 {
	abstract public void show();
}

class Outer2 {
	public void display() {
		//Inner class
		class Inner {
			public void show() {
				System.out.println("Hello");
			}
		}
		
		Inner i = new Inner();
		i.show();
		
		//Anonymous inner
		My1 m = new My1() {
			
			@Override
			public void show() {
				System.out.println("Yellow");
			}
		};
		m.show();
	}
}

public class LocalInnerDemo {

	public static void main(String[] args) {
		Outer2 o = new Outer2();
		o.display();
	}

}
