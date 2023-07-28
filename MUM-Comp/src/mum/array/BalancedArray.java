package mum.array;

public class BalancedArray {

   static int isBalanced(int []a) {
       for (int i = 0; i < a.length; i++) {
           if (i % 2 == 0 && a[i] % 2 == 0) {
               i++;
           }
           for (int j = 0; j < i + 1; j++) {
               if (j % 2 != 0 && a[j] != 0) {
                   j++;
               }

           }
       }
       return 1;
   }

}
