package arrays;

public class Sum {

	public static void main(String[] args) {
		int a[] = {1,8,4,9,21,75,36,41,7}, sum=0;
		
		for (int x:a) {
			sum = sum + x;
		}
		System.out.println("Sum is: " + sum);
	}

}
