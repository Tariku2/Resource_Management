package BinarySearch.TempratureClosestToZero;

public class Solution {
    public  static int ComputeClosestToZero(int[]ints){
        if (ints.length==0) return 0;
        int closest=ints[0];


        for (int i = 0; i < ints.length; i++) {
            if (closest==0){
                closest=ints[i];}
            else if (ints[i]>0&&ints[i]<=Math.abs(closest)){
                closest=ints[i];
            }

                    else if(ints[i]<0 && -ints[i]<Math.abs(closest)) {
                    closest =ints[i];
                }

                }




        return 0;

    }

}
