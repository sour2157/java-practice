package inheritance;

class CellPhone {
	
	private String phoneNo;
	private String imei;

	public CellPhone(String phoneno, String imei) {
		this.phoneNo = phoneno;
		this.imei = imei;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getImei() {
		return imei;
	}
	
	public String call() {
		return "Calling";
	}
	
	public String sms() {
		return "Sending SMS";
	}
	
	public String saveContact() {
		return "Saving contact";
	}
}

class SmartPhone extends CellPhone {

	public SmartPhone(String phoneno, String imei) {
		super(phoneno, imei);
	}

	public String mac;
	
	public String getMac() {
		return mac;
	}
	
	public String play() {
		return "Playing music";
	}
	
	public String capture() {
		return "Capturing photo";
	}
}

public class Phone {
	public static void main(String[] args) {

		SmartPhone s = new SmartPhone("9595642236", "ABCG643245BCHH");
		System.out.println(s.getImei());
		System.out.println(s.call());
		System.out.println(s.getPhoneNo());
		System.out.println(s.play());
	}
}
