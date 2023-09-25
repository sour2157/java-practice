package arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		int a[][] = {{1,2,3}, {2,4,6}, {3,5,7}};
		
		//first way
		for (int i=0; i < a.length; i++) {
			for (int j=0; j< a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		//second way
		for (int x[]: a) {
			for (int y : x) {
				System.out.print(y);
			}
			System.out.println("\n");
		}

	}

}
