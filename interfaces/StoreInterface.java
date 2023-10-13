package interfaces;

interface Member {
	void callback();
}

class Store {
	//array object of reference type member
	Member m[] = new Member[10];
	int count = 0;
	
	void register(Member m) {
		this.m[count++] = m;
	}
	
	void inviteSale() {
		for (int i = 0; i < count; i++) {
			m[i].callback();
		}
	}
}

class Customer implements Member {
	String name;
	
	public Customer(String n) {
		name = n;
	}
	
	public void callback() {
		System.out.println("Okay I will visit, " + name);
	}
}

public class StoreInterface {

	public static void main(String[] args) {
		Store store = new Store();
		Customer c1 = new Customer("Sourabh");
		Customer c2 = new Customer("John");
		
		store.register(c1);
		store.register(c2);
		
		store.inviteSale();
	}

}
