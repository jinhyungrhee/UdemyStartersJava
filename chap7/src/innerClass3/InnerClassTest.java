package innerClass3;

class Outer {
	
	void test() {
		
		class LocalInner { // 지역변수처럼 취급
			int j = 20;
			
			void mi() {
				System.out.println(j); // 내부클래스 메서드는 외부클래스 요소에 접근 가능
			}
		}
		
		// 클래스 정의 후 객체를 생성해야 사용 가능!
		new LocalInner().mi();
		
	}
	
	

}

public class InnerClassTest {

	public static void main(String[] args) {
		
	
		Outer o = new Outer();

		o.test();
	}

}
