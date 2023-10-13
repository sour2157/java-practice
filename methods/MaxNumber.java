package methods;

public class MaxNumber {
	
	//method defined as static to be able to called in main method
	static int max(int x, int y) {
		if (x>y) {
			return x;
		} else {
			return y;
		}
	}
	
	int min (int x, int y) {
		if (x<y) {
			return x;
		} else {
			return y;
		}
	}

	public static void main(String[] args) {
		int a=10, b=15, c;
		
		//one way of calling method
		c = max(a,b);
		System.out.println(c);
		
		//another way of calling method
		MaxNumber mn = new MaxNumber();
		System.out.println(mn.min(a, b));

	}

}
