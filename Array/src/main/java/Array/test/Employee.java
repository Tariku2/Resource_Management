package Array.test;

import java.util.Scanner;

public class Employee {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your name,age and Salary");
        String  name=sc.next();
        int age=sc.nextInt();
        float salary=sc.nextFloat();
        System.out.println("your name is"+name);
        System.out.println("your age is"+age);
        System.out.println("your salary is"+salary+"Welcome gash "+name);
    }
}
