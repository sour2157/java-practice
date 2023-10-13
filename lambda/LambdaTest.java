package lambda;

interface Interf {
	public void m1();
}


public class LambdaTest {
	public static void main(String[] args) {
		Interf interf = () -> System.out.println("m1 implementation");
		interf.m1();
	}
}
