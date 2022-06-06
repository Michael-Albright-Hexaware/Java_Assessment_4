package com.example.Java_Assessment_4.entity;

import org.springframework.stereotype.Component;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Component
public class Employee {
    @Size(min=4, message = "Name should be at least 4 characters")
    String name;
    @Pattern(regexp=".@..com$", message = "Please enter a valid email")
    String email;
    @Min(value = 1000, message = "Salary should be more than 1000")
    Long salary;

    public Employee() {

    }

    public Employee(String name, String email, Long salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
