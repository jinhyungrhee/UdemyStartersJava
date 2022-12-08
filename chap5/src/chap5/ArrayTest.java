package chap5;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		// 배열선언(둘 다 가능)
		/*
		int []arr;
	  	int arr2[];
	  	
	  	// 배열 생성
	  	arr = new int[5];
	  	*/
	  	
	  	// 배열 선언하면서 생성
	  	int []arr = new int[5]; // 같이 따라서 바뀌어야햐는 부분 **
		System.out.println("arr 배열의 길이 = " + arr.length);
		
		System.out.println("정수배열의 자동초기화 값");
		for (int i = 0; i < arr.length; i++) { // 같이 따라서 바뀌어야햐는 부분 **
			System.out.print(arr[i] + " - ");
		}
		
		//값 입력
		//arr[0] = 10;
		//arr[1] = 20;
		//arr[index] = (index + 1) * 10;
		
		System.out.println("\n정수배열의 사용자저장 값");
		for (int i = 0; i < arr.length; i++) { // 같이 따라서 바뀌어야햐는 부분 **
			// 값 입력
			arr[i] = (int)(Math.random() * 50) + 1; // 1 - 50 난수 생성
			System.out.print(arr[i] + " - ");
		}
		
		System.out.println();
		
		/*
		int minVal = 1000; // 최소값 저장 변수. 50보다 큰 값으로 초기화
		// arr = [23, 49, 50, 1, 5]
		for (int i = 0; i < arr.length; i++) {
			if (minVal > arr[i]) { // i=0(만족), i=1(불만족), i=2(불만족), i=3(만족), i=4(불만족)
				// minVal과 arr[i] 바꾸기
				int temp = arr[i];
				arr[i] = minVal;
				minVal = temp;
			}
			//System.out.println(i + " 번째 데이터 반복 후 " + minVal);
		}
		
		System.out.println(" 최소값 = " + minVal);
		*/
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[0] > arr[i]) { // i=0(만족), i=1(불만족), i=2(불만족), i=3(만족), i=4(불만족)
				// arr[0]과 arr[i] 바꾸기
				int temp = arr[i];
				arr[i] = arr[0];
				arr[0] = temp;
			}
			System.out.println(i + " 번째 데이터 반복 후 " + arr[0]);
		}
		System.out.println(" 최소값 = " + arr[0]);
		
		// 오름차순 정렬
		
		
	}

}
