package generics;

class Data<T> {
	private T obj;
	
	public void setData(T v) {
		obj = v;
	}
	
	public T getData() {
		return obj;
	}
}
 
public class GenericObjectDemo {

	public static void main(String[] args) {
		Data<String> d = new Data<>();
		d.setData("g");
		System.out.println(d.getData());
	}

}
