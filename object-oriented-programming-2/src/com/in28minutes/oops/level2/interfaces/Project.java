package com.in28minutes.oops.level2.interfaces;

public class Project {

	public static void main(String[] args) {
		
		
		// 처음에는 DummyAlgorithm으로 작업을 하다가 나중에 ComplexAlgorithm으로 교체
		//ComplexAlgorithm algorithm = new DummyAlgorithm();
		//System.out.println(algorithm.complexAlgorithm(10, 20));
		
		// 이것이 가능한 건 두 시스템 사이의 통신을 정의하는 인터페이스가 있기 때문
		// 양쪽 시스템들은 complexAlgorithm() 메서드가 존재
		// 이후에 외주 팀이 이것의 진짜 구현을 제공할 것이라고 기대!
		
		// 이후에 외주 팀이 진짜 구현을 제공함(Real Algorithm)
		// 이 상황에서 프로젝트가 해야할 일은 그저 "DummyAlgorithm에서 RealAlgorithm으로 전환하는 것뿐"임!
		ComplexAlgorithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));
		
		// -> 기존 프로젝트를 유지하면서 사용되는 알고리즘만 교체할 수 있음!
		// => '인터페이스'는 두 프로젝트 간의 소통 방식을 제공해주기도 함!!
	}

}
