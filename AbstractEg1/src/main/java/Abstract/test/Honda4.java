package Abstract.test;

public class Honda4 extends Bike{
    @Override
    public void run() {System.out.println("Hello Tariku");}
        public static void main (String[]args) {

        Bike b = new Honda4();
        b.run();

    }
    }

