package chap13;

class MyThread extends Thread {
	
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.print("mt/");
		}
	}
}

class MyThread2 implements Runnable {
	
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print("t2/");
		}
	}
}

public class ThreadTest1 {

	public static void main(String[] args) { // main스레드 (자바언어자동)
		
		MyThread mt = new MyThread();
		MyThread2 mt2 = new MyThread2();
		Thread t2 = new Thread(mt2);
		mt.setPriority(10);
		t2.setPriority(1);
		System.out.println("mt 우선순위 = " + mt.getPriority());
		System.out.println("t2 우선순위 = " + t2.getPriority());
		System.out.println("main 우선순위 = " + Thread.currentThread().getPriority());
		mt.start(); // run 호출
		t2.start(); // run 호출
		System.out.println("main 종료");
		
	}

}
