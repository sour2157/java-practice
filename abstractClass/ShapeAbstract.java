package abstractClass;

abstract class Shape {
	abstract double perimeter();
	abstract double area();
}

class Circle extends Shape {
	double radius;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	double length, breadth;
	
	public Rectangle(double l, double b) {
		this.length = l;
		this.breadth = b;
	}
	
	public double perimeter() {
		return 2 * (length+breadth);
	}
	
	public double area() {
		return length*breadth;
	}
}

public class ShapeAbstract {

	public static void main(String[] args) {
		Shape c = new Circle(12);
		System.out.println(c.area());
		System.out.println(c.perimeter());
		
		Shape r = new Rectangle(12, 13);
		System.out.println(r.area());
		System.out.println(r.perimeter());
	}
}
