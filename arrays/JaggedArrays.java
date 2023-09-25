package arrays;

public class JaggedArrays {

	public static void main(String[] args) {
		int a[][];
		a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[7];
		a[2] = new int[5];
		
		//first way
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		//second way
		for(int x[]:a) {
			for(int y:x) {
				System.out.print(y + " ");
			}
			System.out.println("\n");
		}
	}

}
