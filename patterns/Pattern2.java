package patterns;

public class Pattern2 {
	public static void main(String[] args) {
		//Output
		//1 1 1 1 1
		//2 2 2 2 2
		//3 3 3 3 3
		//4 4 4 4 4
		//5 5 5 5 5
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
