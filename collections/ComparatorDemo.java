package collections;

import java.util.Arrays;
import java.util.Comparator;

class My implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		if (i1<i2) {
			return 1;
		} if (i1>i2) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		Integer a[]= {2,6,7,3,9,1,5};
		int b[]= {2,3,4,5,6};
		
		//returns same 0, a> 1, b> -1
		//System.out.println(Arrays.compare(a, b));
		
		int c[] = Arrays.copyOf(b, 4);
		Arrays.fill(c, 10);
		for (int i : c) {
			System.out.println(i);
		}
		
		Arrays.sort(a, new My());
		
		for (int i : a) {
			System.out.println(i);
		}

	}

}
