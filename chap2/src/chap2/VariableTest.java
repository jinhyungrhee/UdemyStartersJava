package chap2;

public class VariableTest {

	public static void main(String[] args) {

		// 점수 : 0 ~ 100
		//byte score = 100; // 128
		int score = 99;
		//System.out.println(score);
		
		//score = score + 100; // 200은 score에 저장할 수 없음!
		// System.out.println(score);
		
		int score2 = 95, score3 = 60;
		
		// 정수평균
		int avgInt = (score + score2 + score3 ) / 3;
		
		// 정수 산술연산자 정수 => 정수 (나눗셈의 경우 나머지는 '버림')
		// 실수 산술연산자 정수 => 실수
		// 실수 산술연산자 실수 => 실수
		
		// 실수평균 구하는 법?
		double avgDouble = (score + score2 + score3) / 3.0;
		
		// 출력
		System.out.println("정수평균 = " + avgInt);
		System.out.println("실수평균 = " + avgDouble);
		System.out.println(Math.round(avgDouble));
		
		// 변수 값 변경
		score = 200;
		
		// [상수(final) 예시] 원의 면적 구하기
		int radius = 5; // 반지름
		final double pi = 3.14; // pi값 강제적으로 못바꾸도록 설정
		double area = radius * radius * pi;
		radius = 10;
		// pi = pi + 1;
		area  = radius * radius + pi;
		
		
		// [리터럴]
		// 10이라는 데이터를 한번만 사용할 것이면 굳이 변수에 저장할 필요 X
		System.out.println(10);  // 자바 integer literal - 4byte
		System.out.println(10000000000L); // 자바 long literal - 8byte
		System.out.println(true);// 자바 boolean literal
		System.out.println('a'); // 자바 char literal
		
		
		char c = 'a';
		String s1 = "java 프로그램";
		String s2 = "a"; // 문자가 하나여도 String 타입으로 줄 순 있음(이중따옴표)
		
		
		// 두 값 교환하기
		
		int a1 = 10;
		int b1 = 20;
		
		int c1 = a1;
		a1 = b1;
		b1 = c1;
		
		System.out.println("a1의 값 = " + a1 + ", b1의 값 = " + b1);
		// a1의 값 = 20, b1의 값 = 10
		
		System.out.printf("%d을 표현합니다.\n", 10);
		System.out.printf("%f을 표현합니다.\n", 10.99);
		System.out.printf("%s을 표현합니다.\n", "홍길동");
		System.out.printf("%c을 표현합니다.\n", '웅');
		String loc = "새싹 용산캠퍼스";
		String title = "클라우드 기반 웹 서버 과정";
		int week = 3;
		System.out.printf(
				"우리는 %s에서 %s을 수강합니다.\n현재 %d주째 수강중입니다.\n", loc, title, week);
				/*"우리는 새싹 용산캠퍼스에서 클라우드 기반 웹 서버 과정을 수강합니다.\n현재 3주째 수강중입니다.\n"*/
		
		
		byte b = 127; // -128 ~ 127
		// b = b + 1; // 컴파일 오류
		int ii = b + 1; // 128
		// byte + int => int
		
		byte b2 = (byte)(b + 1); // ?
		// byte(int) => ?
		System.out.println("int 데이터 = " + ii + ", byte 데이터 = " + b2);
		// int 데이터 = 128, byte 데이터 = -128

		
		
	}

}
