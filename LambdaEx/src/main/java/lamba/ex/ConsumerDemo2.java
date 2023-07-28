package lamba.ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo2 {




    public  static  void main(String[]args){

     //   Consumer<Integer>consumer=(integer) ->
      //      System.out.println("The result is "+integer);
//consumer.accept(2000);
List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7);
list1.stream().forEach(((integer) ->
        System.out.println("The result is "+integer)));

        }
}
