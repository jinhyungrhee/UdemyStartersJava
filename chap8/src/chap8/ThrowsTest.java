package chap8;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Test {
	// ArithmeticExcpetion은 Unchecked Exception임
	// unchecked execption이라 throws 안해도 되지만 의미적으로 명확하게 하기 위해 작성!
	void m1(int i) throws ArithmeticException, FileNotFoundException {
		System.out.println(10 / i);
		// ArithmeticException - 반드시 처리구문 존재X (Unchecked Exception)
		
		FileReader fr = new FileReader("none.txt");
		// FileNotFoundException - 반드시 처리구문 (Checked Exception)
		
	}
	
	void m2() {
		try {
			m1(0);
		} catch (ArithmeticException e) {
			try {
				m1(10);
			} catch (FileNotFoundException e2) {
				System.out.println("파일명이나 경로명을 확인하세요.");
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일명이나 경로명을 확인하세요.");
			
		}
	} // m2 end
	
	void m3() throws FileNotFoundException {
		m1(10);
	}
}

public class ThrowsTest {

	// main도 throws 할 수 있음
	// main을 호출한 자바 시스템으로 전달 -> 자바 시스템 기본 예외처리기 동작 : 예외 메시지만 출력
	public static void main(String[] args) throws FileNotFoundException {
		
		Test t = new Test();
		t.m2();

		t.m3(); // m3가 에러를 throws 하고 있으니 메인에서 처리해야 함!
	}

}
