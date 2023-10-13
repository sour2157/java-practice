package innerClasses;

class Outer3 {
	int x = 10;
	static int y = 20;
	
	static class Inner {
		public void show() {
			System.out.println(y);
		}
	}
}

public class StaticInnerDemo {

	public static void main(String[] args) {
		Outer3.Inner i = new Outer3.Inner();
		i.show();

	}

}
