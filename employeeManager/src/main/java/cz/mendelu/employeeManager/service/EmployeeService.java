package cz.mendelu.employeeManager.service;
import cz.mendelu.employeeManager.exception.UserNotFoundException;
import cz.mendelu.employeeManager.model.Employee;
import cz.mendelu.employeeManager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo ;
    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo=employeeRepo;

    }
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }
    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);

    }
    public Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(()->new UserNotFoundException("User by Id"+id+"was not found"));
    }
    public void deleteEmployeeById(Long id){
        employeeRepo.deleteEmployeeById();
    }


    public void deleteEmployee(Long id) {
    }
}
