package functionalInterface;

import java.util.Scanner;
import java.util.function.Predicate;

//program to get user details as input and validate username and pwd of user using predicate

class User {
	String userName;
	String pwd;
	
	public User(String userName, String pwd) {
		this.userName = userName;
		this.pwd = pwd;
	}
	
}

public class PredicateTest6 {

	public static void main(String[] args) {
		Predicate<User> p = user -> user.userName.equals("Sourabh") && user.pwd.equals("java");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter user name - ");
		String userName = scanner.next();
		
		System.out.println("Enter password - ");
		String password = scanner.next();
		
		User user = new User(userName, password);
		
		if (p.test(user)) {
			System.out.println("Welcome, you are valid user.");
		} else {
			System.out.println("Invalid user.");
		}
	}

}
