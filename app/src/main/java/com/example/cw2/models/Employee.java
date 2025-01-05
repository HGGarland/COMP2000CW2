package com.example.cw2.models;

public class Employee {
    private String firstname;
    private String lastname;
    private String email;
    private String department;
    private float salary;
    private String joiningdate;

    // Constructor
    public Employee(String firstname, String lastname, String email, String department, float salary, String joiningdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.department = department;
        this.salary = salary;
        this.joiningdate = joiningdate;
    }

    // Getters and Setters
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }

    public String getJoiningdate() { return joiningdate; }
    public void setJoiningdate(String joiningdate) { this.joiningdate = joiningdate; }
}


