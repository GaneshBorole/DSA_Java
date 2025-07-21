package Hashing;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer>hm= new HashMap<>();
        //inset O(1)
        hm.put("India",125);
        hm.put("china", 150);
        hm.put("us", 50);
        hm.put("Nepal", 5);
        System.out.println(hm);
       
        //Get O(1)
        int population=hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("pak"));

        //conatinsKey O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("australia"));

        //remove O(1)
      //  System.out.println(hm.remove("India"));
        //System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Iteration on Hashmap
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = "+k+" , value = "+hm.get(k));
            
        }

    }
}
