package wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardsDemo1 {
    public static void  print(List<?> list) {
        for (Object o:list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Adam", "Kevin", "Joe");
        print(list);
    }
}
