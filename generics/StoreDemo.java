package generics;

//class with generic type object to accept all type values
class Store<Object> {
    public Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return this.item;
    }
}

public class StoreDemo {
    public static void main(String[] args) {
        //defining generic type string to while object creation
        Store<String> store = new Store<>();
        //this will give compile time error if other than string object passed
        store.setItem("Hello");
        System.out.println(store.getItem());
    }
}
