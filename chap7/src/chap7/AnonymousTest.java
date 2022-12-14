package chap7;


interface I1 {
	void m1();
	
}

interface I2 {
	void m2();
}
	

/*
class Anon implements I1, I2 {
	
	public void m1() { }
	public void m2() { }
}
*/


public class AnonymousTest {

	public static void main(String[] args) {
		
		//Anon a = new Anon();
		// a.new I1(); // 인터페이스 타입이라 직접 객체를 생성할 수 없음
		
		// 여러 인터페이스 중 일부를 분리시키는 것*
		// => 인터페이스와의 관계를 좀 더 명확하게 표현하기 위해! **
		
		//class Anon implements I1 {
		I1 i1 = new I1() { // "이름없는 class 블록 {}" -> i1을 상속받자마자 m1메서드 오버라이딩
			
			public void m1() {
			
				System.out.println("m1 호출");
			
			} // m1 method end
		
		}; // new I1();
		
		// => I1 인터페이스를 상속을 받은 클래스(무명 클래스)를 정의해주고, 동시에 객체를 생성하는 문장 작성
		// => 해당 무명클래스의 객체를 생성하고 타입을 인터페이스 타입으로 형변환 하는 것!
		i1.m1();
		
		// ===============================================================================
		
		// 더 축약된 표현 -> 객체도 일회용으로 사용
		new I1() {
			public void m1() {
				System.out.println("m1 호출");
			}
		}.m1();
		
		// ===============================================================================
		
		I2 i2 = new I2() {
			public void m2() {
				System.out.println("m2 호출");
			}
		};
		
		i2.m2();
	}

}
