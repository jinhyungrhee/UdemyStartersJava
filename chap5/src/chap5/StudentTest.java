package chap5;

public class StudentTest {

	public static void main(String[] args) {
		
		if (args.length < 5) {
			System.out.println("최소 5명의 이름을 입력하셔야 합니다!");
			return; // main 메서드 중단
		}
		
		// String 배열 선언 및 생성
		String names[] = new String[5];
		// 초기화(값 할당)
		for (int i = 0; i < names.length; i++) {
			names[i] = args[i] + " 응시자";
		}
		
		// int 배열 선언 및 생성
		int kor[] = new int[names.length];
		// 초기화(값 할당)
		for (int i = 0; i <kor.length; i++) {
			kor[i] = (int) (Math.random() * 100) + 1; 
		}
		
		// int 배열 선언, 생성 및 초기화
		int eng[] = { 96, 100, 66, 89, 49 };
		
		// 2차원 배열 - 국어, 영어 한줄씩
		int scores[][] = new int[2][names.length];
		scores[0] = kor;
		scores[1] = eng;
		
		
		// 입력변수 이름이 홍길동 응시자의 국어점수, 영어 점수, 합계 출력
		// 국어 60%, 영어 40% 비율로 합계 계산
		double sum = 0;
		boolean flag = false;
		for (int i = 0; i < names.length; i++) {
			
			System.out.println(names[i] + " : " + scores[0][i] + " : " + scores[1][i]);
			
			if(names[i].equals("홍길동 응시자")) {
				flag = true;
				sum = ((double)scores[0][i] * (0.6)) +  ((double)scores[1][i] * (0.4));
				int result = (int) sum;
				System.out.printf("%s의 총점은 %d 점입니다.\n", names[i], result);
			} 
		}
		
		if (flag == false) {
			System.out.println("그런 이름의 응시자는 없습니다.");
		}


	}

}
