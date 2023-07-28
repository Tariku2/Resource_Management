package mum.array;

import java.util.Scanner;

public class EvensArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(n);
        while (n != 0) {
            int x = n % 10;
            if (x % 2 != 0){
                System.out.println("Not Evens");

            }
      else {
                n = n / 10;
                System.out.println("They are evens");
            }
    }









        }

    }


