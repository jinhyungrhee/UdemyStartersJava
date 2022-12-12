package com.in28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {

		// 고객 객체 생성
		Address homeAddress = new Address("line1", "Hyderabad", "50035");	
		Customer customer = new Customer("Ragna", homeAddress);
		
		System.out.println(customer);
		
		// (필수가 아닌) 사무실 주소 설정
		Address workAddress = new Address("line1 for work", "Hyderabad", "50089");
		customer.setWorkdAddress(workAddress);
		
		System.out.println(customer);
		
	}

}
