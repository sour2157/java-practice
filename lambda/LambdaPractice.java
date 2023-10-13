package lambda;


@FunctionalInterface
interface MyLambda4 {
	public void display();
}

@FunctionalInterface
interface MyLambda5 {
	public void display();
}

class UseLambda {
	public void callLambda(MyLambda5 m) {
		m.display();
	}
}

class Demo {
	
	int z = 10;
	
	public void method1() {
		
		int x = 1;
		
		MyLambda4 m4 = () -> {
			int a=9;
			System.out.println("Hello");
			System.out.println(a);
			System.out.println(x);
			System.out.println(++z);
		};
		m4.display();
	}
	
	public void method2() {
		UseLambda u = new UseLambda();
		u.callLambda(() -> {System.out.println("Hello");});
	}
}

public class LambdaPractice {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.method1();
		d.method2();

	}

}
