// 1. extends Thread
// 2. implements Runnable

class Task1 extends Thread {
	public void run() { // signature (정확히 일치해야 함)
		
		System.out.print("\nTask1 Started");
		
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask1 Done");
		
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		
		System.out.print("\nTask2 Started");
		
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask2 Done");
		
	}
	
}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		
		// Task1
		System.out.println("\nTask1 kicked off");
		Task1 task1 = new Task1();
		//task1.setPriority(10); // 높은 우선순위 적용
		task1.setPriority(1); // 낮은 우선순위 적용
		task1.start(); // 병렬 처리 (Thread 사용)
		
		// Task2
		System.out.println("\nTask2 kicked off");
		Task2 task2 = new Task2();
		// Thread 클래스 객체 생성 필요
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();
		
		// wait for task1 to complete - 특정 Thread의 실행이 끝날때까지 대기 ** 
		// 예외를 발생시키기 때문에 예외처리 필요!
		task1.join();
		task2Thread.join();
		
		// Task3
		System.out.println("\nTask3 kicked off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask3 Done");
		
		System.out.print("\nMain Done");
		
	}

}

// Thread : 유사성을 가진 모든 수행문을 동시에 실행하도록 해줌