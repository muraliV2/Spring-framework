package com.jspiders;

import com.jspiders.javaBasedConfig.beans.Employee;
import com.jspiders.javaBasedConfig.configuration.JavaConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        System.out.println(context.getBean("employee1", Employee.class));
        System.out.println(context.getBean("employee2", Employee.class));

    }
}


