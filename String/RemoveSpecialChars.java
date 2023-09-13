package String;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		String str = "a!B@c#D$1%2";
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "")); //remove special characters
		
		String str2 = "asc   rscv  ttvb";
		
		System.out.println(str2.replaceAll("\\s", "")); //remove extra spaces
		
		String str3 = "aasd123hjd634va";
		
		System.out.println(str3.replaceAll("[^0-9]", "")); //get numbers from string

	}

}
