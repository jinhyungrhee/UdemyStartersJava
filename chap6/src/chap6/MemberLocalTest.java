package chap6;

class A {
	
	int i; // 클래스 내부 변수 = member variable(멤버 변수, 속성 변수, 프로퍼티)
	
	public void test() {
		int j = 20; // 메서드 지역변수 local variable
		//for (int k = 0; k < 10; k++) {
			// k 사용가능 범위
		//}
		System.out.println(i+j); // k 사용 불가
	}
	
	public void test2() {
		System.out.println(i); // j는 못쓰지만 i는 사용 가능!
	}
}

public class MemberLocalTest {

	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;
		System.out.println(a1.i);
		a1.test();
		//a1.j = 200; // a1.j는 변수로 인식되지 않음. j변수를 test함수 외부에서 사용 불가.
	}

}
