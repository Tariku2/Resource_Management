import java.util.Random;

public class RandomNum {
    int num;
    public static void main(String[] args) {
        int []array= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int n=0; n<= array.length; n++) {
            Random random = new Random();
            System.out.println(array[random.nextInt(array.length)]);
        }
    }
}
