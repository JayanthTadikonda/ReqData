package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class EmployeeModel {

    @Column
    private String employeeName;
    @Id
    @Column
    private int employeeId;
    @Column
    private String employeeDesignation;
    @Column
    private String employeeDept;
    @Column
    private double employeeSalary;


    public EmployeeModel(String employeeName, int employeeId, String employeeDesignation, String employeeDept, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeDesignation = employeeDesignation;
        this.employeeDept = employeeDept;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeDept() {
        return employeeDept;
    }

    public void setEmployeeDept(String employeeDept) {
        this.employeeDept = employeeDept;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeDept='" + employeeDept + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
