package Map.flatMap.Doa;

import Map.flatMap.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDao {
    public static List<Customer>getAll(){
        return Stream.of(new Customer (12,"Tesfaye","tesf@gmail.com", Arrays.asList("+251921511" ,"+251912334")),
                new Customer (23,"Jonas","jonas@gmail.com", Arrays.asList("+251925711" ,"+251917868")),
                new Customer (56,"Dave","df@gmail.com", Arrays.asList("+25192108077665" ,"+2519198577"))).collect(Collectors.toList());
    }
}
