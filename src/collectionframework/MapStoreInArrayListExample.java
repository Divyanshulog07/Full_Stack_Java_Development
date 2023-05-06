package collectionframework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStoreInArrayListExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Pune");
        map.put(2,"Mumbai");
        map.put(3,"Nashik");

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Ritik");
        map1.put(2,"Amey");
        map1.put(3,"Aayush");

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"Mahad");
        map2.put(2,"Kanthali");
        map2.put(3,"Wardha");

        List<Map<Integer,String>> list = Arrays.asList(map,map1,map2);
        list.forEach(s->{
            s.forEach((k,v)->{
                System.out.println("Key: "+k+"  Value: "+v);
            });
        });
    }
}
