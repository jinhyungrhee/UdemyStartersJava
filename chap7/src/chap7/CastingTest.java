package chap7;


class Parent {
	int su = 10;
	void print() {
		System.out.println(su); // 10
	}
	// non-overriding 메서드 (부모만의 메서드)
	void mp() { 
		System.out.println("Parent클래스");
	}
}

class Child1 extends Parent {
	// int super.su = 10;
	int su = 20;
	// overriding 메서드
	void print() {
		System.out.println(su); // 20
		// super.su를 쓰려면 오버라이딩을 하지 말아야 함!
	}
	// 자식만의 메서드
	void mc() { 
		System.out.println("Child1클래스");
	}
}

class Child2 extends Parent {
	int su = 30;
	// overriding
	void print() {
		System.out.println(super.su + su); // 10 + 30 = 40
	}
	
	void mc2() {
		System.out.println("Child2클래스"); // 자식 추가
	}
}

public class CastingTest {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		System.out.println(p1.su); // 10
		p1.print(); // 10
		p1.mp();
		//p1.mc(); // 메모리존재X
		
		Child1 c1 = new Child1();
		System.out.println(c1.su); // 20
		c1.print(); // 20
		c1.mp();
		c1.mc();
		
		// 자동 형변환 (자식 -> 부모) - 자식클래스로 생성
		Parent p2 = new Child1();
		System.out.println(p2.su);//10 (부모 멤버 변수 출력)
		p2.print(); // 20 (자식의 오버라이딩된 메서드 실행됨 - this.su)
		p2.mp(); // Parent 메서드
		//p2.mc(); // 메모리존재O
		
		// mc - 원래 자식 클래스에 포함되어 있던 메서드 사용하려면, 원래의 자식타입으로 바꿔줘야 함!
		// *명시적 형변환 발생*
		//Child1 c2 = (Child1) p2;
		//c2.mc();
		
		if (p2 instanceof Child1) { // 형변환 가능한지 물어보는 것 -> 실행오류 피하는 법
			((Child1)p2).mc();
		} else {
			System.out.println("p2는 Child1 타입 형변환 불가");
		}
		
		Parent p3 = new Child2(); // 자동 형변환 발생
		System.out.println(p3.su); // 사용변수 - Parent
		p3.print(); // 오버라이딩메서드 = Child2
		
		//((Child1)p3).mc(); // Child1에도 mc메서드가 있어서 컴파일 에러는 나지 않지만, 런타임 에러 발생
		// p3이 최초에 만들어진 타입으로 바뀌어야 함 (-> Child2 )
		// Exception in thread "main" java.lang.ClassCastException: class chap7.Child2 cannot be cast to class chap7.Child1 (chap7.Child2 and chap7.Child1 are in unnamed module of loader 'app')
		// at chap7.CastingTest.main(CastingTest.java:74)

		if (p3 instanceof Child2) {
			((Child2)p3).mc2(); // 명시적 형변환하여 Child2(자식클래스)의 mc2메서드 실행
		} else {
			System.out.println("p3 Child2 타입 형변환 불가");
		}
		
	}

}
