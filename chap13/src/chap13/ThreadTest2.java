package chap13;

import java.util.Scanner;

class TimeThread extends Thread {
	public void run() {
		
		for (int i = 1; i <= 300; i++) {
			System.out.print("|");
		}
		System.out.println("소요시간2(1/1000초) = " + (System.currentTimeMillis() - ThreadTest2.startTime));
	}
}

public class ThreadTest2 {
	
	// 현재시각을 1/1000초 단위로 측정
	static long startTime = 0;

	public static void main(String[] args) {
		
		TimeThread tt = new TimeThread();
		tt.start(); // cpu에게 멀티스레드로 실행해달라고 요청하는 것 (메서드 호출 즉시 시작X)
		
		startTime = System.currentTimeMillis();
		for (int i = 1; i <= 300; i++) {
			System.out.print("-");
		}
		System.out.println("소요시간1(1/1000초) = " + (System.currentTimeMillis() - startTime));
		
		// 입력 - 멀티스레드 
		Scanner keyin = new Scanner(System.in);
		
		
		
		// 작업 소요 시간을 알고 싶음
//		long endTime = System.currentTimeMillis();
//		System.out.println(endTime - startTime);
	}

}
