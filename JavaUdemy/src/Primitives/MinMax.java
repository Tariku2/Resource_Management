package Primitives;

import java.io.StringReader;

public class MinMax {
    public static void main(String[]args){
        int myValue=1000;
        int myMinIntValue=Integer.MIN_VALUE;
        int myMaxIntValue=Integer.MAX_VALUE;

        System.out.println("Integer Minimum value is "+myMinIntValue);
        System.out.println("Integer Maximum value is "+myMaxIntValue);
        System.out.println("Busted Max Value is "+(myMaxIntValue+1));
        System.out.println("Busted Min value is "+(myMinIntValue-1));
        byte myByteMinValue=Byte.MIN_VALUE;
        byte myByteMaxValue=Byte.MAX_VALUE;
        System.out.println("Byte Max value is" +myByteMaxValue);
        System.out.println("Byte Min value is "+myByteMinValue);

        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println(myMaxShortValue);
        System.out.println(myMinShortValue);
        Long myLongMaxValue=Long.MAX_VALUE;
        Long myLongMinValue=Long.MIN_VALUE;

        System.out.println(myLongMaxValue);
        System.out.println(myLongMinValue);
        Long bigLongLiteralValue=2_147_483_647_237L;
        System.out.println("Long is"+bigLongLiteralValue);
        //short bigShort=32767;
      int myTotal=(myMaxIntValue/2);
      //Casting Starts here
byte myNewByteValue=(byte) (myByteMaxValue/2);
        System.out.println(myNewByteValue);

    }

}
