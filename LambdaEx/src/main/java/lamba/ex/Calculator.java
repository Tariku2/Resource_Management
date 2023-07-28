package lamba.ex;

interface Calculator {
    void switchOn();

    public class CalculatorImpl {

        public static void main(String[] args) {
            Calculator calc = () ->
                System.out.println("Welcome To World of IT");

                //() ->{body}


            calc.switchOn();
        }


    }
}