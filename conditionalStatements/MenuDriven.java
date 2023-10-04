package conditionalStatements;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		float num1, num2;
		
		System.out.println("Menu is: " +
				"1.Add " +
				"2.Sub " +
				"3.Mul " +
				"4.Div");
		System.out.println("Enter 2 numbers : ");
		
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextFloat();
		num2 = s.nextFloat();
		s.nextLine();
		
		System.out.println("Enter option from menu in words : ");
		
		String option = s.nextLine();
		
		switch (option) {
		case "Add": System.out.println("Addition is: " + (num1 + num2));
			break;
		case "Sub": System.out.println("Substraction is: " + (num1 - num2));
			break;
		case "Mul": System.out.println("Multiplication is: " + (num1 * num2));
			break;
		case "Div": System.out.println("Division is: " + (num1 / num2));
			break;
		default: System.out.println("Invalid Option");
			break;
		}

	}

}
