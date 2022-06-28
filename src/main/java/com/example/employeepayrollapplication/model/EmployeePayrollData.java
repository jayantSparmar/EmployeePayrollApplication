package com.example.employeepayrollapplication.model;

import com.example.employeepayrollapplication.dto.EmployeePayrollDTO;

import javax.persistence.Entity;
import javax.persistence.Id;

/* Model object of employeePayrollData is stored in database */
@Entity
public class EmployeePayrollData {

    @Id
    private int employeeId;
    private String name;
    private long salary;

    public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
        this.employeeId = employeeId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
    }

    public EmployeePayrollData() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}