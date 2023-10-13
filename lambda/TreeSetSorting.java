package lambda;

import java.util.TreeSet;

public class TreeSetSorting {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		
		ts.add(12);
		ts.add(62);
		ts.add(37);
		ts.add(89);
		ts.add(54);
		ts.add(93);
		ts.add(28);
		
		System.out.println("Treeset after custom sorting - " + ts);

	}

}
