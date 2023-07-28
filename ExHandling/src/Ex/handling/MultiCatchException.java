package Ex.handling;

public class MultiCatchException {
    public static void main(String[] args) {
        try {
            getInt();

        } catch (
                NumberFormatException |NullPointerException  e) {
            System.out.println("incorrect number format");

        }
finally {
            System.out.println("Checking the absence or presence of exception");
        }

        System.out.println("My code is healthy");
    }
    private static void getInt() {
        int myInt = Integer.parseInt("Some text");

    }

    }

