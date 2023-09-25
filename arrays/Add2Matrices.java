package arrays;

public class Add2Matrices {

	public static void main(String[] args) {
		int a[][] = {{2,3,4}, {8,6,4}, {12,43,21}};
		int b[][] = {{23,4,26}, {2,56,34}, {76,21,45}};
		int c[][] = new int[3][3];
		
		for(int i=0; i<a.length; i++ ) {
			for(int j=0; j<b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
