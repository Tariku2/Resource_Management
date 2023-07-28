package lamba.ex;

public class SupplierDemo {

    public static void main(String[]args){

        Supplier<String> supplier= () ->"Hello Tariku";
        System.out.println(supplier.get());
    }
}
