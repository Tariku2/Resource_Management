package Ex.handling;

public class ExceptionHandling {
    public static void main(String[] args) {
        //  int myInt=Integer.parseInt("Hello");
        // to handle the above exception we use try catch block


        try {
            getInt();

        } catch (
                Exception nfe) {
            System.out.println("incorrect number format");

        }

        System.out.println("My code is healthy");
    }
    private static void getInt() {
        int myInt = Integer.parseInt("Some text");

}
}