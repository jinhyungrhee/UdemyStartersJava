package test;

import java.util.ArrayList;
import java.util.Scanner;

class Calculator2 {
	
	int su1;
	int su2;
	String operator;
	
	Calculator2(int su1, int su2, String operator) {
		this.su1 = su1;
		this.su2 = su2;
		this.operator = operator;
	}

	@Override
	public String toString() {
		
		int result = 0;
		
		if (operator.equals("+")) { result = su1 + su2; }
		else if (operator.equals("-")) { result = su1 - su2; }
		else if (operator.equals("*")) { result = su1 * su2; }
		else if (operator.equals("/")) { result = su1 / su2; }
			
		return su1 + operator + su2 + "=" + result;
		
	}	
}

public class Test1Answer {

	public static void main(String[] args) {
		ArrayList<String> menu = new ArrayList<String>();
		menu.add("덧셈");
		menu.add("뺄셈"); // 1번 인덱스
		menu.add("곱셈");
		menu.add("나눗셈");
		menu.add("프로그램종료");
		
		// 반복해서 보여줄 부분
		while(true) {
		
			System.out.println("계산기를 시작합니다.\n종료하려면 q를 입력하세요.\n메뉴");
			
			for (int i = 0; i < menu.size(); i++) {
				System.out.println( (i+1) + " . " + menu.get(i));
			}
			System.out.print("선택번호입력 : ");
			
			Scanner key = new Scanner(System.in);
			String num = key.next();
			if (num.equals("5") || num.equals("q") ||  num.equals("quit") ||  num.equals("exit")) {
				// return; // main 메서드 종료 = 클래스 종료
				//System.exit(0); // 프로그램 종료
				break;
			} else {
				;
				System.out.print(menu.get(Integer.parseInt(num)-1) + "할 데이터 1 입력 : ");			
				int first = key.nextInt();
				System.out.print(menu.get(Integer.parseInt(num)-1) + "할 데이터 2 입력 : ");
				int second = key.nextInt();
				String operator = null;
				if (num.equals("1")) { operator = "+"; }
				else if(num.equals("2")) { operator = "-"; }
				else if(num.equals("3")) { operator = "*"; }
				else if(num.equals("4")) { operator = "/"; }
				
				Calculator2 calc = new Calculator2(first, second, operator);
				System.out.println(calc);
				
			}	
		}
		
	} // end of main

}
