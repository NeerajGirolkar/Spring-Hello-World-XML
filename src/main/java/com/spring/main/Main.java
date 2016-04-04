package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.examples.HelloSpring;

public class Main {
    public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
	    HelloSpring helloSpringBean = context.getBean("helloSpring", HelloSpring.class);
	    helloSpringBean.greet();
    }
}