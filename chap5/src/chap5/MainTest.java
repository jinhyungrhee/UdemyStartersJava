package chap5;

public class MainTest {

	public static void main(String[] args) {

		System.out.println("입력한 변수의 개수 = " + args.length);
		
		System.out.println("입력한 내용은 다음과 같습니다.");
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		// 입력변수 개수 + 1 크기 배열 생성
		String userArr[] = new String[args.length + 1];
		
		
		for (int i = 0; i < args.length; i++) {
			userArr[i] = args[i]; // 새로운 배열에 args 배열 내용 복사
			System.out.println(userArr[i]);
		}
		
		System.out.println("============================================");
		
		userArr[args.length] = "내가 추가한 문자열";
		for (int i = 0; i < userArr.length; i++) {
			System.out.println(userArr[i]); // 결과 확인
		}
		
		// 100 45 - 2개 자바 프로그램 String 타입 입력 덧셈
		// Integer.parseInt()
		// Integer.MAX_VALUE
		System.out.println(args[0] + args[1]);
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		
		// Double.parseDouble(args[0])
		
		String s1 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		String s2 = "java";
		s2 = "jsp";
		
		// 명령행 매개변수, 문자열 1번 메모리 생성되면 고정(불변-immutability); 
		// 동등비교(==, .equals())
		if(s1 == s2) {
			System.out.println("s1 == s2 결과 같다"); // true false
		}
		if(s3 == s4) {
			System.out.println("s3 == s4 결과 같다"); // false false
		}
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2) 결과 같다"); // true false
		}
		if(s3.equals(s4)) {
			System.out.println("s3.equals(s4) 결과 같다"); // true true
		}
	
		
	}

}
