package patterns;

public class Pattern9 {
	public static void main(String[] args) {
		//Output
		//* * * * * 
		//  * * * * 
		//    * * * 
		//      * * 
		//        * 
 
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if (j>=i) {
					System.out.print(("* "));
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
