package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.dao.Car;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF/bean.xml");

        Car car1 = context.getBean("car1", Car.class);
        Car car2 = context.getBean("car2", Car.class);

        System.out.println(car1);
        System.out.println(car2);
    }
}
