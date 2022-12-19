package chap11;

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

		// 동일 타입 데이터만 저장 강제적 규칙. 동적 크기
		
		// Employee 타입의 ArrayList
		// ArrayLiust Employee 타입 매개변수 유사 전달
		// ArrayList 저장 타입 제한
		// => generics
		// 1. 컴파일 타입 체크
		// 2. 형변환 코드 불필요
		// 3. add(Object o) / Object <- get()
		ArrayList<Employee> list = new ArrayList<>(5);
		//list.add("java"); // 참조형 변수
		//list.add(10); // auto-boxing
		//list.add(3.14); // auto-boxing
		
		Employee e1 = new Employee(100, "이사원", 1000000); 
		Employee e2 = new Employee(200, "최대리", 1500000); 
		Employee e3 = new Employee(300, "김부장", 2000000); 
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
	
//		for(int i = 0; i < list.size(); i++) {
//			if (list.get(i) instanceof Employee) {
//				System.out.println(i + "번째 위치 = " + ((Employee)list.get(i)).name);
//			}
//			
//			// Employee name만 출력 
//			// 문제1. Employee가 아닌 것들도 존재(name변수 없는 객체)
//		
//		}
		
		for (int i = 0; i< list.size(); i++) {
			System.out.println(i + "번째 위치 = " + list.get(i));
			// Employee name만 입력
		}
		
	}

}
