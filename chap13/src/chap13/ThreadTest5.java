package chap13;

class JoinThread extends Thread {
	int i = 1;
	public void run() {
		i = 10;
		System.out.println("run 메서드 내부 = " + i);
	}
}

public class ThreadTest5 {

	public static void main(String[] args) {
		
		JoinThread t = new JoinThread();
		// run 수행 - 즉각 run 실행 안될 수도 있음 - run 가능 상태로 만듦(실행시키는 것은 스케쥴러)
		t.start(); // t: 실행가능상태. main:실행상태
		try {
			t.join(); // t:실행상태. main:일시중단상태
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("main메서드 내부 = " + t.i); // 1
		System.out.println("main 종료");
		
		
	}

}
