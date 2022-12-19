package test;

import java.util.ArrayList;
import java.util.List;

class SameSentence {
	
	String[] compare(List<String> list1, List<String> list2) {

		ArrayList temp = new ArrayList();
		int arrSize;
		
		if (list1.size() == list2.size()) {
		
			arrSize = list1.size();
		
		} else { // 저장 데이터 개수가 다른 경우
			
			arrSize = list1.size() > list2.size() ? list2.size() : list1.size();			
		}
		
		// 비교하여 같은 값 ArrayList에 저장
		for(int i = 0; i < arrSize; i++) {
			if(list1.get(i).equals(list2.get(i))) {
				temp.add(list1.get(i));
			}
		}
		String[] result = new String[temp.size()];
		temp.toArray(result); // ArrayList to String Array
		return result;	
	}

}

public class Test1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("자바는 객체지향 언어입니다");
		list1.add("우리는 용산캠퍼스에서 자바를 배우는 중입니다");
		list1.add("오늘은 컬렉션 프레임워크를 배우죠! ");
		list1.add("내일은 스레드를 배울 예정입니다 ");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("자바는 객체지향 언어입니다");
		list2.add("우리는 청계천에서 자바를 배우는 중입니다");
		list2.add("오늘은 콜렉션 프레임워크를 배우죠! ");
		list2.add("내일은 스레드를 배울 예정입니다 ");

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("자바는 객체지향 언어입니다");
		list3.add("우리는 용산에서 자바를 배우는 중입니다");
		list3.add("오늘은 컬렉션 프레임워크를 배우죠! ");
		
		SameSentence ss = new SameSentence();
		System.out.println("list1, list2에서 같은 내용을 출력합니다");
		
		String[] result1 = ss.compare(list1, list2);
		
		for (String result : result1) {
			System.out.println(result);
		}
		
		
		System.out.println("==============================");
		System.out.println("list1, list3에서 같은 내용을 출력합니다");
		
		String[] result2 = ss.compare(list1, list3);
		
		for (String result : result2) {
			System.out.println(result);
		}
		
	}

}
