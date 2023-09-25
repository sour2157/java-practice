package arrays;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		String s[] = {"java", "python", "ruby", "javascript", "c", "perl", "ada", "basic"};

		java.util.Arrays.sort(s);
		
		for(String x:s) {
			System.out.println(x);
		}
	}

}
