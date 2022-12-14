package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		 List<Character> characters = List.of('A', 'Z','A', 'B', 'Z', 'F');
		 
		 // unique - Set
		 // Tree : 알파벳 순서(정렬), 중복 제거
		 Set<Character> treeSet = new TreeSet<>(characters);
		 System.out.println("treeSet : " + treeSet); // [A, B, F, Z]
		 // LinkedHash : 입력 순서, 중복 제거
		 Set<Character> linkedHashSet = new LinkedHashSet<>(characters);  
		 System.out.println("linkedHashSet : " + linkedHashSet); // [A, Z, B,  F]
		 // Hash : 알파벳 순서 X, 입력 순서 X, 중복 제거
		 Set<Character> hashSet = new HashSet<>(characters);
		 System.out.println("hashSet : " + hashSet); // [A, B, F ,Z]
	}

}
