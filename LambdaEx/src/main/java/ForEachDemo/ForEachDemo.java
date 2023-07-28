package ForEachDemo;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[]args){
        List<String>list=new ArrayList<>();
        list.add("Plzen");
        list.add("Brno");
        list.add("Prague");
        list.add("Paris");
        list.add("Veina");
        list.add("Frankfurt");
        //traditional way
       // for (String s:list){
        //    if (s.startsWith("m"));
        //    System.out.println(s);

        //}
        //New one


        list.stream().filter(t->t.startsWith("p")).forEach(t->System.out.println(t));
    }
}
