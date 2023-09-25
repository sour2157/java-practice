package arrays;

public class BasicForLoop {

	public static void main(String[] args) {
		int A[] = new int[5];
		
		int b[] = {1,2,3,4,5};
		
		//basic for loop
		for (int i=0; i<A.length; i++) {
			System.out.println(A[i]);
		}
		
		System.out.println();
		
		//for each loop
		for (int x : b) {
			System.out.println(x);
		}
		
	}

}
