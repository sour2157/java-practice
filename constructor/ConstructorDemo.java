package constructor;

class Rectangle {
	
	private double length;
	private double breadth;
	
	public Rectangle() {
		length = 1;
		breadth = 1;
	}
	
	public Rectangle(double l, double b) {
		length = l;
		breadth = b;
	}
	
	public double area() {
		return length * breadth;
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(13, 20);
		
		System.out.println(r.area());
		System.out.println(r1.area());

	}

}
