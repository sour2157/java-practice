package lambda;

interface Interf2 {
	public int getLength(String a);
}

public class LambdaTest3 {

	public static void main(String[] args) {
		
		Interf2 i = a -> a.length();
		System.out.println(i.getLength("Sourabh Suhas Raje"));

	}

}
