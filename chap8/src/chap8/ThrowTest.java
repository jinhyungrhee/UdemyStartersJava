package chap8;

class Test2 {
	
	void m1(int i) throws NumberFormatException{ // throws -> 다른 곳(=호출한 곳)에서 예외처리
		// i 소수인지 판단
		// 소수 - 1과 자신으로만 나누어지는(나머지 0) 자연수
		// 범위 : 1 - 자신의 수 / 나머지 0인경우 : 2개 => 소수
	
		// 음수 입력받았을 때는 수행되지 않도록 예외처리
		if (i <= 0) {
			// throw -> 예외 강제 발생 - 중단
			throw new NumberFormatException("자연수만 가능합니다(음수 불가)");
			
		}
		
		int count = 0;
		for (int index = 1; index <= i; index++) {
			if (i % index == 0) {
				count++;
			}
		}// for end
		
		if (count == 2) {
			System.out.println(i + " 소수이다.");
		} else {
			System.out.println(i + " 소수 아니다.");
		}
		
	}
	
}
public class ThrowTest {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		try {
			t2.m1(-13); // 예외발생 - try문 중단 catch문 이동 - "음수" 
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		t2.m1(13);
			
	}

}
