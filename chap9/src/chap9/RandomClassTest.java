package chap9;

import java.util.Random;

public class RandomClassTest {

	public static void main(String[] args) {
		/*
		int mathRan = (int) (Math.random() * 100) + 1; // 1 - 100
		System.out.println("Math.random() 정수 = " + mathRan);
		
		Random ran = new Random();
		//ran.nextInt(100); // 정수
		System.out.println("Random 클래스 정수 = " + ran.nextInt(100));
		//ran.nextDouble(100.0); // 실수
		System.out.println("Random 클래스 실수 = " + ran.nextDouble(100.0));
		*/
		
		
		Random ran = new Random();
		for (int i = 1; i <=5 ; i++) {
			System.out.println("Random 클래스 정수 = " + ran.nextInt(100));
		}
		System.out.println("==========================================");
		Random ran2 = new Random(2); // 여러가지 실험에 동일(=일정)한 난수를 사용하기 위해 seed값 사용
		for (int i = 1; i <=5 ; i++) {
			System.out.println("Random 클래스 정수 = " + ran2.nextInt(100));
		}
		/*
		 	Random 클래스 정수 = 8
			Random 클래스 정수 = 72
			Random 클래스 정수 = 40
			Random 클래스 정수 = 67
			Random 클래스 정수 = 89
		 */
	}

}
