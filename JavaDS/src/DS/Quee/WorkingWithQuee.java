package DS.Quee;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQuee {
    public static void main(String[] args) {
        Queue<person> taxi=new LinkedList<>();
        taxi.add(new person("Alex",23));
        taxi.add(new person("John",30));
        taxi.add(new person("Merry",31));
        taxi.add(new person("Dave",42));
        System.out.println(taxi);
        //check the size
        System.out.println(taxi.size());
        //To check that who added first to the queue

        System.out.println(taxi.peek());
        System.out.println(taxi.poll());

        //check the size after the one person is left the queue

        System.out.println(taxi.size());
    }
    static record person(String name,int age){

    }
}
