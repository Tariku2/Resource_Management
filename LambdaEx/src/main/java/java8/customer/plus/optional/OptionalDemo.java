package java8.customer.plus.optional;

import java.util.Arrays;
import java.util.Optional;

import static java.util.Optional.*;

public class OptionalDemo {

    public static void main(String[]args){
        Customer customer=new Customer(101,"John","gjsfgfds@gmail.com", Arrays.asList("098787667","008766565"));
      Optional<Object>emptyOptional= empty();
        System.out.println(emptyOptional);
        Optional<String>emailOptional= of(Customer.getEmail());
        System.out.println(emailOptional);
    }
}
