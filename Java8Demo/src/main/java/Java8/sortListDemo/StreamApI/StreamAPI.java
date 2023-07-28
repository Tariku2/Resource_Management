package Java8.sortListDemo.StreamApI;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> values=new ArrayList<Integer>();
        for(int i=0; i<=100; i++){
            values.add(i);


        }
        for(int i:values);{
            System.out.println(values);
        }
    }

}
