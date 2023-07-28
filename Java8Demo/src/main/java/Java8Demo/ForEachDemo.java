package Java8Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ForEachDemo {
    //filter method for conditional check
    public static void main(String[]args){
        List<String>list=new ArrayList<>();
        list.add("Tariku");
        list.add("Enoch");
        list.add("Tinsae");
        list.add("Kwabena");
        list.add("Sandesh");
        //iteration and conditional check in traditional way

        /*for (String s:list){
        if(s.startsWith("T")){
        System.out.println(s);

        }}

         */



        list.stream().filter((t)->t.startsWith("t")).forEach(t->
           System.out.println(t));
        Map<Integer,String> mp=new HashMap<>();
        mp.put(1,"Tariku");
        mp.put(2,"Enoch");
        mp.put(3,"Tinsae");
        mp.put(4,"Eyob");
       /* mp.forEach((key,value)->System.out.println(key+":"+value));

        */
        mp.entrySet().stream().filter(k->k.getValue().startsWith("T")).forEach(d->System.out.println(d));


       /* Consumer<String>consumer=( t)->System.out.println(t);
        consumer.accept("Name of Students of Mendelu");

        */

        Stream.iterate(0, n -> n + 1)
                .limit(10)
                .forEach(x -> System.out.println(x));




    }
}
