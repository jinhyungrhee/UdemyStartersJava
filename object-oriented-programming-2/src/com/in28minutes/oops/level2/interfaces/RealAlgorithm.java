package com.in28minutes.oops.level2.interfaces;

public class RealAlgorithm implements ComplexAlgorithm{
	
	// 이후에 외주팀에 의해 개발된 Real Complex Algorithm
	@Override
	public int complexAlgorithm(int number1, int number2) {
		// 지금은 1줄이지만 실제는 1000줄이라고 가정
		return number1 * number2;
	}

}
