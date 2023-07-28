package Java8.sortListDemo.ternaryOPerator;

import java.util.Scanner;

public class ternaryOPerator {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();

        int b=scan.nextInt();
        int res=scan.nextInt();


      //  int max=scan.nextInt();
scan.close();
        /*System.out.println("The first number is"+a);
        System.out.println("The second number is"+b);

        max=(a>b)?a:b;
        System.out.println("The Maximum number is"+max);

         */
        System.out.println("The first number is"+a);
        System.out.println("The second number is"+b);
        res=(a>b)?(a+b):(a-b);
        System.out.println("The result is"+res);



    }
}
