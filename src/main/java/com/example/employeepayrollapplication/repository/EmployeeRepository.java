package com.example.employeepayrollapplication.repository;

import com.example.employeepayrollapplication.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepository extends JpaRepository<EmployeePayrollData, Integer> {
    EmployeePayrollData getOne(int empId);
    EmployeePayrollData getById(int empId);

    EmployeePayrollData findByEmployeeId(int empId);
}
