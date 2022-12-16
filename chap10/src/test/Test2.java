package test;

import java.util.StringJoiner;

public class Test2 {

	public static void main(String[] args) {

		String url = "http://www.kitri.re.kr:8080/java/test";;
		
		String[] arr = url.split("//")[1].split("[//./:]");
		
		System.out.println("---출력결과---");
		for(String str : arr) {
			System.out.println(str);
		}

	}

}
