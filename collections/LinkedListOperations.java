package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        //adds to the end of linked list O(N)
        list.add(1);
        //adds to the beginning of the list O(1)
        list.addFirst(12);
        //removes first item O(1)
        list.removeFirst();
        //removes last item O(1)
        list.removeLast();

        for (Integer num:list) {
            System.out.println(num);
        }
    }
}
