package com.jay.SpringJDBCemp;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeJdbcTemplate extends JdbcDaoSupport implements EmployeeDao  {

    @Override
    public void createEmployee(EmployeeModel employeeModel) {
        String sql = "insert into employees.emp(id,name,age,designation,dcode,manager) value(?,?,?,?,?,?)";

        assert getJdbcTemplate() != null;
        getJdbcTemplate().update(sql, employeeModel.getId(),employeeModel.getName(),employeeModel.getAge(),employeeModel.getDesignation(),employeeModel.getDept(),employeeModel.getManager());

        System.out.println("Row Created: " + employeeModel.toString());

    }
    public void createEmployeeNamed(EmployeeModel employeeModel) {
        String sql = "insert into employees.emp values(:id,:name,:age,:designation,:dcode,:manager)";

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("id",employeeModel.getId());
        map.put("name",employeeModel.getName());
        map.put("age",employeeModel.getAge());
        map.put("designation",employeeModel.getDesignation());
        map.put("dcode",employeeModel.getDept());
        map.put("manager",employeeModel.getManager());

        assert getJdbcTemplate() != null;

        NamedParameterJdbcTemplate NjdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        NjdbcTemplate.execute(sql,map,new PreparedStatementCallback() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
        System.out.println("Row Created: " + employeeModel.toString());

    }

    @Override
    public EmployeeModel getEmp(EmployeeModel employeeModel) {
        return null;
    }

    @Override
    public List<EmployeeModel> getAllEmployees() {
        String SQL = "select * from emp";
        assert getJdbcTemplate() != null;
        List <EmployeeModel> employees = getJdbcTemplate().query(SQL, new EmployeeMapper());
        System.out.println(employees.toString());
        return employees;
    }

    @Override
    public void deleteEmployee(EmployeeModel employeeModel) {

    }

    @Override
    public EmployeeModel updateEmployee(EmployeeModel employeeModel) {
        return null;
    }
}
