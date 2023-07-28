package Array.test;

public class ArrayMulti {
    public static  void main(String[]args){
        int [][] myNumbers={{1,3,5,6,7},{1,3,4,5,6,7}};
        for(int i=0; i<myNumbers.length; i++){
            for(int j=0; j<myNumbers[i].length; j++){
                System.out.println(myNumbers[i][j]);

            }

        }
    }
}
