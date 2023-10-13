package interfaces;

interface Test1 {
	void meth1();
	void meth2();
}

class Test implements Test1 {
	public void meth1() {
		System.out.println("Meth 1 called");
	}
	
	public void meth2() {
		System.out.println("Meth 2 called");
	}
}

public class InterfacePractice {

	public static void main(String[] args) {
		Test1 test1 = new Test();
		test1.meth1();
		test1.meth2();

	}

}
