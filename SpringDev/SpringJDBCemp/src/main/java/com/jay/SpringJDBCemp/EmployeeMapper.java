package com.jay.SpringJDBCemp;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<EmployeeModel> {
    @Override
    public EmployeeModel mapRow(ResultSet resultSet, int i) throws SQLException {
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setId(resultSet.getInt("id"));
        employeeModel.setName(resultSet.getString("name"));
        employeeModel.setAge(resultSet.getInt("age"));
        employeeModel.setDesignation(resultSet.getString("designation"));
        employeeModel.setDept(resultSet.getInt("dcode"));
        employeeModel.setManager(resultSet.getString("manager"));

        return employeeModel;
    }
}
