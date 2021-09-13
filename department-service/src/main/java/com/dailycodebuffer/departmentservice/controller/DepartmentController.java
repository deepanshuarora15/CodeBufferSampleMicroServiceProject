package com.dailycodebuffer.departmentservice.controller;

import com.dailycodebuffer.departmentservice.entity.Department;
import com.dailycodebuffer.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Slf4j
@RequestMapping(path = "/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping(path="/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside the saveDepartment method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping(path="/{id}")
    public Optional<Department> getDepartmentById(@PathVariable(name = "id") Long departmentId){
        log.info("inside the getDepartmentById method of Department Controller");
        return departmentService.getDepartmentById(departmentId);
    }
}
