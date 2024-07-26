package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/ciConfig.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		Addition ad = (Addition) context.getBean("add");
		ad.doSums();
	}

}
