package lambda;

@FunctionalInterface
interface MyLambda6 {
	public void display(String str);
}

public class MethodReferenceDemo {
	
	public static void reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}

	public static void main(String[] args) {
		MyLambda6 m = MethodReferenceDemo::reverse;
		
		m.display("Hello");

	}

}
