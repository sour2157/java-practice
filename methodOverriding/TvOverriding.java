package methodOverriding;

class Tv {
	public void switchOn() {
		System.out.println("TV switched on");
	}
	
	public void changeChannel() {
		System.out.println("TV channel is changed");
	}
}

class SmartTv extends Tv {
	public void switchOn() {
		System.out.println("Smart TV switched on");
	}
	
	public void changeChannel() {
		System.out.println("Smart TV channel is changed");
	}
	
	public void browse() {
		System.out.println("Smart Tv browsing");
	}
}

public class TvOverriding {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		smartTv.switchOn();
		smartTv.changeChannel();
		smartTv.browse();
		
		//dynamic method dispatch
		Tv tv1 = new SmartTv();
		tv1.changeChannel();
		tv1.switchOn();

	}

}
