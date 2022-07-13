package com.example.employeepayrollapplication.dto;

import javax.validation.constraints.NotNull;

/* EmployeePayrollDto class is (DTO) data transfer object sent to user and received from user */
public class EmployeePayrollDTO {

    @NotNull(message = "name should not be null")
    public String employeeName;

    @NotNull(message = "image should not be null")
    public String image;

    @NotNull
    public String gender;

    @NotNull
    public String department;

    @NotNull
    public int salary;

    @NotNull
    public String date;

    @NotNull
    public String note;

    public EmployeePayrollDTO(String employeeName, String image, String gender, String department, int salary, String date, String note) {
        this.employeeName = employeeName;
        this.image = image;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.date = date;
        this.note = note;
    }

    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "employeeName='" + employeeName + '\'' +
                ", image='" + image + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", date='" + date + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}