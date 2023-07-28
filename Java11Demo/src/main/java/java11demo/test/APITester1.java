package java11demo.test;

import java.util.Optional;

public class APITester1 {
    public static void main(String[] args) {
        String name = null;

        System.out.println(!Optional.ofNullable(name).isPresent());
        System.out.println(Optional.ofNullable(name).isEmpty());

        name = "Tariku";
        System.out.println(!Optional.ofNullable(name).isPresent());
        System.out.println(Optional.ofNullable(name).isEmpty());
    }
}
