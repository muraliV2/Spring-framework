package com.spring.dao;

import lombok.Data;

@Data
public class student 
{

	private int studentId;
    private String studentName;
    private String course;
    private String department;
    private String age;
    private String gender;
    
    
    public student()
    {
    	System.out.println("object created successfully");
    	
    }
}
