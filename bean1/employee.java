package com.hibernate.dao;

import lombok.Data;

@Data
public class employee 
{
	    private int empId;
	    private String empName;
	    private String designation;
	    private String department;
	    private String salary;
	    
	    public employee()
	    {
	    	System.out.println("object created succesfully");
	    }
}


