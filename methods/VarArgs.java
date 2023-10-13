package methods;

public class VarArgs {
	
	static void show (int ...a) {
		for (int x:a) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		show();
		show(1,2,5,3,42,5);
		//passing anonymous array
		show(new int[] {1,2,5,3,4});

	}

}
