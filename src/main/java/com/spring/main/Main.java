package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.examples.HelloSpring;

public class Main {
    public static void main(String[] args) {
	    ApplicationContext context = new FileSystemXmlApplicationContext("//Volumes//Disk_Drive//Windows_Data//Projects//Spring//Spring-Hello-World-XML//src//main//resources//spring-beans.xml");
	    HelloSpring helloSpringBean = context.getBean("helloSpring", HelloSpring.class);
	    helloSpringBean.greet();
    }
}