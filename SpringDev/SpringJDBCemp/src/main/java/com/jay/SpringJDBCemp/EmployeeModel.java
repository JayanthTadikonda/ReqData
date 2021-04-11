package com.jay.SpringJDBCemp;

public class EmployeeModel {

    private int id;
    private String name;
    private int age;
    private String designation;
    private int dept;
    private String manager;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, String name, int age, String designation, int dept, String manager) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.dept = dept;
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", dept='" + dept + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    }
}
