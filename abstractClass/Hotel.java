package abstractClass;

abstract class Kfc {
	
	int ingredients;
	
	public Kfc(int ingredients) {
		this.ingredients = ingredients;
	}
	
	void makeItem() {
		System.out.println("Got KFC Recepie that has " + ingredients + " ingredients");
	}
	
	abstract void billing();
	abstract void offer();
}

class MyKfc extends Kfc {
	
	public MyKfc(int ingredients) {
		super(ingredients);
	}
	
	public void billing() {
		System.out.println("Implemented my kfc billing");
	}
	
	public void offer() {
		System.out.println("Implemented my offers");
	}
}

public class Hotel {

	public static void main(String[] args) {
		Kfc k1;
		Kfc kfc = new MyKfc(10);
		kfc.makeItem();
		kfc.billing();
		kfc.offer();

	}

}
