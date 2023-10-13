package lambda;

@FunctionalInterface
interface MyLambda1 {
	public void add(int x, int y);
}

@FunctionalInterface
interface MyLambda2 {
	public void display(String s);
}

@FunctionalInterface
interface MyLambda3 {
	public int multiply(int x, int y);
}

public class LambdaParams {

	public static void main(String[] args) {
		MyLambda1 m = (a,b) -> {System.out.println("Addition is: " + (a + b));};
		m.add(100, 475);
		
		MyLambda2 m2 = (s) -> {System.out.println(s);};
		m2.display("Hello World");
		
		MyLambda3 m3 = (a,b) -> a * b;
		System.out.println(m3.multiply(45, 68));
	}

}
