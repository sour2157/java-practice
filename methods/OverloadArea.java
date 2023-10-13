package methods;

public class OverloadArea {
	
	static double area (double l, double b) {
		return l*b;
	}
	
	static double area (double r) {
		return Math.PI*r*r;
	}

	public static void main(String[] args) {
		System.out.println("Area of square: " + area(12, 56));
		System.out.println("Area of circle: " + area(23));

	}

}
