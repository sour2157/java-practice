package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int a[] = {12,52,6,2,89,56,21,41,75,36}, max1 = a[0], max2 = a[0];

		for (int x:a) {
			if (x > max1) {
				max2 = max1;;
				max1 = x;
			} else if (x > max2) {
				max2 = x;
			}
		}
		System.out.println("Second largest element : " + max2);

	}

}
