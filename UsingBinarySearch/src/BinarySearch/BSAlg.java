package BinarySearch;
import java.util.Arrays;
public class BSAlg {




        public static void main(String[] args) {
            int[] ints = {-9, 14, 37, 102};
            System.out.println(A.exists(ints, 102)); // true
            System.out.println(A.exists(ints, 36)); // false
        }
    }

    class A {

        static boolean exists(int[] ints, int k) {
            //for (int i : ints)
            //    if (i == k) return true;
            //return false;
            return (Arrays.binarySearch(ints, k) > -1);
        }
    }

