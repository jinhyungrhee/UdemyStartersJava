package chap12;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		// 22명의 성적 저장 -> ArrayList
		// 100 사이 소수 저장, 로또 번호 생성 -> HashSet
		
		HashSet set = new HashSet(10);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(5); // 똑같은 데이터 저장 -> 무시(오류X)
		System.out.println(set.size()); // 5
		
		System.out.println("===============================");
		
		HashSet lottoSet = new HashSet(6);
		
		while(true) {
			int ran = (int)(Math.random()*45) + 1; // 1~45 난수 발생
			System.out.println(ran);
			// lottoSet에 rand 변수 값 저장
			lottoSet.add(ran);
			System.out.println("개수==>" + lottoSet.size());
			// lottoSet의 size가 6개가 되면 break
			if (lottoSet.size() == 6) break;
		}
		
		System.out.println("\n================================\n");
		
		// lottoSet 내부 데이터 조회 - "순서없음"
		
		// 방법1) Iterator(반복자) - 순서가 없는 자료형의 경우 반복하기 좋음
		// 데이터 저장 기능 없음
		// 데이터를 반복적으로 조회하는 기능만 존재
		// 연속적인 데이터(다음 데이터)만 조회 가능
		Iterator it = lottoSet.iterator();
		while (it.hasNext()) {
//			it.next();
			System.out.print(it.next() + " ");
		}
		
		System.out.println("\n=================================\n");
		// 방법2) List, Set 배열 모두 사용할 수 있는 반복문 - "개선된 반복문"
		// Collection 자료형에 들어가는 데이터타입은 "Object"임! ** 
		for (Object lotto : lottoSet) {
			System.out.print(lotto + " ");
		}
		
		
		
	}

}
