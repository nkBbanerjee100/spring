package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/configCollections.xml");
			CollectionsChecking nk1 = (CollectionsChecking)(context.getBean("nk"));
			System.out.println(nk1.getName());
			System.out.println(nk1.getPhones().getClass().getName());
			System.out.println(nk1.getAddresses());
			System.out.println(nk1.getCourses());
			System.out.println(nk1.getProps());
	}
}
