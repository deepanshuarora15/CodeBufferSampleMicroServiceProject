package com.dailycodebuffer.departmentservice.service;

import com.dailycodebuffer.departmentservice.entity.Department;
import com.dailycodebuffer.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside the saveDepartment method of Department Service");
        return departmentRepository.save(department);
    }

    public Optional<Department> getDepartmentById(Long departmentId){
        log.info("inside the getDepartmentById method of Department Service");
        return departmentRepository.findById(departmentId);
    }
}
