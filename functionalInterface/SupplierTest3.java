package functionalInterface;

import java.util.function.Supplier;

//program to generate 6 digit random otp

public class SupplierTest3 {

	public static void main(String[] args) {
		//math random generates a number between 0 and 1 i.e. 0.999 maximum
		//so to get a proper number between 0 to 9 we have multiplied by 10
		//and type casted it as int to get proper integer value and not float
		Supplier<String> s = () -> {
			String otp = "";
			
			for (int i = 0; i < 6; i++) {
				otp = otp + (int)(Math.random() * 10);
			}
			return otp;
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
