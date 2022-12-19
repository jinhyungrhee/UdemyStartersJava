package chap11;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		// 식별자-데이터값
		HashMap<String, String[]> map = new HashMap<>();
		// 배열을 값(value)으로 대입
		map.put("hong@email.com", new String[]{"홍길동", "010-2222-2222", "031-444-5555", "02-111-2222"});
		
		map.put("lee@email.com", new String[]{"이자바", "2000-12-12"});
		map.put("lee@sba.net", new String[]{"김새싹", "용산캠퍼스"});
		map.put("hong@email.com", new String[] {"홍자바", "010-2222-2222", "031-444-5555", "02-111-2222"}); // 수정
		System.out.println(map.size());
		
		// 조회
		// 키들을 조회
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String[] value = map.get(key); // Object->String[] 명시적형변환
			System.out.println("키=" + key);
			for (String elem : value) {
				System.out.print(elem + " ");
			}
			System.out.println();
		}
		
		//Object o = map.get("hong@email.com");
		//System.out.println(o);
		//System.out.println(map.toString());

	}

}
