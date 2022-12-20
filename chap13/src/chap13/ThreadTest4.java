package chap13;

import javax.swing.JOptionPane;

// 독립적인 작업 쓰레드로 분리
class NumThread extends Thread{
	
	NumThread(String name) {
		super(name); // Thread(String) 생성자 호출 - 이름
	}
	
	public void run() {
		
		// 1초마다 1-10 숫자들 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(getName() + " : " + i); // 출력
			try {
				//숫자 출력 속도 천천
				Thread.sleep(1000); // 1초 대기 - Exception throw 필요
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}


public class ThreadTest4 {

	public static void main(String[] args) {
		
		NumThread nt1 = new NumThread("nt1");
		NumThread nt2 = new NumThread("nt2");
		nt1.start(); // 실행
		nt2.start(); // 실행
		
		
		
	}

}
