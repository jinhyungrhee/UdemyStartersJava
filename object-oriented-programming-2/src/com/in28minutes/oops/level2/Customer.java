package com.in28minutes.oops.level2;

public class Customer {
	
	private String name;
	// 주소는 자체적으로 객체가 되거나 클래스가 될 수 있음
	// Customer 클래스는 Address 클래스의 인스턴스에 대해 '참조' 역할을 함!
	private Address homeAddress;
	private Address workAddress;

	// 주소가 필수 요소인지 체크 
	// 필수 요소이면 생성자에 포함시켜야 함
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	// operations
	// Address 정보 변경 가능
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkdAddress() {
		return workAddress;
	}

	public void setWorkdAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	public String toString() {
		return String.format("name - [%s] home address - [%s] work address - [%s]", name, homeAddress, workAddress);
	}
	
	
}
