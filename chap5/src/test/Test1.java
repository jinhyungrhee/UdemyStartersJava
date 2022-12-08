package test;

public class Test1 {

	public static void main(String[] args) {
		/*
		 입력변수 - 5
		      *       // 공백 4개(8) 별 1개
		     ***      // 공백 3개(6) 별 3개
		    *****     // 공백 2개(4) 별 5개
		   *******    // 공백 1개(2) 별 7개
		  *********   // 공백 0개(0) 별 9개
		 */
		
		int inputVal = 5;
		
		for (int i = 0; i < inputVal; i++) { // 2 * i + 1
			
			for (int j = i; j < inputVal; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
