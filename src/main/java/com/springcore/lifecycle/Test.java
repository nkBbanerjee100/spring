package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		// BeanXml xmlBean = (BeanXml)context.getBean("beanxml");
		// System.out.println(xmlBean);	
		// registering shutdown hook
		 context.registerShutdownHook();
		
		// System.out.println("--------------------------------------");
		// BeanInterface bi = (BeanInterface)context.getBean("beaninterface");
		// System.out.println(bi);
		 BeanAnnotation ba = (BeanAnnotation)context.getBean("annotation");
		 System.out.println(ba);
	}
}
