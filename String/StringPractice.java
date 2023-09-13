package String;

public class StringPractice {

	public static void main(String[] args) {
		//ways to create a string
		String str1 = "Java";
		
		String str2 = new String("Java 1");
		
		char c[] = {'a', 'b', 'c', 'd'};
		String str3 = new String(c);
		
		byte b[] = {65, 66, 67};
		String str4 = new String(b);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
