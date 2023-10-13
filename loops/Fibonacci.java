package loops;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of terms : ");
		int t = s.nextInt();
		int a=0, b=1;
		int term = a;
		
		System.out.print(a + " ," + b + " ,");
		for(int i = 0; i < t-2; i++) {
			term = a+b;
			a = b;
			b = term;
			System.out.print(term+" ,");
		}
	}

}
