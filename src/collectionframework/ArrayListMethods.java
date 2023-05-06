package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        List<Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);

        System.out.println(list1.get(1));
        System.out.println(list1.contains(10));
        System.out.println(list1.hashCode());
        System.out.println(list1.indexOf(30));
        System.out.println(list1.isEmpty());
        System.out.println(list1.subList(1,4));

        list1.clear();
    }
}
