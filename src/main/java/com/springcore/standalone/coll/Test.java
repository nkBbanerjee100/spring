package com.springcore.standalone.coll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/standalone/coll/aloneConfig.xml");
		Person p = (Person)context.getBean("persons");
		System.out.println(p);
	}

}
