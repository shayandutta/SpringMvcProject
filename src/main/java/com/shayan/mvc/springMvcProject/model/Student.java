package com.shayan.mvc.springMvcProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {

    private String name;
    private int empId;
    private int empNo;

    //ignore during deserialization (to exclude a field)
    @JsonIgnore
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", empNo=" + empNo +
                ", email='" + email + '\'' +
                '}';
    }
}
