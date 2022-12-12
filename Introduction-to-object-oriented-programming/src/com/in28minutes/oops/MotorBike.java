package com.in28minutes.oops;

public class MotorBike {
	// state
	// 변수를 비공개로 만들면 클래스 외부에서는 접근 불가
	private int speed;

	// 디폴트 생성자
	MotorBike() {
		// this.speed = 5;
		this(5);

	}

	// 생성자
	MotorBike(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {

		// validation
		if (speed > 0) {
			this.speed = speed;
		}
	}

	// 비즈니스 로직 캡슐화
	public void increaseSpeed(int howMuch) {
		// this.speed += howMuch;
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {

		// validation
//		if (this.speed - howMuch > 0) {
//			this.speed -= howMuch;
//		}
		setSpeed(this.speed - howMuch);
	}

	// behavior
	void start() {
		System.out.println("Bike Started");
	}

}
