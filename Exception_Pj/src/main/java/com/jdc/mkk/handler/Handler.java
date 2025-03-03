package com.jdc.mkk.handler;

public class Handler {
	
	private Person person ;
		
	public Handler() {
		super();
		person = new Person();
	}
	
	public void useName() {
		try {
			person.setName("John Doe");
			System.out.println(person.getName());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NullPointerException Alert!");
		}
		
	}

	public void useAge() {
		person.setAge(10);
		System.out.println(person.getAge());
	}
	
	public void recursive() {
		if(person.getAge() > 0) {
			recursive();
		}
	} 
	
	private int dividedByZero(int age) {
		return age/0 ;
	}

}
