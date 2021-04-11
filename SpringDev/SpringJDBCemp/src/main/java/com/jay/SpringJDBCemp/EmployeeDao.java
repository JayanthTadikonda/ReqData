package com.jay.SpringJDBCemp;

import java.util.List;

public interface EmployeeDao {

    public void createEmployee(EmployeeModel employeeModel);

    public EmployeeModel getEmp(EmployeeModel employeeModel);

    public List<EmployeeModel> getAllEmployees();

    public void deleteEmployee(EmployeeModel employeeModel);

    public EmployeeModel updateEmployee(EmployeeModel employeeModel);

}
