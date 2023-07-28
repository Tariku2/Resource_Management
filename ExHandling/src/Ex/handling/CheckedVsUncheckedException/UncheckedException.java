package Ex.handling.CheckedVsUncheckedException;

public class UncheckedException {
    private static void printLength(String myString) {
        System.out.println(myString.length());
        throw new RuntimeException();

    }

    public static void main(String[] args) {
        /*
        This line of code can cause null pointer exception that we can't handle in java
        using either by try-catch block
        or throwing exception in method signature that's why unchecked Exception can't be handled in these
        two ways
         */
        String name=null;
        printLength(name);


    }
}
