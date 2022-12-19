package chap11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		Stack st = new Stack(); // 동적크기, 중복저장허용, 저장순서(마지막 저장 데이터 우선 조회)
		st.push(1);
		st.push(2);
		st.push(3);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop()); // 꼭대기 조회 후 삭제
			//System.out.println(st.peek());  // 꼭대기 조회
		}
		
		//System.out.println(st.pop()); // 3
		//System.out.println(st.pop()); // 2
		//System.out.println(st.pop()); // 1
		//System.out.println(st.pop()); // EmptyStackException
		
		System.out.println("==================================================");
		
		// Queue : 동적크기, 중복저장, 가장 처음 저장 데이터를 우선 조회
		//Queue qu = new Queue(); 	// Queue는 instance를 만들 수 없음 -> "인터페이스"
		Queue qu = new LinkedList();// Queue를 상속받은 LinkedList를 구현체로 사용!
		qu.offer(1);
		qu.offer(2);
		qu.offer(3);
		while(!qu.isEmpty()) {
			System.out.println(qu.poll()); // 큐에서 데이터 조회 후 삭제
		}
		
		
	}

}
