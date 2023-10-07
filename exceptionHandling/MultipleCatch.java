package exceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		int A[]= {10,20,30,40,50};
		
		try {
			int c=A[0]/A[4];
			System.out.println("Division is " + c);
			
			System.out.println(A[5]);
		} catch (ArithmeticException e) {
			System.out.println("Denominator should not be 0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is invalid");
		}
		
		System.out.println("Bye");

	}

}
