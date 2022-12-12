package com.in28minutes.oops.level2;

public class Address {

	private String line1;
	private String city;
	private String zip;
	
	// Address는 모든 정보가 필수라고 가정
	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}
	
	// 필수적인 정보가 아닌 것은 getter, setter로 수정 가능하도록 설계
	// getter, setter를 두지 않으면 수정할 수 없도록 제한하는 것
	
	public String toString() {
		return line1 + " " + city + " " + zip;
	}

}
