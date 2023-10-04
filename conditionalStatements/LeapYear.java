package conditionalStatements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a year:");
		
		year = s.nextInt();
		
		if ((year%4==0)) {
			if (year%100==0) {
				if (year%400==0) {
					System.out.println("It's a leap year");
				} else {
					System.out.println("It's not a leap year");
				}
			} else {
				System.out.println("It's a leap year");
			}
		} else {
			System.out.println("It's not a leap year");
		}

	}

}
