package chap2;

// 소스파일작성(수동) - 컴파일(자동) - 실행(수동, main 메서드 내부 문장 실행) 
// java application program 형태
public class Hello {

	public static void main(String[] args) {
		// println에서의 ln 의미 : line (줄바꿈 추가)
		System.out.println("Hello 자바");
		//System.out.print("두 번째 줄입니다");
		//System.out.println(" -- 두번째줄 뒤에 붙입니다");
		System.out.println("두번째줄입니다." + " -- 두번째 줄 뒤에 붙입니다");
		System.out.println("세번째줄입니다." + 100 + 200);
		// + 연산자 출력 "자주" 사용
		// + 연산자 기능 2가지
		// 1. 문자열 + 문자열 or 문자열 + 다른 타입 ===> 문자열 결합
		// 2. 정수, 실수 + 정수, 실수 ==> 덧셈
		// 3. 왼쪽부터 연산 수행
		// 4. 우선순위 변경 : 괄호() 사용
		System.out.println("세번째줄입니다." + (100 + 200));
		
	}

}
