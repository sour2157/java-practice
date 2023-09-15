package abstractClass;

abstract class Super {
	public void meth1() {
		System.out.println("Super Meth 1");
	}
	
	abstract public void meth2();
}

class Sub extends Super {
	public void meth2() {
		System.out.println("Sub meth 2");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		Super s = new Sub();
		s.meth2();
	}

}
