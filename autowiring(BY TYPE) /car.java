package com.spring.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class car 
{
	private int carid;
    private String name;
    private String model;
    private String colour;
    private engine1 engine;
}
