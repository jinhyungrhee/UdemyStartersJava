package chap7;

class A {
	
	int i;
	A(String s) {
		// super(); // 생략되어 있음 -> 상위 클래스 생성자 먼저 호출
		i = 10;
		System.out.println("A생성자호출");
	}
}

class B extends A {
	
	
	int j;
	B() {
		super("test");
		// super(); // 생략되어 있음 -> 상위 클래스 생성자 먼저 호출
		j = 20;
		System.out.println("B생성자호출");
	}
}

public class SuperTest {

	public static void main(String[] args) {
		
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
		
		
	}

}
