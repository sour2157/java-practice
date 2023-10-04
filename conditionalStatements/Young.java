package conditionalStatements;

import java.util.Scanner;

public class Young {

	public static void main(String[] args) {
		int age;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter your age:");
		
		age = s.nextInt();
		
		if (age >= 14 && age <= 55) {
			System.out.println("You are young");
		} else {
			System.out.println("You are not young");
		}

	}

}
