package chap13;

import javax.swing.JOptionPane;

// 독립적인 작업 쓰레드로 분리
class NumberThread extends Thread{
	public void run() {
		
		// 1초마다 1-10 숫자들 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i); // 출력
			try {
				Thread.sleep(1000); // 1초 대기 - Exception throw 필요
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}


public class ThreadTest3 {

	public static void main(String[] args) {
		
		NumberThread nt = new NumberThread();
		nt.start(); // 실행
		// 사용자 문자열 입력
		String input = JOptionPane.showInputDialog("값 입력해 보세요");
		System.out.println("입력값 = " + input);
		
		
		
	}

}
