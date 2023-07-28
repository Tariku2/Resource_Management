package BinarySearch;

import java.util.Arrays;

public class binarySearchSelfTest {
    public static void binarySearch(int[]arr,int left,int right,int key){
        int mid=left+right/2;
        if (arr[mid]<key){
            left=mid+1;

        }
        else if(arr[mid]>key){
            right=mid-1;
        }
        else
        {
            key=mid;
        }

    }

    public static void main(String[] args) {
        int arr[]={12,34,56,77,87,54,32};
            int key=77;
            int right=arr.length-1;
            binarySearch(arr,0,right,77);
        System.out.println(right);
    }
}
