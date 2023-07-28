package lamba.ex;
interface Calculator2 {
    int subtract(int a, int b);
    public class Calculator2Impl {



            public static void main(String[]args){
                Calculator2 calc = ( a,  b) ->a-b;




                System.out.println("the result "+calc.subtract(12,6));
                calc.subtract(12,4);
        }
    }
}
