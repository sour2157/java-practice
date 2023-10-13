package interfaces;

interface Interf {
	public static void name() {
		System.out.println("Inside static method");
	}
}

public class StaticInInterface {

	public static void main(String[] args) {
		Interf.name();

	}

}
