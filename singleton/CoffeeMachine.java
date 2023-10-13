package singleton;

class Setup {
	private float coffeQty;
	private float milkQty;
	private float waterQty;
	private float sugarQty;
	
	static private Setup cm = null;
	
	private Setup() {
		coffeQty=1;
		milkQty=1;
		waterQty=1;
		sugarQty=1;
	}
	
	public void fillWater(float qty) {
		waterQty = qty;
	}
	
	public void fillSugar(float qty) {
		sugarQty = qty;
	}
	
	public float getCoffee() {
		return 0.23f;
	}
	
	static Setup getInstance() {
		if(cm == null) {
			cm = new Setup();
		}
		return cm;
	}
}

public class CoffeeMachine {

	public static void main(String[] args) {
		Setup s1 = Setup.getInstance();
		Setup s2 = Setup.getInstance();
		Setup s3 = Setup.getInstance();
		
		System.out.println(s1 + " " + s2 + " " + s3);
		if (s1 == s2 && s2 == s3) {
			System.out.println("Same");
		}
	}

}
