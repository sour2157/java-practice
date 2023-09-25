package arrays;

public class MaxElement {

	public static void main(String[] args) {
		int a[] = {12,52,6,2,89,56,21,41,75,36}, max = a[0];
		
		for (int x:a) {
			if (x > max) {
				max = x;
			}
		}
		System.out.println("Max element : " + max);
	}

}
