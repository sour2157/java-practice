package generics;


class MyArray<T> {
	
	private T a[] = (T[]) new Object[10];
	int length=0;
	
	public void append(T v) {
		a[length++] = v;
	}
	
	public void display() {
		for(int i=0; i<length; i++) {
			System.out.println(a[i]);
		}
	}
	
}

public class GenericArrayDemo {

	public static void main(String[] args) {
		MyArray<Integer> ma = new MyArray<>();
		
		ma.append(10);
		ma.append(20);
		ma.append(30);
		
		ma.display();

	}

}
