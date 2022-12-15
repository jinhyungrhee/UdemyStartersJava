package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {
	
	// 같은 종류의 값을 받아들이고 같은 종류의 값을 반환하는 static 메서드
	static <X> X doubleValue(X value) { 
		return value;
	}
	
	// ArrayList든, LinkedList든, Vector든 값을 복사할 수 있음
	static <X extends List> void duplicate(X list) { 
		list.addAll(list);
	}
	
	// 와일드카드(?)를 메서드 인수에 사용 ** 
	// 숫자 클래스를 연장하는 어떤 종류의 리스트든 가능함
	// 숫자 클래스를 연장하는 아무 리스트나 매개변수로 입력될 수 있음
	// [extends] : 상한 경계 와일드카드
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}
	
	// [super] : 하한 경계 와일드카드
	static void addACoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}



	public static void main(String[] args) {	
		
		// 하한 경계 와일드카드 예시
		List emptyList = new ArrayList<Number>();
		addACoupleOfValues(emptyList);
		System.out.println(emptyList); // [1, 1.0, 1.0, 1]
		
		// 상한 경계 와일드카드 예시
		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5))); // 15.0
		System.out.println(sumOfNumberList(List.of(1.1, 2.1, 3.1, 4.1, 5.1))); // 15.5
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l))); // 15.0
		
		// doubleValue()메서드
		// 어떠한 타입의 값도 입력받고 리턴할 수 있음 (제한X)
		String value = doubleValue(new String());
		Integer number = doubleValue(Integer.valueOf(5));
		ArrayList arrList = doubleValue(new ArrayList());
		
		// duplicate() 메서드
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
		LinkedList<Integer> numbers2 = new LinkedList<>(List.of(4, 5, 6));
		duplicate(numbers);
		duplicate(numbers2);
		System.out.println(numbers);
		System.out.println(numbers2);
		
		// String
		/*
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		// 사용자 정의 메서드 - 문자열 출력
		String value = list.get(0);
		
		System.out.println(list);
		System.out.println(value);
		*/
		
		// Long
		MyCustomList<Long> list = new MyCustomList<>();
		list.addElement(5l);
		list.addElement(7l);
		// 사용자 정의 메서드 - 문자열 출력
		Long value2 = list.get(0);
		
		System.out.println(list);
		System.out.println(value2);
		
		// Integer
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		// 사용자 정의 메서드 - 숫자 출력
		Integer number2 = list2.get(0);
		
		System.out.println(list2);
		System.out.println(number2);
	}

}
