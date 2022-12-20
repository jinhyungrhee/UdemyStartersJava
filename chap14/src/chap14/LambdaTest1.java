package chap14;

// 1. Runnable 구현 클래스 
class MyThread implements Runnable {

	// 변수 생성자 메서드 추가
	// 반드시 오버라이딩 필요
	@Override
	public void run() {
		System.out.println("Runnable 구현 자식 클래스 실행");
	}
		
}

public class LambdaTest1 {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		
		// 2. Runnable 구현 내부 클래스
		class MyInnerThread implements Runnable {
			@Override
			public void run() {
				System.out.println("Runnable 구현 내부 클래스 실행");
			}
		} // end MyInnerThread
		
		// Inner Class를 사용하여 쓰레드 생성
		Thread t2 = new Thread(new MyInnerThread());
		t2.start();
		
		
		// 3. Runnable 구현 무명 클래스 - 정의 동시에 객체까지 생성
		// Runnable 안의 run().메서드는 반드시 상속받아야 하고 이 동작은 여기에서 한번만 실행됨
		// 여러개 만들 필요가 없으므로 이름없는 클래스로 생성
//		Runnable r3 = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Runnable 구현 무명 클래스 실행");
//			}
//		}; // 무명 클래스
//		
//		Thread t3 = new Thread(r3);
		
		// 더 줄임 - 1
		
//		Thread t3 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Runnable 구현 무명 클래스 실행");
//			}
//		});
//		t3.start();
		
		// 더 줄임 - 2
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable 구현 무명 클래스 실행");
			}
		}).start();
		
		// 람다식 - 함수형 인터페이스(추상 메서드1개만), 구현 인터페이스 이름, 객체 생성, 오버라이딩 메서드 이름 생략
		// 람다식 <=> 함수형 인터페이스(추상메서드 딱1개)  
		// 람다식의 타입은 Runnuble 타입 - run 메서드 오버라이딩 했기 떄문ㅇ
		Runnable r4 =() -> { System.out.println("Runnable 구현 람다식 실행"); };
		// 추상 메서드가 하나(=함수형 인터페이스)이기 때문에 이름을 주지 않아도 무엇을 오버라이딩해야 하는지 앎
		Thread t4 = new Thread(r4);
		t4.start();

	}

}
