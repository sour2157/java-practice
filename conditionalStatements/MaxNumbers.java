	package conditionalStatements;

public class MaxNumbers {

	public static void main(String[] args) {
		int a = 14, b = 15, c = 17;
		// simple program for nested if else
		if (a > b && a > c) {
			System.out.println("A is maximum");
		} else if (b > c) {
			System.out.println("B is maximum");
		} else {
			System.out.println("C is maximum");
		}

	}

}
