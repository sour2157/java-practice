package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Adam");
        list.add("Mark");
        list.add("Bob");
        list.add("Justin");

        //sorts in ascending order by default
        Collections.sort(list);

        //sorts in descending order
        list.sort(Collections.reverseOrder());

        for (String m:list) {
            System.out.println(m);
        }
    }
}
