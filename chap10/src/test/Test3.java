package test;

import java.util.Arrays;

public class Test3 {
	

	public static void main(String[] args) {

		String data = "지금 저는 ㅋㅋㅋ 수업중입니다. 정말요? 과제물도 ㅎㅎㅎ 하고 있구요.";
		
		String delResult2 = deleteChar(data, new String[] {".", "ㅋ", "ㅎ", "?", " "});
		
		System.out.println("===> " + delResult2);
		
	}

	private static String deleteChar(String data, String[] strings) {
		
		String result = "";
		String delimiter = "[" + String.join("", strings) + "]";
		String[] arr = data.split(delimiter);
		
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
	
		
		return result;
	}

	

}
