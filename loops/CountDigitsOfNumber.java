package loops;

import java.util.Scanner;

public class CountDigitsOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		
		int r, counter = 0;
		
		while (n>0) {
			
			n = n/10;
			
			counter++;
		}
		
		System.out.println(counter);

	}

}
