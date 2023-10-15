package wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
    public static void showAll(List<? extends Number> l) {
        for (Number n:l) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        //We can create arraylist like this
        List<? extends Number> list = new ArrayList<>();
        List<? extends Number> list1 = new ArrayList<Double>();
        List<? extends Number> list2 = new ArrayList<Float>();

        //we use upper bounded wildcards to read items
        showAll(Arrays.asList(1,2,3,4,5));

        //we cannot add items using upper bounded wildcards
        //list.add(20);
        //list1.add(20.0);
    }
}
