package conditionalStatements;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		int m1, m2, m3, total;
		float avg;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your marks in maths, science, english:");
		
		m1 = s.nextInt();
		m2 = s.nextInt();
		m3 = s.nextInt();
		
		total = m1 + m2 + m3;
		avg = total / 3f;
		
		System.out.println("your total is : " + total);
		System.out.println("your average is : " + avg);
		
		if (avg >= 70) {
			System.out.println("Your grade is A");
		} else if (avg < 70 && avg >= 60) {
			System.out.println("Your grade is B");
		} else if (avg < 60 && avg >= 50) {
			System.out.println("Your grade is C");
		} else if (avg < 50 && avg >= 40) {
			System.out.println("Your grade is D");
		} else {
			System.out.println("Your grade is E");
		}

	}

}
