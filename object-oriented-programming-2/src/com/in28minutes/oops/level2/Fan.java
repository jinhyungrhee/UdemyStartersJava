package com.in28minutes.oops.level2;

public class Fan {
	
	// 상태(state)
	private String make; // 필수
	private double radius; // 필수
	private String color; // 필수
	
	private boolean isOn; // default값 (false)
	private byte speed; // 0 ~ 5 (enums도 많이 사용), default값 (0)

	// 생성자(construction)
	// : 객체에 없으면 안되는 것들 고려
	// : 필수 세가지 항목에 대해서는 반드시 값을 출력할 수 있어야 함
	// -> 누가 Fan 객체를 생성하든 세 가지 값은 반드시 입력됨!
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
		
	}
	
	// switch isOn
//	public void isOn(boolean isOn) {
//		this.isOn = isOn;
//	}
	public void switchOn() {
		this.isOn = true;
		// 켜졌을 때 default speed 설정
		setSpeed((byte)5);
	}
	public void switchOff() {
		this.isOn = false;
		// 꺼지면 무조건 speed는 0으로변경
		setSpeed((byte)0);
	}
	
	// speed
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	
	
	// 메서드 (상태 출력)
	public String toString() {
		return String.format("make - %s, raidus - %f, color - %s, isOn - %b, speed - %d",
		make, radius, color, isOn, speed);
	}
	

}
