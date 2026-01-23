package com.spring.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.dao.employee;



public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean.xml");
        
        employee bean = context.getBean("emp1",employee.class);
        System.out.println(bean);
        
        employee bean2 = context.getBean("emp2",employee.class);
        System.out.println(bean2);
        
        employee bean3 = context.getBean("emp3",employee.class);
        System.out.println(bean3);
        
        
        employee bean4 = context.getBean("emp4",employee.class);
        System.out.println(bean4);
        
        employee bean5 = context.getBean("emp5",employee.class);
        System.out.println(bean5);
    }
}
