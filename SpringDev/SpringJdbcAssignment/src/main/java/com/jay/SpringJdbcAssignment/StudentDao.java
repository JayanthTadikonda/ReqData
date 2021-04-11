package com.jay.SpringJdbcAssignment;

public interface StudentDao {

    //public void setDataSource();

    public int listAll();

    public void create(String name, int age, int id);

    public void getStudent(int id);

}
