package loops;

import java.util.Scanner;

public class DigitsOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		
		int r;
		
		while (n>0) {
			
			r = n%10;
			n = n/10;
			
			System.out.println(r);
		}

	}

}
