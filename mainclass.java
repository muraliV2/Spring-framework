package com.spring.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.bean.car;


public class App {
    public static void main(String[] args) 
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean.xml");
     car bean = context.getBean(car.class);
     System.out.println(bean);
      
    }
}
