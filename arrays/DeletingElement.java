package arrays;

import java.util.Scanner;

public class DeletingElement {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("enter index of element to be deleted : ");
		Scanner s = new Scanner(System.in);
		
		int index = s.nextInt();
		
		for (int i=index; i<a.length-2; i++) {
			a[i] = a[i+1];
		}
		
		for (int x:a) {
			System.out.print(x + ", ");
		}
	}

}
