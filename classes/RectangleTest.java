package classes;

class Rectangle {
	
	public double length;
	public double breadth;
	
	public double area() {
		return length * breadth;
	}
	
	public double perimeter() {
		return 2 * (length+breadth);
	}
	
	public boolean isSquare() {
		return length == breadth;
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r.length = 34;
		r.breadth = 25;
		
		r2.length = 10;
		r2.breadth = 10;
		
		System.out.println(r.area());
		System.out.println(r.perimeter());
		System.out.println(r.isSquare());
		
		System.out.println(r2.area());
		System.out.println(r2.perimeter());
		System.out.println(r2.isSquare());

	}

}
