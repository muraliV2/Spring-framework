package com.jspiders.autowirin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.dao.student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


    	ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean.xml");
    	student stu = context.getBean("student1",student.class);
    	student stu1 = context.getBean("student1",student.class);
    	
    	System.out.println(stu);
    	System.out.println(stu1);
    }
}
