package functionalInterface;

import java.util.function.Supplier;

//program to test supplier to supply random name

public class SupplierTest2 {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String[] s1 = {"Sunny", "Bunny", "Chinny", "Vinny"};
			//math random generates a number between 0 and 1 i.e. 0.999 maximum
			//so to get a proper number between 0 to 3 we have multiplied by 4
			//and type casted it as int to get proper integer value and not float
			int x = (int) (Math.random() * 4);
			return s1[x];
 		};
 		
 		System.out.println(s.get());
 		System.out.println(s.get());
 		System.out.println(s.get());
 		System.out.println(s.get());
 		System.out.println(s.get());

	}

}
