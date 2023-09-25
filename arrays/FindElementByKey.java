package arrays;

import java.util.Scanner;

public class FindElementByKey {

	public static void main(String[] args) {
		int a[] = {1,8,4,9,21,75,36,41,7};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the key : ");
		
		int key = s.nextInt();
		
		for (int i=0; i<a.length; i++) {
			if (key == i) {
				System.out.println("Element is : " + a[i]);
				System.exit(0); //program exits from here itself instead of completing
			}
		}
		System.out.println("Not found");
	}

}
