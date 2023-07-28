package mum.array;

public class CenteredArray {
    static int Centered(int[]a) {
        if (a.length % 2 == 0 || a == null)
            return 0;
        int midIndex = a.length / 2;
        int midItem = a[midIndex];
        for (int i = 0; i < a.length; i++) {
            if (i != midIndex && midItem >= a[i]) {
                return 0;

            }
            return 1;

        }


        return midIndex;
    }
}
