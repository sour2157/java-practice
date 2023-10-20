package collections;

import java.util.ArrayList;
import java.util.LinkedList;


// adding elements at the start for both
//for adding at last both are fast
public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        long now = System.currentTimeMillis();

        for(int i=0; i<500000; ++i) {
           arrayList.add(0, i);
        }

        System.out.println("Time take for Arraylist: " + (System.currentTimeMillis() - now));

        LinkedList<Integer> linkedList = new LinkedList<>();

        now = System.currentTimeMillis();

        for (int i=0; i<500000; ++i) {
            linkedList.addFirst(i);
        }

        System.out.println("Time take for Linkedlist: " + (System.currentTimeMillis() - now));
    }
}
