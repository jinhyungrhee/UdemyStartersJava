package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike somethigElse = new MotorBike();

		ducati.start(); // 0
		honda.start(); // 0

		ducati.setSpeed(100);
		// 속도 100 증가
		ducati.increaseSpeed(100);

		ducati.decreaseSpeed(50);
		System.out.println(ducati.getSpeed());

		honda.increaseSpeed(100);

		honda.decreaseSpeed(150);
		System.out.println(honda.getSpeed());

		System.out.println(somethigElse.getSpeed());

	}

}
