package cz.mendelu.employeeManager.repo;

import cz.mendelu.employeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    void deleteEmployeeById();

    Optional<Employee> findEmployeeById(Long id);
}
