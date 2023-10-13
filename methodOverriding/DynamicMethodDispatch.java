package methodOverriding;

class Super1 {
	public void meth1() {
		System.out.println("Super meth 1");
	}
	
	public void meth2() {
		System.out.println("Super meth 2");
	}
}

class Sub1 extends Super1 {
	public void meth2() {
		System.out.println("Sub meth 2");
	}
	
	public void meth3() {
		System.out.println("Sub meth 3");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Super1 s = new Sub1();
		s.meth1();
		s.meth2();

	}

}
