/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.deparment.controller;

import com.microservice.deparment.entity.Department;
import com.microservice.deparment.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ashwini
 */
@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentservice;
    
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department)
    {       log.info("Save Department Controller");
            return departmentservice.saveDepartment(department);          
    }
    
    @GetMapping("{id}")
    public Department findDepartmentById(@PathVariable("id") long departmentId)
    {
        log.info("Save Department Controller");
        return departmentservice.findDepartmentById(departmentId);
    }
}
