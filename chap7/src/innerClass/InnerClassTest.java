package innerclass;

class Outer {
	
	int i = 10; // 멤버변수
	void mo() {
		System.out.println(i + new Inner().j); // 외부클래스의 메서드는 내부클래스 요소에 접근 불가
	}
	
	class Inner { // 멤버변수처럼 취급
		int j = 20;
		
		void mi() {
			System.out.println(i - j); // 내부클래스 메서드는 외부클래스 요소에 접근 가능
		}
	}

}

public class InnerClassTest {

	public static void main(String[] args) {
		
		//Inner i = new Inner();
		
		/*
		// Outer 클래스 객체가 먼저 생성되어 있어야 함!
		Outer o = new Outer();
		// Outer 클래스에 포함되어 있는 Inner 클래스 객체 생성
		Outer.Inner inner =  o.new Inner ();
		
		System.out.println(o.i); // Outer클래스의 멤버변수(i) : 10
		System.out.println(inner.j); // Inner클래스의 멤버변수(j) : 20
		*/
		
		// 또는 
		Outer.Inner inner = new Outer().new Inner();
		
		
		System.out.println(new Outer().i); // Outer클래스의 멤버변수(i) : 10
		System.out.println(inner.j); // Inner클래스의 멤버변수(j) : 20
	}

}
