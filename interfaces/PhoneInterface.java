package interfaces;

class Phone {
	void call() {
		System.out.println("Calling");
	}
	
	void sms() {
		System.out.println("Sending SMS");
	}
}

interface ICamera {
	void click();
	void record();
}

interface IMusicPlayer {
	void play();
	void pause();
	void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
	void videoCall() {
		System.out.println("Videocalling");
	}
	
	public void click() {
		System.out.println("Clicking the camera button");
	}
	
	public void record() {
		System.out.println("Recording video");
	}
	
	public void play() {
		System.out.println("Playing music");
	}
	
	public void pause() {
		System.out.println("Music paused");
	}
	
	public void stop() {
		System.out.println("Music stopped");
	}
}

public class PhoneInterface {

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		Phone p = s;
		ICamera c = s;
		IMusicPlayer m = s;
		
		s.call();
		p.call();
		s.sms();
		p.sms();
		
		s.click();
		c.click();
		
		s.play();
		m.play();
		
	}

}
