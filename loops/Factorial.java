package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long fact = 1;
		System.out.println("Enter a number to get its factorial: ");
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial is : " + fact);

	}

}
