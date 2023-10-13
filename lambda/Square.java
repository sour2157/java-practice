package lambda;

interface Interf3 {
	public int squareIt(int x);
}

public class Square {

	public static void main(String[] args) {
		
		Interf3 i = x -> x * x;
		System.out.println(i.squareIt(98));
		System.out.println(i.squareIt(123));

	}

}
