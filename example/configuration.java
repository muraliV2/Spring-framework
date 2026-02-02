package com.jspiders.javaBasedConfig.configuration;

import com.jspiders.javaBasedConfig.beans.Department;
import com.jspiders.javaBasedConfig.beans.Employee;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan (basePackages = "com.jspiders.javaBasedConfig")
@PropertySource("classpath:META-INF/config.properties")


public class JavaConfiguration {
    @Bean
    public Department department() {
        Department dept = new Department();
        dept.setDeptNo(101);
        dept.setDeptName("IT");
        dept.setLocation("Chennai");
        return dept;
    }

    @Bean(name = "employee1")
    @Scope(scopeName= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Employee getObject(Department department) {
        Employee employee = new Employee(department);
        employee.setEmployeeName("Ramesh");
        employee.setEmployeeId(23);
        employee.setEmail("ramesh@gmail.com");
        employee.setEmployeeAddress("Chennai");
        return employee;
    }

    @Bean (name = "employee2")
    public Employee getObject2(Department department){
        Employee employee = new Employee(department);
        employee.setEmployeeName("ganesh");
        employee.setEmployeeId(13);
        employee.setEmail("ganesh@gmail.com");
        employee.setEmployeeAddress("chennai");
        return employee;
    }
}
