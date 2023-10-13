package loops;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		System.out.println("The table of number " + num + " is: ");
		
		for (int i = 1 ; i <= 10; i++) {
			System.out.println(num*i);
		}

	}

}
