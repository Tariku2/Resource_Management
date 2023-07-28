package Logical.AndOr;

import java.util.Scanner;

public class Solution {




        private static final Scanner scanner = new Scanner(System.in);


        public static void main(String[] args) {
            int N = scanner.nextInt();


            scanner.close();

                if (N % 2 == 0 && N >= 6 && N <= 20||N % 2!=0) {
                    System.out.println(" weird");

                } else {
                    System.out.println(" not weird");
                }
            }
        }

