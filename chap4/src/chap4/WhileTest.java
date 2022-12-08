package chap4;

public class WhileTest {

	public static void main(String[] args) {
		
		// for문
		/*
		for (int i = 10; i <= 10; i++ ) {
			int test = (int) (Math.random() * 100) + 1;
			System.out.println(test);
		}
		*/
		
		// while문-1
		/*
		int i = 1;
		while (i <= 10) {
			int test = (int) (Math.random() * 100) + 1;
			System.out.println(test);
			i++;
		}
		*/
		
		// while문-2
		/*
		int test = (int) (Math.random() * 100) + 1;
		System.out.println(test);
		//test변수가 50이면 중단
		while(test != 50) { // 50이 아니면 계속 반복
			test = (int) (Math.random() * 100) + 1;
			System.out.println(test);
		}
		*/
		
		// while문-3
		//test변수가 50이면 중단
		while(true) {
			int test = (int) (Math.random() * 100) + 1;
			System.out.println(test);
			if (test == 50) continue; // 종료조건
			if (test % 3 == 0) break; // 3의 배수가 나오면 종료
			// if, for, while, do-while 블록 내부에 1문장만 존재할 시 {} 생략 가능!
		}
		
	} 

}
