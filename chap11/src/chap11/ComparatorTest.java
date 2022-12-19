package chap11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		String[] animals = {"lion", "cat", "Snake", "tiger", "dog"};
		// 사전 순서 
		// 숫자 < 특수문자일부 < 대문자 < 소문자 < 한글 : 오름차순 정렬 (Arrays.sort)
		
		// <<오름차순 정렬>>
		Arrays.sort(animals);
		//Arrays.sort(animals, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분X
		System.out.println(Arrays.toString(animals));
		
		// <<내림차순 정렬>>
		// 지역 inner 클래스
		class MyComparator implements Comparator{
			
			@Override
			public int compare(Object o1, Object o2) {
				// o1 < o2  : 1리턴
				// o1 > o2 : -1리턴
				// o1 == o2 : 0리턴
				if (!(o1 instanceof String && o2 instanceof String)) {
					return -1;
				}
				
				// String 타입 형변환
				String s1 = (String)o1;
				String s2 = (String)o2;
				// 누가 더 사전순으로 앞에 있는지 뒤에 있는지 비교
				return s1.compareTo(s2) * -1; // 기본적인 오름차순 결과에 -1 곱하면 '내림차순' (=순서 반대) **
			}
	
		}
		// 내림차순으로 정해놓은 기준(mc)
		MyComparator mc = new MyComparator();
		//System.out.println(mc.compare("abc", "def")); // -3 [음수] : 첫번째값이 더 작다  <-> 양수 (첫번째값이 크다) : 3
		//System.out.println(mc.compare("def", "abc")); // 3 [양수] : 첫번째값이 더 크다 (순서바꿔야함) <-> 음수(첫번째값이 작다 - 교환없음) : -3
		//System.out.println(mc.compare("abc", "abc")); // 0
		
		Arrays.sort(animals, mc);
		System.out.println(Arrays.toString(animals));
	}

}
