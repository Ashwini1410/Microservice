/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.deparment.repository;

import com.microservice.deparment.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ashwini
 * 
 * DepartmentRepsitory
 * DepartmentRepository
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentId(Long departmentId);
}

//@Repository
//public interface DepartmentRepsitory extends JpaRepository<Department, Long>{
//
//    public Department findDepartmentById(long departmentId);
//    
//}
