package arrays;

public class RightRotation {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		int temp = a[a.length-1];
		
		for (int i=a.length-2; i>=0; i--) {
			a[i+1] = a[i];
		}
		a[0] = temp;
		
		for (int x:a) {
			System.out.print(x + ", ");
		}
	}

}
