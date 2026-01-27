package com.hibernate.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Car {
    private int carid;
    private String name;
    private String model;
    private String colour;
    private Engine engine;
}
