package java11demo.test;

import java.util.Arrays;
import java.util.List;

public class APTester {
    public static void main(String[]args){
        List<String>nameList= Arrays.asList("John","Dalton","Abebe","Kebede");
        // old style of changing collection to array
        String[] names=nameList.toArray(new String[nameList.size()]);
      System.out.println(names.length);

        //new style of changing
       names=nameList.toArray(String[]::new);
        System.out.println(names.length);
    }
}
