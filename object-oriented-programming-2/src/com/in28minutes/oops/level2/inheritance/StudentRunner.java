package com.in28minutes.oops.level2.inheritance;

public class StudentRunner extends Object {

	public static void main(String[] args) {

		//Student student = new Student();
		//student.setName("Ranga");
		//student.setEmail("example@gmail.com");
		
		Person person = new Person();
		person.setName("Ranga");
		person.setEmail("example@gmail.com");
		person.setPhoneNumber("010-1234-5678");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
		
	}

}
