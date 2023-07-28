package cz.mendelu.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int departmentId;
    private String name;
    private String address;
    private String departmentCode;

    public Department() {
    }

    public Department(int id, String name, String address, String departmentCode) {
        this.departmentId = id;
        this.name = name;
        this.address = address;
        this.departmentCode = departmentCode;
    }

    public int getId() {
        return departmentId;
    }

    public void setId(int id) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
