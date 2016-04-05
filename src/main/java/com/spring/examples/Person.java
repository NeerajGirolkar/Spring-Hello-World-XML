package com.spring.examples;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private CreditCard card;
	
	public Person(String firstName, String lastName, int age, CreditCard card) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.card = card;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public CreditCard getCard() {
		return card;
	}

	public void setCard(CreditCard card) {
		this.card = card;
	}
}