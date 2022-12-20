package chap13;

class Buffer {
	int value;
	// 조회가능한 상태인지 저장가능한 상태인지 판별
	boolean available = false; // true : value읽기 가능한 상태 / false : value저장 가능한 상태
	
	//synchronized int getValue() {
	int getValue() {
		
		// 읽을 게 없는데 읽으라는 메서드가 수행되었다면 기다림
		while(available == false) {
//			try {
//				wait(); // thread 일시 중지 (-> notify()를 통해 실행 재개)
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
		System.out.println("조회 : " + value);
		available = false; // 저장할 수 있는 상태로 변경
		//notify(); // wait()하고 있는 Thread 호출
		return value;
	}
	
//	synchronized void setValue(int value) {
	void setValue(int value) {
		
		while(available == true) {
//			try {
//				wait(); // thread 일시 중지 (-> notify()를 통해 실행 재개)
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
		this.value = value;
		available = true; // 읽어갈 수 있는 상태로 변경
		System.out.println("저장 : " + value);
		//notify(); // wait()하고 있는 Thread 호출
	}
	
	
}

// 버퍼에 값을 쓰는 쓰레드
class Producer extends Thread {
	
	Buffer buf;
	Producer(Buffer buf) {
		this.buf = buf;
	}
	public void run() {
		for (int i = 1; i <= 10; i++) {
			buf.setValue(i);
		}
	} 	
}

// 버퍼의 값 읽어가는 쓰레드
class Consumer extends Thread {

	Buffer buf;
	Consumer(Buffer buf) {
		this.buf = buf;
	}
	public void run() {
		for (int i = 1; i <= 10; i++) {
			buf.getValue();
		}
	}
}

public class ThreadTest7 {

	public static void main(String[] args) {
		Buffer buf = new Buffer();
		Producer p = new Producer(buf);
		Consumer c = new Consumer(buf);
		p.start(); // 데이터 저장
		c.start(); // 데이터 조회
	}

}
