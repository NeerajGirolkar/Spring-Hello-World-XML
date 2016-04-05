package com.spring.examples.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.examples.Person;

public class Main {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Person person = (Person) context.getBean("personBean", Person.class);
		System.out.println("First Name is: " 	+ person.getFirstName());
		System.out.println("Last Name is: " 	+ person.getLastName());
		System.out.println("Age is: " 		+ person.getAge());
		System.out.println("Card Number is: " 	+ person.getCard().getCardNo());
		System.out.println("Bank Name is: " 	+ person.getCard().getBankName());
		System.out.println("CVV is: " 		+ person.getCard().getCvv());
		System.out.println("Plot No. is: " 	+ person.getAddress().getPlotNo());
		System.out.println("Street is: " 	+ person.getAddress().getStreet());
		System.out.println("City is: " 		+ person.getAddress().getCity());
		System.out.println("Country is: " 	+ person.getAddress().getCountry());
	}
}