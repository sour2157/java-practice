package lambda;

@FunctionalInterface
interface MyLambda {
	public void display();
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		//Lambda Implementation
		
		MyLambda m = () -> {System.out.println("Hello World");};
		
		//normal way to create class which acts as object
		//and which will override the single method from the interface
//		MyLambda m = new MyLambda() {
//			
//			@Override
//			public void display() {
//				System.out.println("Hello World");
//			}
//		};
		m.display();

	}

}
