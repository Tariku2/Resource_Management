package ArrayRev;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 8, 12, 23, 7};
        System.out.println("Array"+ Arrays.toString(array));
        reverse(array);
        System.out.println("reversed Array"+Arrays.toString(array));
    }
        private static void reverse(int[]array){

        int maxIndex= array.length-1;// if array length is 5 max index is 4 due to elements are listed from 0 to 4
        int  midIndex= array.length/2;
        for (int i = 0; i < midIndex; i++) {
            int temp=array[i];
            array[i]=   array[maxIndex-i];
                    array[maxIndex-i]=temp;

        }
    }
}
