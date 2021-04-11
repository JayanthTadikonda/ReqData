package com.jay.SpringJDBCemp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public EmployeeModel getEmp(int id) {
        String sql = "select name from employees.emp where id = ?";

        //String SELECT_BY_ID = "SELECT name FROM EMPLOYEES WHERE FIRST_NAME = :firstName";
        EmployeeModel e = (EmployeeModel) getJdbcTemplate().queryForObject(sql, new Object[]{id},
                new BeanPropertyRowMapper(EmployeeModel.class));
        System.out.println(e.toString());

        return e;
    }

    @Override
    public List<EmployeeModel> getAllEmployees() {
        String SQL = "select * from emp";
        assert getJdbcTemplate() != null;
        List <EmployeeModel> employees = getJdbcTemplate().query(SQL, new EmployeeMapper());
        System.out.println("ALL EMPLOYEES - Using Mapper");
        System.out.println(employees.toString());
        return employees;
    }

    @Override
    public void deleteEmployee(EmployeeModel employeeModel) {

    }

    @Override
    public int updateEmployee(String name, int id) {
        String sql = "update emp set name=? where id=?";
        int rowsEffected = getJdbcTemplate().update(sql,name,id);
        System.out.println(rowsEffected);
        return rowsEffected;
    }
    public int updateEmployeeByArray(String name, int dept) {
        String sql = "update emp set name=? where dcode=?";
        int rowsEffected = getJdbcTemplate().update(sql,
                new Object[]{name, dept});
        System.out.println(rowsEffected);
        return rowsEffected;
    }

    public List<EmployeeModel> getByRowMapper(){

        String sql = "select * from emp";

        var rowMapper = BeanPropertyRowMapper.newInstance(EmployeeModel.class);
        List<EmployeeModel> emp = getJdbcTemplate().query(sql, rowMapper);
        System.out.println("ALL EMPLOYEES - Using BeanPropertyRowMapper");
        emp.forEach(e-> System.out.println(e.toString()));
        return  emp;
    }

    public List<EmployeeModel> getByResultSet(){
        System.out.println("GET BY ResultSET");

        return getJdbcTemplate().query("select * from employees.emp",
                new ResultSetExtractor<List<EmployeeModel>>() {
                    @Override
                    public List<EmployeeModel> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                        List<EmployeeModel> emp = new ArrayList<>();
                        while(resultSet.next()){
                            EmployeeModel employeeModel = new EmployeeModel();
                            employeeModel.setId(resultSet.getInt("id"));
                            employeeModel.setName(resultSet.getString("name"));
                            employeeModel.setAge(resultSet.getInt("age"));
                            employeeModel.setDesignation(resultSet.getString("designation"));
                            employeeModel.setDept(resultSet.getInt("dcode"));
                            employeeModel.setManager(resultSet.getString("manager"));
                        }
                        emp.forEach(e-> System.out.println(e.toString()));
                        return emp;
                    }


                });
    }

    public int rowCount(){
        return getJdbcTemplate().queryForObject("select count(*) from employees.emp",Integer.class);
    }

    public void insertSimple(EmployeeModel employeeModel){
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(getDataSource()).withTableName("emp");

        Map<String, Object> entries = new HashMap<>();
        entries.put("id",employeeModel.getId());
        entries.put("name",employeeModel.getName());
        entries.put("age",employeeModel.getAge());
        entries.put("designation",employeeModel.getDesignation());
        entries.put("dcode",employeeModel.getDept());
        entries.put("manager",employeeModel.getManager());
        simpleJdbcInsert.execute(entries);
        System.out.println(entries.entrySet().toString());

    }

}
