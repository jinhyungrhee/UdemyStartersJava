package test;

public class Test2 {

	public static void main(String[] args) {
		// 입력변수(최소 5개, 최대 10개) - 모든 것은 String 타입으로 입력받음
		// 45 89 100 23 234 567
		
		if (args.length < 5) {
			System.out.println("입력 변수의 개수가 너무 적습니다.");
			return;
		}
		if (args.length > 10) {
			System.out.println("입력 변수의 개수가 너무 많습니다.");
			return;
		}
		
		// 입력된 변수 개수 -> 오름차순 정렬 결과 출력
		// 오름차순 : 작은 것 -> 큰 것
		
		int nums[] = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
		
		// [1000, 45, 89, 100, 23, 234, 567, 1]	
		
		/*
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {				
				if (nums[i] > nums[j] ) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;	
				}
			}
		}
		*/
		
		// selection sort
		for (int i = 1; i < nums.length; i++) {
			for (int j = i; j > 0; j--) {				
				if (nums[j] < nums[j - 1]) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				} else { // 뒤 원소가 더 크면 멈춤
					break;
				}
			}	
		}
		
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		

	}

}
