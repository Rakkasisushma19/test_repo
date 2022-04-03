package com.zensar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.zensar.bean.Address;
import com.zensar.bean.Employee;

public class couplingDemo {
	
	public static void main(String[] args) {
		Address myAddress = new Address("5/1333","abc Stree","omr","chennai","India");
		Employee emp = new Employee (100,"TestEmp","test@gmail.com",myAddress);
		System.out.println(myAddress);
		System.out.println(emp);

		
		//Address newAddress;
		Employee employee;
		
		
	    Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	    
	    ApplicationContext context =   
	    	    new ClassPathXmlApplicationContext("applicationContext.xml");  

	      
	    //newAddress=(Address)factory.getBean("EmployeeBeam");  
	    employee = (Employee) factory.getBean("employeeBeam");

		System.out.println(myAddress);

		
	
	      

	}

}
