package java8.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[]args){
        List<String>gameList=new ArrayList<String>();
        gameList.add("football");
        gameList.add("basket ball");
        gameList.add("chess");
        gameList.add("tennis");
        //System.out.println(".........Passing reference.");
        gameList.forEach(System.out::println);

    }
}
