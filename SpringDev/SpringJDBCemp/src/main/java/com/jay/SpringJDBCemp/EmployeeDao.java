package com.jay.SpringJDBCemp;

import java.util.List;

public interface EmployeeDao {

    public void createEmployee(EmployeeModel employeeModel);

    public EmployeeModel getEmp(int id);

    public List<EmployeeModel> getAllEmployees();

    public void deleteEmployee(EmployeeModel employeeModel);

    public int updateEmployee(String name, int id);

}
