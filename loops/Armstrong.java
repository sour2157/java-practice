package loops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		int m = n;
		int r;
		int sum = 0;
		
		while (n>0) {
			
			r = n%10;
			n = n/10;
			
			sum = sum + (r*r*r);
			System.out.println(sum);
		}
		if (sum==m) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a armstrong number");
		}

	}

}
