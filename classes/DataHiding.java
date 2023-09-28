package classes;

class RectangleOne {
	
	private double length;
	private double breadth;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
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

public class DataHiding {

	public static void main(String[] args) {
		
		RectangleOne r = new RectangleOne();
		RectangleOne r2 = new RectangleOne();
		
		r.setLength(34);
		r.setBreadth(25);
		
		r2.setLength(10.5);
		r2.setBreadth(10.5);
		
		System.out.println(r.area());
		System.out.println(r.perimeter());
		System.out.println(r.isSquare());
		
		System.out.println(r2.area());
		System.out.println(r2.perimeter());
		System.out.println(r2.isSquare());

	}

}
