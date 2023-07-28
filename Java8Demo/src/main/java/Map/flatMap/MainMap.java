package Map.flatMap;

import Map.flatMap.Doa.CustomerDao;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class MainMap {
    public static void main(String[]args){
        List<Customer>customers=CustomerDao.getAll();
        //List<customer> convert list<String> -> Data transformation
        //Mapping logic :customer -> customer.getEmail()
        List<String>emails=customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);
        //To phone fetch number from unflattered
        //customer -> customer.getPhoneNumbers())-> one to many mapping
      List<List<String>>PhoneNumbers=customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
      System.out.println("Phone number unflattered"+PhoneNumbers);


      //use flatMap method For flattering purpose
        List<String> phones= customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println("Phone number flattered"+phones);


    }
}
