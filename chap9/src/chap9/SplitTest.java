package chap9;

import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {

		// 대한민국 공공정보 정보공개 사이트- 공공포털 api
		String address = "서울시:용산구-청파동;전자월드==3층.새싹?아카데미";
		//String[] result = address.split("[:;-]");
		//String[] result = address.split("(:|;|-|==)"); // 소괄호(())쓰면 || 사용가능
		
		// 분리해야 할 대상이 정규식 예약어인 경우 (\\ 앞에 붙임!)
		String[] result = address.split("(:|;|-|==|\\.|\\?)");
		
		
		System.out.println(Arrays.toString(result));

		// 분리기준
		// : - ; ==
		
		
	}

}
