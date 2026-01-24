package com.spring.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean.xml");
      
      student bean = context.getBean("stu1",student.class);
      System.out.println(bean);
      
      
      student bean1 = context.getBean("stu2",student.class);
      System.out.println(bean1);
      
      
      student bean2 = context.getBean("stu3",student.class);
      System.out.println(bean2);
      
      
    }
}
