package BinarySearch;

import java.lang.reflect.Array;

public class BinarySeachAlg {
    private static boolean left;

    // public static boolean binarySearchRecursive(int[]Array,int x,int left,int right){
   public static boolean binarySearchRecursive(int[]Array,int x){
       int left=0;
       int right=Array.length-1;
        if(left>right){
        return false;}
        int mid=left+right/2;
        if (Array[mid]==x){
            return true;
        }
        else if (x<Array[mid]){
           right=mid-1;
           // return binarySearchRecursive(Array ,x, left,mid-1);

        }
        else {
            left=mid+1;
          //  return binarySearchRecursive(Array, x,mid-1, right);

        }
        return  false;
    }




}
