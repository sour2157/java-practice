package wrapperClass;

public class WrapperDemo {

	public static void main(String[] args) {
		int m = 15;
		
		Integer m2 = m;
		
		System.out.println(m2.hashCode());
		System.out.println(m2.toString());
		System.out.println(m2.decode("0xA7"));
		
		System.out.println(m2.parseInt("123"));
		System.out.println(m2);

	}

}
