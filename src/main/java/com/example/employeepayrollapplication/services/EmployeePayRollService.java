package com.example.employeepayrollapplication.services;

import com.example.employeepayrollapplication.dto.EmployeePayrollDTO;
import com.example.employeepayrollapplication.exception.EmployeeNotFoundException;
import com.example.employeepayrollapplication.model.EmployeePayrollData;
import com.example.employeepayrollapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


/* service layer contains classes which has business logic for curd operations */
@Service
public class EmployeePayRollService implements IEmployeePayrollService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeePayrollData> getEmployeePayRollData() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeePayrollData getEmployeePayRollDataById(int empId) throws EmployeeNotFoundException {
        EmployeePayrollData employeePayrollData =  employeeRepository.findByEmployeeId(empId);
        if(employeePayrollData != null) {
            return employeePayrollData;
        } else {
            throw new EmployeeNotFoundException("Employee not found with id: " + empId);
        }
    }

    @Override
    public EmployeePayrollData addEmployeePayRollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = new EmployeePayrollData(employeeRepository.findAll().size()+1,
                employeePayrollDTO.employeeName, employeePayrollDTO.image, employeePayrollDTO.gender, employeePayrollDTO.department,
                employeePayrollDTO.salary, employeePayrollDTO.date, employeePayrollDTO.note);
        employeeRepository.save(employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public void deleteEmployeePayRollDataById(int empId) throws EmployeeNotFoundException {
        EmployeePayrollData employeePayrollData = employeeRepository.findByEmployeeId(empId);
        if(employeePayrollData != null) {
            employeeRepository.deleteById(empId);
        } else {
            throw new EmployeeNotFoundException("Employee not found with id: " + empId);
        }
    }

    @Override
    public EmployeePayrollData updateEmployeePayRollData(int empId, EmployeePayrollDTO employeePayrollDTO) throws EmployeeNotFoundException {
        EmployeePayrollData employeePayrollData = this.getEmployeePayRollDataById(empId);
        employeePayrollData.setEmployeeName(employeePayrollDTO.employeeName);
        employeePayrollData.setImage(employeePayrollDTO.image);
        employeePayrollData.setGender(employeePayrollDTO.gender);
        employeePayrollData.setSalary(employeePayrollDTO.salary);
        employeePayrollData.setDepartment(employeePayrollDTO.department);
        employeePayrollData.setDate(employeePayrollDTO.date);
        employeePayrollData.setNote(employeePayrollDTO.note);
        employeeRepository.save(employeePayrollData);
        return employeePayrollData;
    }
}
