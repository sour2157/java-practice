package collections;

import java.util.List;
import java.util.TreeSet;

class Point implements Comparable{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "x="+x+" y="+y;
	}
	
	public int compareTo(Object o) {
		Point point=(Point)o;
		if(this.x<point.x)
			return -1;
		else if(this.x>point.x)
			return 1;
		else 
			return 0;
	}
	
	
}

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts1 = new TreeSet<>(List.of(10,30,40,60,80));
		
		ts1.add(45);
		
		System.out.println(ts1.ceiling(42));
		
		System.out.println(ts1);
		
		TreeSet<Point> ts=new TreeSet<>();
		
		ts.add(new Point(1, 1));
		ts.add(new Point(2, 3));
		ts.add(new Point(5, 2));
		
		System.out.println(ts);
	}

}
