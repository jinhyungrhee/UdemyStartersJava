package com.in28minutes.generics;

import java.util.ArrayList;

// 각괄호(<>) 안에 제네릭 타입 정의 - "구현 시 타입을 입력받을 것임"을 의미!
// 일종의 매개변수화
public class MyCustomList<T extends Number> { // 제네릭에서 타입 제한하는 방법("extends")

	// 해당 구현은 오직 한 가지 데이터 타입에 대해서만 작동함
	// 이러한 문제를 해결하기 위해 "제네릭" 사용!
	ArrayList<T> list = new ArrayList<>();
	
	public void addElement(T element) {
		list.add(element);
	}
	
	public void removeElement(T element) {
		list.remove(element);
	}
	
	public String toString() {
		return list.toString();
	}
	
	public T get(int index) {
		return list.get(index);
	}
}

// ArrayList의 구현방식은 이와 동일함!
