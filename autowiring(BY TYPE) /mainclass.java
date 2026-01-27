package com.spring.bytpe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bytpe.*;
import com.spring.dao.car;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean.xml");
        
        car c1 = context.getBean("car1", car.class);
        car c2 = context.getBean("car2", car.class);
      
      System.out.println(c1);
      System.out.println(c2);
    }
}
