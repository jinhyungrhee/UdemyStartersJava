package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2 = {{1, 2}, {3, 4, 5} , {6, 7, 8, 9}};
		System.out.println();
		
		// 반복문 없이 요소 접근하는 방법
		// 1.join -> String 배열만 가능
		// 2. Arrays.toString(); / Arrays.deepToString();
		
		// 1차원 배열 
		System.out.println(Arrays.toString(arr));
		// 2차원 배열
		System.out.println(Arrays.deepToString(arr2));
		
		// 배열 복사
		// int[] arrCopy = Arrays.copyOf(arr, 3);
		
		// 배열 범위 지정 복사
		int[] arrCopy = Arrays.copyOfRange(arr, 2, 5);
		arrCopy[0] = 20;
		// 참조변수 전달 여러 변수 같은 객체 동일 참조
		System.out.println(Arrays.toString(arrCopy));
		System.out.println("기존arr =>" + Arrays.toString(arr));
		
		int[] arr10 = {0, 1, 2, 3, 4};
		int[] arr20 = {0, 1, 2, 3, 4};
		System.out.println(Arrays.equals(arr10, arr20)); // Object 클래스에 있는 equals를 Arrays클래스에서 오버라이딩한 것
		
		int[] ran = {45, 1, 23 ,889, 99};
		Arrays.sort(ran);
		System.out.println(Arrays.toString(ran));
		
		// 타입 변환 - 배열과 ArrayList (유일한 차이 - 타입, 길이)
		List list = Arrays.asList(ran); // ** 배열 -> 리스트 **
		// 인터페이스 타입으로 형변환 -> 인터페이스의 add메서드를 직접 쓸 수 없음
		//list.add(100); // 컴파일 오류는 없음
		
		// ArryList를 배열 변환
		ArrayList list2 = new ArrayList(5);
		list2.add("java");
		list2.add(10);
		list2.add(3.14);
		
		// 서로다른 타입을 저장하려면 배열의 타입은 Object여야함
		Object[] listArr = new Object[list2.size()];
		list2.toArray(listArr); // ** 리스트 -> 배열 **
		System.out.println(Arrays.toString(listArr));

		
	}

}
