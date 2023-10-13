package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting {

	public static void main(String[] args) {
		Comparator<Integer> c = (a,b) -> (a>b) ? -1 : (a<b) ? 1 : 0;
		
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(12);
		i.add(62);
		i.add(37);
		i.add(89);
		i.add(54);
		i.add(93);
		i.add(28);
		
		System.out.println("Before Sorting - " + i);
		Collections.sort(i, c);
		//one more way to use it
		//Collections.sort(i, (a,b) -> (a>b) ? -1 : (a<b) ? 1 : 0);
		System.out.println("After Sorting - " + i);

	}

}
