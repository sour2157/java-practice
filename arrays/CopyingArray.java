package arrays;

public class CopyingArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10}, b[] = new int[10];
		
		for (int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		
		for (int x:b) {
			System.out.print(x + ", ");
		}
	}

}
