package lamba.ex;
interface Calculator1 {
    void sum(int input);

    public class Calculatore {

        public static void main(String[] args) {




            Calculator1 calc= (int input) ->
            System.out.println("The sum is "+input);
        calc.sum(3242);
        }

    }
}