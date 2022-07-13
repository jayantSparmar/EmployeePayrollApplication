package com.example.employeepayrollapplication.services;

import com.example.employeepayrollapplication.dto.EmployeePayrollDTO;
import com.example.employeepayrollapplication.exception.EmployeeNotFoundException;
import com.example.employeepayrollapplication.model.EmployeePayrollData;
import java.util.List;


public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayRollData();
    EmployeePayrollData getEmployeePayRollDataById(int empId) throws EmployeeNotFoundException;
    EmployeePayrollData addEmployeePayRollData(EmployeePayrollDTO employeePayrollDTO);
    void deleteEmployeePayRollDataById(int empId) throws EmployeeNotFoundException;
    EmployeePayrollData updateEmployeePayRollData(int empId, EmployeePayrollDTO employeePayrollDTO) throws EmployeeNotFoundException;
}

