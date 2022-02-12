package com.spring.core.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/collection/config_construct.xml");
		cons_inject e = (cons_inject) context.getBean("objcon");
		
//		System.out.println(e.getEmpname());
//		System.out.println(e.getPhones());
//		System.out.println(e.getAddress());
//		System.out.println(e.getCourses());
		
		System.out.println(e);



	}

}
