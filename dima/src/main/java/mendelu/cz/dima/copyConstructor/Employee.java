package mendelu.cz.dima.copyConstructor;

public class Employee {
    private int id;
    private String name;
    public  Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Employee(Employee employee){
        this.id=id;
        this.name=name;

    }
    int showId(){
        return id;
    }
    String showName(){
        return name;
    }

    public static void main(String[] args) {
        Employee employee =new Employee(200,"Tariku");
        System.out.println("Employee Id is : "+ employee.showId());
        System.out.println("Employee name is : "+employee.showName());
    }


}
