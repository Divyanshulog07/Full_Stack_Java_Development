package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Pune");
        map.put(2,"Mumbai");
        map.put(3,"Nashik");

        //1st method to print map
        map.forEach((k,v)->{
            System.out.println("Key: "+k+"  Value: "+v);
        });

        //2nd method to print map
        for (Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
