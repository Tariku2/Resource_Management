package lamba.ex;

public interface Calculator3 {
    int subtract(int a,int b);
    public class Calculator3Impl{
        public static void main(String[]args){


        }
 Calculator3 calc=(int a, int b) -> {
            if(a<b){
                throw new RuntimeException("error");
            }
else
    return a-b;

        };
    }
}
