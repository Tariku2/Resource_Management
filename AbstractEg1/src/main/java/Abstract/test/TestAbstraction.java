package Abstract.test;

public class TestAbstraction {
    public static void main(String[]args){
       Hospital h= new PoliClinic();
        Hospital fn= new FN();
        h.treat();
        fn.treat();

    }
}
