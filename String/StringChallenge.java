package String;

public class StringChallenge {

	public static void main(String[] args) {
		String str = "programmer@gmail.com";
		
		System.out.println("Email id is on gmail - " + str.contains("@gmail"));
		
		int ampersend = str.indexOf("@");
		
		System.out.println("username - " + str.substring(0, ampersend));
		System.out.println("domain name - " + str.substring(ampersend+1,str.length()));

	}

}
