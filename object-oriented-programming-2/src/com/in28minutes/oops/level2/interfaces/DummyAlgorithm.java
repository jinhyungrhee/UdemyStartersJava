package com.in28minutes.oops.level2.interfaces;

public class DummyAlgorithm implements ComplexAlgorithm{

	// ComplexAlgorithm의 진짜 구현이 없으니 Dummy Algorithm을 생성
	@Override
	public int complexAlgorithm(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

}
