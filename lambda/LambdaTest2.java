package lambda;

interface Interf1 {
	public void add(int a, int b);
}

public class LambdaTest2 {

	public static void main(String[] args) {
		Interf1 i = (a,b) -> System.out.println("Sum is - " + (a+b));
		i.add(125, 186);

	}

}
