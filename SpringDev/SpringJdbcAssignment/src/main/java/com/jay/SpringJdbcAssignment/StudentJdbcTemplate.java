package com.jay.SpringJdbcAssignment;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.util.List;

public class StudentJdbcTemplate implements StudentDao{

    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public int listAll() {
        String sql = "select * from employees.student";
       // String studentList = jdbcTemplate.query(sql);
        System.out.println("All Students of the Table");
        return 0;
    }

    @Override
    public void create(String name, int age, int id) {
        String sql = "insert into employees.student(name, age, id) values(?, ?, ?)";
        jdbcTemplate.update(sql,name,age,id);

    }

    @Override
    public void getStudent(int id) {
        String sql = "select name from student where id=?";

        //System.out.println(status);
    }
}
