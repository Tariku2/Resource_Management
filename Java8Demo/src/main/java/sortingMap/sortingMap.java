package sortingMap;

import java.util.*;

public class sortingMap {
    public static void main(String[]args){
        Map< String,Integer>mp=new HashMap<>();
        mp.put("Brno",1);
        mp.put("Prague",2);
        mp.put("Olomouc",3);
        mp.put("Plzeni",4);
        mp.put("Ostrava",5);
        List<Map.Entry<String,Integer>>entries=new ArrayList<>(mp.entrySet());
       /* Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        */
        for (Map.Entry<String,Integer>entry:entries){
            System.out.println(entry.getKey()+""+entry.getValue());

        }
        //Using lambda Expression

        Collections.sort(entries,  ( o1, o2)->
                o1.getKey().compareTo(o2.getKey()));
mp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);


    }
}
