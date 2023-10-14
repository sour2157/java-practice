package generics;

//program to count things greater than thing passed as paramter and return count
public class GenericCounterWithBounds {

    public static  <T extends  Comparable<T>> int countGreaterItems(T[] items, T item) {
        int counter = 0;

        for (T t:items) {
            if (t.compareTo(item) > 0) {
                ++counter;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,6,5,4,7,3};
        int count = countGreaterItems(arr, 2 );
        System.out.println(count);
    }
}
