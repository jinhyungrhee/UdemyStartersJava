package chap9;

public class WrapperTest {

	public static void main(String[] args) {
		/*
		int i = 10;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.toHexString(i));
		*/
		
		
		
		// 기본 타입을 고수하여 사용
		
		Integer in = new Integer(10); // 10 정수 -> 다양한 메서드 이용 가능
		int i = 10;	// 10 정수 -> 연산자만 이용 가능
		
		// Auto-Boxing & Auto-Unboxing (타입 호환) : [jdk 1.5 이후 추가]
		
		// int와 Integer의 성격이 유사하므로 새로운 문법의 사용이 허용됨 (두개 생성 시 구분을 없앰!)
		// Integer 객체로 int 생성 가능
		int i1 = new Integer(10);
		// int 리터럴로 Integer 생성 가능
		Integer i2 = 10;
		// => ** Wrapper 클래스 타입과 기본형 타입의 경계를 없애는 것! **
	
		// [jdk 1.9 이후 추가] : Integer 생성자 사용 자제 권고
		int i3 = 100; // 둘 다 가능
		Integer i4 = 100; // 둘 다 가능
	}

}
