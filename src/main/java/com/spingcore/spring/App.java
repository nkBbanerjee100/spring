package com.spingcore.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Student st1 = (Student)(context.getBean("student1"));
    	Student st2 = (Student)(context.getBean("student2"));
        System.out.println( st1 );
        System.out.println( st2  );
        
        
    }
}
