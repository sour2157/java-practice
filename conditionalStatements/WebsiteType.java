package conditionalStatements;

import java.util.Scanner;

public class WebsiteType {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter domain name : ");
		
		String domain = s.nextLine();
		
		String ext = domain.substring(domain.lastIndexOf(".")+1);
		
		switch (ext) {
		case "com": System.out.println("Commercial");
			break;
		case "org": System.out.println("Organization");
			break;
		case "biz": System.out.println("Business");
			break;
		case "gov": System.out.println("Government");
			break;
		case "net": System.out.println("Network");
			break;
		default: System.out.println("Domain not found");
			break;
		}

	}

}
