package DS.arrays;

import java.util.Arrays;

public class The2DArrays {
    public static void main(String[] args) {
        char[][]board=new char[4][4];
        for (int i = 0; i < 2*board.length; i++) {
            for (int j = 0; j < 4; j++) {
                board[1][2]='W';
                board[0][2]='r';
                board[1][3]='e';
                board[2][2]='d';


            }

            System.out.println(Arrays.deepToString(board));

        }
    }
}
