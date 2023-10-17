package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {
    public static void main(String[] args) {
        //this by default creates array of size 10, we should define size at the time of instantiation
        //or else O(N) time complexity will be required to resize array
        List<String> names = new ArrayList<>();
        names.add("Rohan");
        names.add("Sohan");
        names.add("Mohan");

        //randon indexing is O(1)
        System.out.println(names.get(0));

        //adding or removing item into a given index O(N)
        //will shift existing items to accomodate new item
        names.add(0, "Bohan");
        names.remove(0);
        System.out.println(names.size());

        //ArrayList (ARRAYS) are fast if we manipulate the last item - O(1)
        names.add("Yohan");

        //transform a data structure to 1D array
        Object[] o = names.toArray();

        //contains will check whether item is present in array
        System.out.println(names.contains("Rohan"));

        for (Object o1:names) {
            System.out.println(o1);
        }
    }
}
