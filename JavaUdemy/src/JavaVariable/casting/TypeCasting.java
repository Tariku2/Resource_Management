package JavaVariable.casting;

public class TypeCasting {
    public static void main(String[]args){
        byte myByteMinValue=Byte.MIN_VALUE;
        byte myByteMaxValue=Byte.MAX_VALUE;
        System.out.println("Byte Max value is" +myByteMaxValue);
        System.out.println("Byte Min value is "+myByteMinValue);

        byte myNewByteValue=(byte) (myByteMaxValue/2);
        System.out.println(myNewByteValue);

        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println(myMaxShortValue);
        System.out.println(myMinShortValue);
        short myNewShortValue=(short)(myMaxShortValue/2);
        System.out.println(myNewShortValue);
        int myIntNumber=Integer.SIZE;
       // Long myLongValue= (Long) (50000 + 10 * myNewByteValue + 10 * myMaxShortValue + 10 * myIntNumber);
    }
}
