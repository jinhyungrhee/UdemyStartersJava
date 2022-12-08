package chap4;

public class ForTest {

	public static void main(String[] args) {
		
		char star = '*';
		
		// count만큼 한 줄에 반복 출력 (1 - 20 난수)
		int count = (int) (Math.random() * 20) + 1;
		
		// 출력줄 개수 1 -10 난수
		int lines = (int) (Math.random() * 10) + 1;
		System.out.println(lines + " 줄에 " + count + " 개수만큼 출력합니다");
		
		// 이중 for loop
		/*
		for (int j = 1; j <= lines; j++) {
			
			for (int i = 1; i <= count; i++) {
			
				System.out.print(star);
			
			} // end of inner for loop
			
			System.out.print("\n");
		} // end of outer for loop
		*/
		
		for (int j = 1; j <= lines; j++) {
			
			for (int i = 1; i <= j+1; i++) {
				
				System.out.print(star);
			
			} // end of inner for loop
			
			System.out.print("\n");
		} // end of outer for loop
	}

}


// 과제물
// 5줄 출력
//    *
//   ***
//  *****
// *******
//*********