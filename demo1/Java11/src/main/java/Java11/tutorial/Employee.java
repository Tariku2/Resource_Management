package Java11.tutorial;

import java.lang.reflect.Field;

public class Employee {
    private final String name;
    private int age;
    Employee(String n,int a){
        name=n;
        age=a;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Employee emp=new Employee("Tariku",30);
        Field[] empField=emp.getClass().getDeclaredFields();
        for(Field field:empField){
            System.out.println(field.getName());

        }
    }
}
