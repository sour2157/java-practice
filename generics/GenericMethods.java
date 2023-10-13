package generics;

//program to display use of generic method

public class GenericMethods {

    static<T> T genericMethod(T t) {
        return t;
    }

    public static void main(String[] args) {
        System.out.println( "The item is : " + genericMethod("Hello") );
        System.out.println( "The item is : " + genericMethod("World") );
    }
}
