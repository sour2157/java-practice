package loops;

import java.util.Scanner;

public class ArithmeticProgression {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a starting number : ");	
		int n = s.nextInt();
		
		System.out.println("Enter common difference : ");
		int d = s.nextInt();
		
		System.out.println("Enter number of terms : ");
		int t = s.nextInt();
		
		int term = n;
		for(int i = 0; i < t; i++) {
			System.out.print(term+",");
			term = term + d;
		}
	}

}
