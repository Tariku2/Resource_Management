package Java8Demo.Sevice;
import Java8Demo.Employee;
import Java8Demo.dao.EmployeeDao;
import java.util.List;
import java.util.stream.Collectors;
public class EmployeeService {
    public static List<Employee>evaluateTaxPayers(String input){



        return (input.equalsIgnoreCase("tax"))
                //ternary operator in case of if else
                ?EmployeeDao.getEmployees().stream().filter(emp->emp.getSalary() > 100000.0).collect(Collectors.toList())
        :EmployeeDao.getEmployees().stream().filter(emp->emp.getSalary() < 100000.0).collect(Collectors.toList());
        }
    public static void main(String[]args){
        System.out.println(evaluateTaxPayers("non tax"));
    }
}
