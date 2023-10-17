package collections;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayOptimized {

    public static List<Integer> reverse(List<Integer> list) {
        for (int i=0, mid=list.size()/2, j=list.size()-1; i<mid; i++, j--) {
            int num1 = list.get(i);
            int num2 = list.get(j);

            list.set(i, num2);
            list.set(j, num1);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("reversed list - " + reverse(list));
    }
}
