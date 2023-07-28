package lamba.ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
public class SupplierDemo2  {
    public static void main(String[]args){

        Supplier<String> supplier= () ->"Hello Tariku";
        System.out.println(supplier.get());
        List<String> list1 = Arrays.asList("Amazon", "Alibaba","Alza");
       System.out.println( list1.stream().findAny().orElseGet(supplier));
    }


}
