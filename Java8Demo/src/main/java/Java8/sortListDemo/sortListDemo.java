package Java8.sortListDemo;

import com.sun.jdi.connect.Connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortListDemo {
    public static void main(String[]args){
        List<String>list=new ArrayList<String>();
        list.add("Brno");
        list.add("Prague");
        list.add("Frankfurt");
        list.add("Veinna");
        /*Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);

         */
        //Asending order
        //list.stream().sorted().forEach(s->System.out.println(s));
        //reverse order
        list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));


    }
}
