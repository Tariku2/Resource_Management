package cz.mendelu.department.service;

import cz.mendelu.department.entity.Department;
import cz.mendelu.department.repo.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment of DepartmentService");
        return departmentRepo.save(department);
    }

    public Department findDepartmentById(long departmentId) {
        return departmentRepo.getReferenceById(departmentId);
    }
}
