package chap6;

import java.util.Arrays;

class B {
	
	int m1() {
		int local = 10;
		return local * 10;
		
	}
	
	int m2(int param) {
		return param * 10;
	}
	
	String m3(int param1, int param2) {
		return param1 * param2 + " 결과를 리턴합니다.";
	}
	
	// 참조형 변수 전달 예시
	/*
	int[] m4(int[] ar) { // 주소가 복사되어 넘어감
		
		int[] result = new int[ar.length];
		
		// ar 배열 각 요소에 * 10 배열 저장 리턴
		for (int i = 0; i < ar.length; i++) {
			result[i] = ar[i] * 10;
		}
		
		return result;
	}
	
	int[] m4(int[] ar) {
		
		
		// ar 배열 각 요소에 * 10 배열 저장 리턴
		for (int i = 0; i < ar.length; i++) {
			ar[i] = ar[i] * 10;
		}
		
		return ar;
	}
	*/
	void m4(int[] ar) {
		
		
		// ar 배열 각 요소에 * 10 배열 저장 리턴
		for (int i = 0; i < ar.length; i++) {
			ar[i] = ar[i] * 10;
		}
	}
	
	
	void m5() {
		System.out.println("B클래스에서 메서드를 테스트합니다.");
		//return; // 이것도 가능
	}
}

public class MethodTest {

	public static void main(String[] args) {
		
		B b1 = new B();
		int result1 = b1.m1();
		System.out.println(result1); // 결과 고정
		System.out.println(b1.m2(5));
		System.out.println(b1.m2(50));// 매개변수에 따라 결과가 달라짐 
		System.out.println(b1.m3(6, 8)); // String 리턴
		
		int main_ar[] = {10, 20, 45, 1, 99};
		//int[] main_result = b1.m4(main_ar);
		//System.out.println(Arrays.toString(main_result)); // 반복문 없이 배열 출력
		
		// call by reference 예제
		b1.m4(main_ar);
		System.out.println(Arrays.toString(main_ar)); // [100, 200, 450, 10, 990]
		
		b1.m5();
		
		
		
	}

}
