package com.hibernate.bean;

import lombok.Data;

@Data
public class car 
{
private int carid;
private String brand;
private String model;
private String colour;
private String price;

public car()
{
System.out.println("object created");	
}
}
