package com.jay.SpringJDBCemp;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeAdditional {

    private SimpleJdbcInsert simpleJdbcInsert;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource){

        this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("employees.emp");
        this.dataSource = dataSource;
    }

    public void insert(EmployeeModel employeeModel){

        Map<String, Object> entries = new HashMap<>();
        entries.put("id",employeeModel.getId());
        entries.put("name",employeeModel.getName());
        entries.put("age",employeeModel.getAge());
        entries.put("designation",employeeModel.getDesignation());
        entries.put("dcode",employeeModel.getDept());
        entries.put("manager",employeeModel.getManager());
        simpleJdbcInsert.execute(entries);
    }

    public EmployeeModel call(int id){
        System.out.println("SIMPLE JDBC CALL !");

        SimpleJdbcCall jdbcCall = new
                SimpleJdbcCall(dataSource).withProcedureName("empById");

        SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);
        Map<String, Object> out = jdbcCall.execute(in);

        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setId(id);
        employeeModel.setName((String)out.get("name"));
        System.out.println(employeeModel.toString());
        return employeeModel;
    }
    public void callall() {
        System.out.println("SIMPLE JDBC CALL ALL Employees!");

        SimpleJdbcCall jdbcCall = new
                SimpleJdbcCall(dataSource).withProcedureName("allemp");

        Map<String, Object> out = jdbcCall.execute();
        out.forEach((s, o) -> System.out.println(o.toString()));
    }
}
