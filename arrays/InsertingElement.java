package arrays;

public class InsertingElement {

	public static void main(String[] args) {
		int a[] = new int[6];
		int index = 3;
		a[0]=5;
		a[1]=10;
		a[2]=34;
		
		int x = 15, newIndex=2;
		
		for (int i=index; i>newIndex; i--) {
			a[i] = a[i-1];
		}
		a[newIndex] = x;
		
		for (int y:a) {
			System.out.print(y + ", ");
		}

	}

}
