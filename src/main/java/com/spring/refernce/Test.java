package com.spring.refernce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/refernce/refConfig.xml");
		A a = (A)context.getBean("aref");
		System.out.println(a); // A [x=20, ob=B [y=10]]
		System.out.println(a.getX());
		System.out.println(a.getOb());
		System.out.println(a.getOb().getY());
//		System.out.println(a.getX());
	}

}
