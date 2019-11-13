package com.example.firstprogram.models;

public class Employee {

    private String name;
    private String country;
    private Integer id;

    public Employee(Employee employee) {
        this.name = employee.name;
        this.country = employee.country;
        this.id = employee.id;
    }

    public Employee(String name, String country, Integer id) {
        this.name = name;
        this.country = country;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
