package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// 임의의 기준 생성 - 문자열 길이가 짧은 순서대로 처리
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value1.length(), value2.length());// 길이 오름차순
	}
}


public class QueueRunner {

	public static void main(String[] args) {
		/*
		// 일반적인 오름차순 정렬
		Queue<String> queue = new PriorityQueue<>();
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		*/
		
		// 나만의 기준으로 정렬 : 문자열 길이 오름차순
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
