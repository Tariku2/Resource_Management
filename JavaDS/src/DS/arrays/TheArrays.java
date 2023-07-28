package DS.arrays;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[]colors=new String[5];
        colors[0]="purple";
        colors[1]="Red";
                colors[2]="Yellow";
                        colors[3]="Pink";
                                colors[4]="White";
        System.out.println(Arrays.toString(colors));
        for (int i = 0; i < colors.length-3; i++) {
            System.out.println(Arrays.toString(colors));

        }
    }
}
