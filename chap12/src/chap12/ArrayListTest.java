package chap12;

import java.util.ArrayList;

class Employee { // extends Object
	int id;
	String name;
	double pay;
	
	public Employee(int id, String name, double pay) {
		super(); // 생략가능
		this.id = id;
		this.name = name;
		this.pay = pay;
	}

	@Override
	public String toString() {
		return id + "-" + name + "-" + pay;
	}
	
	// equals() - 상속 그대로 사용
	
	
}

public class ArrayListTest {

	public static void main(String[] args) {

		// 배열과의 차이점
		// 배열 - 동일 타입 저장, 길이 수정 불가.
		// ArrayList - 상속관계가 없는 서로다른 클래스의 객체를 한 공간에 저장 가능!
		ArrayList list = new ArrayList(5); // 5개 저장 공간 -> 크기 고정이 아닌 동적으로 변함!
		list.add("java"); // 참조형 변수
		list.add(10); // auto-boxing
		list.add(3.14); // auto-boxing
		
		Employee e1 = new Employee(100, "이사원", 1000000); 
		Employee e2 = new Employee(200, "최대리", 1500000); 
		Employee e3 = new Employee(300, "김부장", 2000000); 
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		//list.set(5, "new문자열"); // 기존에 있던 데이터 수정
		//list.remove(1);
		list.add(e3); // 중복 데이터 저장 가능
		
		System.out.println(list.size()); // 6 -> 5
		
		// 특정 문자열 포함여부 확인 : contains() -> boolean 리턴
		System.out.println(list.contains("java"));
		// 데이터가 몇번재에 존재하는지 확인 : indexOf() -> int 리턴
		System.out.println(list.indexOf("java"));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getClass().getName() + " : ");
			System.out.println(i + "번째 위치 = " + list.get(i)); // toString() 호출 
		}
		
	}

}
