package JavaStdin.out;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();


        // Write your code here.
        Double d=scan.nextDouble();
        String s=scan.next();
        s = scan.nextLine();
        scan.close();
        FileReader fr=new FileReader("C:/Users/lenovo/OneDrive/Desktop/Cryptology/hello.txt");
        BufferedReader br=new BufferedReader(fr);
        while (br.ready()) {
            System.out.println(
                    br.readLine());
        }

            //System.out.println("String:"+s);


        //System.out.println("Double:" +d);
       // System.out.println( "Int:"+i);


    }
}