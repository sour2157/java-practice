package Arithmetic;

public class IncDec {

	public static void main(String[] args) {
		int x=5,y,z;
		
		y = x++; //post increment first y=x then x++
		z = ++x; //pre increment first x++ then z=x
		
		System.out.println(x + " " + y);
		System.out.println(x + " " + z);

	}

}
