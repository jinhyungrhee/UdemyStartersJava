package chap9;

public class StringBufferTest {

	public static void main(String[] args) {
		
		// CharSequence는 String 종류임
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("초기값");
		StringBuffer sb3 = new StringBuffer(100);
		
		
		// 용량(capacity) : 저장할 수 있는 크기
		System.out.println("sb1의 용량 = " + sb1.capacity()); // 16
		System.out.println("sb2의 용량 = " + sb2.capacity()); // 19
		System.out.println("sb3의 용량 = " + sb3.capacity()); // 100
		
		
		// append
		System.out.println("sb1의 문자열 개수 = " + sb1.length()); // 0
		System.out.println("sb2의 문자열 개수 = " + sb2.length()); // 3
		System.out.println("sb3의 문자열 개수 = " + sb3.length()); // 0
		sb2.append("추가한값");
		sb2.append("추가한값");
		sb2.append("추가한값");
		sb2.append("추가한값");
		sb2.append("추가한값");
		System.out.println("문자열 추가 후 sb2의 용량 = " + sb2.capacity()); // 40
		System.out.println("sb2의 문자열 개수 = " + sb2.length()); // 23
		
		
		// delete()
		System.out.println("Sb2 삭제 전 내용 = " + sb2);
		sb2.delete(0, 10); // 10번 인덱스까지 삭제
		System.out.println("sb2의 문자열 개수 = " + sb2.length()); // 13
		System.out.println("Sb2 삭제 후 내용 = " + sb2);
		
		
		// reverse()
		System.out.println(sb2.reverse());
		
		
		/*
		String s2 = new String("초기값");
		System.out.println(s2.length()); // 3
		System.out.println(s2 + "추가한값");
		System.out.println(s2.length()); // 3
		*/
		
		
		

	}

}
