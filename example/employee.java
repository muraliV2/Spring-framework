package com.jspiders.javaBasedConfig.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data

public class Employee {
    @Value("${employeeId}")
    private int employeeId;
    @Value("${employeeName")
    private String employeeName;
    @Value("${employeeAddress}")
    private String employeeAddress;
    @Value("${email}")
    private String email;

    private Department department;
    public Employee() {
    }


    @Autowired
    public Employee(Department department) {
        this.department = department;
    }

}
