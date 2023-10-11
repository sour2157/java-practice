package functionalInterface;

import java.util.Date;
import java.util.function.Supplier;

//program to use supplier interface to get current system date

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date();
		
		System.out.println(s.get());

	}

}
