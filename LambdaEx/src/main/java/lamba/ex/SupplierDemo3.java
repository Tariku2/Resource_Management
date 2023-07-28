package lamba.ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo3 {
    public static void main(String[]args){

//easier and understandable
        List<String> list1 = Arrays.asList();
        System.out.println( list1.stream().findAny().orElseGet(()->"Hello Tariku"));
    }
}
