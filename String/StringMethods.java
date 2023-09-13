package String;

public class StringMethods {

	public static void main(String[] args) {
		String str = "hello";
		
		char str1[]  = str.toCharArray();
		
		int str2 = str.length();
		
		String str3 = str.toUpperCase();
		
		String str4 = str.substring(1);
		
		boolean str5 = str.startsWith("H");
		
		String str6 = str.replace("h", "Y");
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str.equals(str6));
		System.out.println(str.compareTo(str6));
		
		//regular expressions
		System.out.println(str.matches("hello"));
		System.out.println(str.matches("\\w"));
		
		System.out.println(str.matches(".*"));
		System.out.println(str.matches("[helo]+"));

	}

}
