package lambda;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapSorting {

	public static void main(String[] args) {
		TreeMap<Integer, String> ts = new TreeMap<Integer, String>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		
		ts.put(23, "a");
		ts.put(56, "dsf");
		ts.put(67, "dsa");
		ts.put(78, "yt");
		ts.put(33, "fgda");
		ts.put(59, "afdg");
		ts.put(99, "dsf");
		
		System.out.println("Treeset after custom sorting - " + ts);

	}

}
