package com.jspiders.dao;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data

public class student 
{
private int Studentid;
private String name;
private String gender;
@Autowired
private school scho;
}
