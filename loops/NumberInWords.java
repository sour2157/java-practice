package loops;

import java.util.Scanner;

public class NumberInWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");	
		int n = s.nextInt();
		int r;
		String num = "";
		
		while (n>0) {
			
			r = n%10;
			n = n/10;
			num = num + r;
		}
		
		char c;
		for (int i=num.length()-1; i>=0; i--) {
			c = num.charAt(i);
			
			switch (c) {
				case '0': System.out.print("Zero ");
						break;
				case '1': System.out.print("One ");
						break;		
				case '2': System.out.print("Two ");
						break;
				case '3': System.out.print("Three ");
						break;
				case '4': System.out.print("Four ");
						break;
				case '5': System.out.print("Five ");
						break;
				case '6': System.out.print("Six ");
						break;
				case '7': System.out.print("Seven ");
						break;
				case '8': System.out.print("Eight ");
						break;
				case '9': System.out.print("Nine ");
						break;
			}
		}
	}

}
