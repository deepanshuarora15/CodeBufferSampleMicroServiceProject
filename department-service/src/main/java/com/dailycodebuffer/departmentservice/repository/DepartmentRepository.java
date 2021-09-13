package com.dailycodebuffer.departmentservice.repository;

import com.dailycodebuffer.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
