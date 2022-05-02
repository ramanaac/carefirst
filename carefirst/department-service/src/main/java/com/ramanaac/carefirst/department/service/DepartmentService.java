package com.ramanaac.carefirst.department.service;

import com.ramanaac.carefirst.department.entity.Department;
import com.ramanaac.carefirst.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
public interface DepartmentService {

    @Autowired


    public Department saveDepartment(Department department) ;

    public Department findDepartmentById(Long departmentId) ;

    public List<Department> fetchDepartmentList();
}
