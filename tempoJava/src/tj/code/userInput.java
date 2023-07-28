package tj.code;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The User name");
        String name=sc.nextLine();
        System.out.println("User name is: "+name);
        System.out.println("please enter your age also");
        int age= sc.nextInt();
        System.out.println("age is :"+age);
    }
}
