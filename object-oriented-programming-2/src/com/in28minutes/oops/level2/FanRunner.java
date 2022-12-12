package com.in28minutes.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		
		Fan fan = new Fan("Manufacturer1", 0.34567, "GREEN");
		
		// isOn 상태 변경
		//fan.isOn(true);
		fan.switchOn();
		System.out.println(fan.toString());
		
		fan.setSpeed((byte)3);
		System.out.println(fan.toString());
		
		
		fan.switchOff();
		System.out.println(fan.toString());

	}

}
