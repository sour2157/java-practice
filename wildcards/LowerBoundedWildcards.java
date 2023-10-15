package wildcards;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {

    public static void showAll(List<? super Number> list) {
        for (Object o:list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        //we can create array lists like this
        List<? super Integer> list = new ArrayList<Integer>();
        List<? super Integer> list1 = new ArrayList<Object>();
        List<? super Integer> list2 = new ArrayList<Number>();

        //how to read items using lower bounded wildcards
        List<Serializable> l = new ArrayList<>();
        l.add("adam");
        l.add("eve");
        l.add("ian");
        showAll(l);

        //insert items
        List<? super Number> nums = new ArrayList<>();
        nums.add(3);
        nums.add(3.4);
        nums.add(5.6f);
    }
}
