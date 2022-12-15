package chap9;

import java.util.StringJoiner;

public class JoinTest {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5, 6};
		String[] arr2 = new String[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			// String -> int : Integer.parseInt("");
			// int -> String : String.valueOf(1);
			
			arr2[i] = String.valueOf(arr[i]);
		}
		System.out.println();
		// [방법1] String.join()은 문자열만 가능함
		System.out.println(String.join(" - ", arr2)); // 가운데 구분자(Delimiter)만 지정

		// [방법2] StringJoiner도 문자열만 가능함 (jdk 1.8 이후)
		StringJoiner sj = new StringJoiner(" - ", "(", ")"); // 구분자, 시작문자, 끝문자 지정
		for (int i = 0; i < arr.length; i++) {
			sj.add(String.valueOf(arr[i]));
		}
		
		//System.out.println(sj);
		System.out.println(sj.toString());
		
		
	}

}
