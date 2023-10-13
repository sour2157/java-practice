package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		int m = n;
		int rev = 0, r;
		
		while (n>0) {
			
			r = n%10; // 151%10 = 1 // 15%10 = 5 // 1%10 = 1
			rev = (rev * 10) + r;  //0 *10 = 0, 0 + 1 = 1 // 1*10 = 10, 10+5 = 15 // 15*10=150, 150+1=151
			n = n/10; // 151/10 = 15 // 15/10 = 1 // 1/10 = 0
		}
		if (rev == m) {
			System.out.println("The number is Palindrome");
		} else {
			System.out.println("The number is not a Palindrome");
		}
	}

}
