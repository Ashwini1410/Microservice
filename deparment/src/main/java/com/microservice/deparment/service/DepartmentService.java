/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.deparment.service;
import com.microservice.deparment.entity.Department;
import com.microservice.deparment.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Ashwini
 */
@Service
@Slf4j
public class DepartmentService {
    
    @Autowired
    private DepartmentRepository departmentrepository;

    public Department saveDepartment(Department department) {
        log.info("Inside Deparment service");
        return departmentrepository.save(department);
    }

    public Department findDepartmentById(long departmentId) {
        log.info("Inside Deparment service");
        return departmentrepository.findByDepartmentId(departmentId);
    }
    
}
