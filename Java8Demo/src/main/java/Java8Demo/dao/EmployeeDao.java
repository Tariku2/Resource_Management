package Java8Demo.dao;

import Java8Demo.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public static List<Employee> getEmployees() {
        List<Employee>list=new ArrayList<>();
list.add(new Employee(2000,"Tariku","Software developer", (long) 100000.0));
        list.add(new Employee(2002,"Tariku","Software developer", (long) 100000.0));
        list.add(new Employee(2003,"John","Software developer", (long) 130000.0));
        list.add(new Employee(2004,"Tesfaye","Software developer", (long) 120000.0));

        return list;
    }

}