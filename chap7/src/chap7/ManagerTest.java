package chap7;

// 자바 자동 포함 코드 - 1.생성자, 2.Object 클래스(상속)
// java.lang.Object 클래스
// class Employee extends java.lang.Object { ... } 
// -> 자바의 모든 클래스는 Object 클래스를 상속받음! (= 최상위 클래스)
// -> Object 클래스에 포함된 변수나 메서드는 모든 클래스에서 사용 가능함!
// Object 클래스에 포함된 기능 (9장에서 학습)

class Employee { // 회사원
	
	String title = "사원";
	
	int id;
	String name;
	String dept;
	double salary;
	
	void calcSalary(int salary) {
		this.salary = salary * 2;
	}
	// default modifier
	void printAll() {
		System.out.printf("사번 = %d, 이름 = %s, 부서명 = %s, 급여 = %.2f, ", id, name, dept, salary);
	}
}

class Manager extends Employee{ // 관리직 사원

	Manager(int id, String name, String dept, String job) {
		//super.id = id; // super로 사용해도 동일!
		this.id = id;
		//super.name = name;
		this.name = name;
		//super.dept = dept;
		this.dept = dept;
		this.job = job;
	}
	
	String title = "관리직";
	
	void test() { // 상속x, 오버라이딩x, 현재 추가 메서드
		String title = "test메서드 내부";
		System.out.println(title); // 지역변수 title
		System.out.println(this.title); // Manage.title
		System.out.println(super.title); // Employee.title
	}
	
	String job;	
	
	// calcSalary, printAll 메서드 Employee 클래스에서 정의
	// 상속받아 사용
	// printAll() 정보 추가하고 싶음 -> 하위클래스에서 메서드 내용 재정의 (method Overriding)
	
	/*
	void printAll() {
		System.out.printf("사번 = %d, 이름 = %s, 부서명 = %s, 급여 = %.2f\n", id, name, dept, salary);
	}
	*/
	
	// 매개변수가 달라지면 overloading으로 해석하고 넘어감
	// => overriding이 제대로 되지 않음!
	// default modifier에서 좁아지지만 않으면 됨 -> protected, public으로 overrding 가능 (private만 아니면 됨!)
	@Override // @ - 자바 컴파일러에게 알려주는 주석문
	void printAll() { // 선언부(리턴타입, 이름, 매개변수 개수)는 동일해야 함!
		super.printAll();
		System.out.printf("관리직종=%s\n", job);
	}
	
}

// 자바에서 다중 상속이 어려운 이유
// -> '인터페이스'를 사용하여 다중 상속 구현 가능!
/*
class A {
	int i = 10;
}

class B {
	int i = 20;
}

class C extends A, B { // 두 개 이상 클래스 동시 상속이 가능하다고 가정했을 때
	int k = 30;
	// i가 두 개 존재 -> i 구분이 어려움
}
*/

public class ManagerTest{

	public static void main(String[] args) {
		
		Manager m = new Manager(100, "홍길동", "영업부", "영업관리");
		//m.id = 100; // 상속
		//m.name = "홍길동"; // 상속
		//m.dept = "영업부"; // 상속
		//m.job = "영엽관리"; // 자식
		
		m.calcSalary(50000); // 상속받은 그대로 가져다 사용 -> Employee
		
		//System.out.printf("사번 - %d, 이름 - %s, 부서명 - %s, 관리직종 - %s\n", m.id, m.name, m.dept, m.job );
	
		m.printAll(); // 상속받은 뒤 메서드 재정의(Overriding)하여 사용 -> Manager
		// Employee에서 상속받은 메서드 호출하고 싶은 경우
		
		m.test(); 
	}

}
