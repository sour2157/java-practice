package innerClasses;

class Outer {
	int x = 10;
	
	class Inner {
		int y = 20;
		
		public void innerDisplay() {
			System.out.println(x + " " + y);
		}
	}
	
	public void outerDisplay() {
		Inner i = new Inner();
		i.innerDisplay();
	}
}

public class NestedInnerDemo {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.outerDisplay();
		
		//creating inner class object
		Outer.Inner oi = new Outer().new Inner();
		oi.innerDisplay();

	}

}
