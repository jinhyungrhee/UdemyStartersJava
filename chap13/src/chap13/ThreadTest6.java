package chap13;

class Data { 
	int value;
//	void saveValue(int value) {
	synchronized void saveValue(int value) {
		this.value += value;
		System.out.println(Thread.currentThread().getName() + " 쓰레드가 " + value + " 전달 후 " + this.value);
	}
}
class DataThread1 extends Thread{ 
	
	Data data;
	int value;
	
	public DataThread1(String name, Data data, int value) {
		super(name); // Thread 이름으로 사용 (상위클래스 생성자 사용)
		this.data = data;
		this.value = value;
	}
	
	public void run() {
		data.saveValue(value); // 전달받은 data의 메서드 호출
	}
}
//class DataThread2 extends Thread{}


public class ThreadTest6 {

	public static void main(String[] args) {
		
		Data data = new Data();
		// 여러 쓰레드가 하나의 Data객체를 공유함
		DataThread1 dt1 = new DataThread1("dt1", data, 100);
		DataThread1 dt2 = new DataThread1("dt2", data, 200);
		DataThread1 dt11 = new DataThread1("dt11", data, 300);
		DataThread1 dt22 = new DataThread1("dt22", data, 400);
		dt1.start();
		dt2.start();
		dt11.start();
		dt22.start();
		
		

	}

}
