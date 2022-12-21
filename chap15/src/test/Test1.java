package test;

import java.util.Scanner;

class Calculator {
	
	int data1;
	int data2;
	String operator;

	Calculator(int data1, int data2, String operator) {
		this.data1 = data1;
		this.data2 = data2;
		this.operator = operator;
	}
	
	void print() {
		if (operator.equals("+")) {
			System.out.printf("결과 : %d %s %d = %d\n", data1, operator, data2, data1 + data2);
		} else if (operator.equals("-")) {
			System.out.printf("결과 : %d %s %d = %d\n", data1, operator, data2, data1 - data2);
		} else if (operator.equals("*")) {
			System.out.printf("결과 : %d %s %d = %d\n", data1, operator, data2, data1 * data2);
		} else if (operator.equals("/")) {
			System.out.printf("결과 : %d %s %d = %d\n", data1, operator, data2, data1 / data2);
		}
	}
	
}

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("계산기를 시작합니다.");
			System.out.println("종료하려면 q를 입력하세요.");
			System.out.println("메뉴\n1.덧셈\n2.뺄셈\n3.곱셈\n4.나눗셈\n5.프로그램 종료");
			System.out.println();
			System.out.print("선택번호입력 : ");
			
			int menu = sc.nextInt();
			
			if (menu == 5)  {
				
				System.out.println("프로그램 종료!");
				break;
				
			} else {
				
				int data1 = 0;
				int data2 = 0;
				
				switch(menu) {
					case 1:
						System.out.print("덧셈할 데이터1 입력 : ");
						data1 = sc.nextInt();
						System.out.print("덧셈할 데이터2 입력 : ");
						data2 = sc.nextInt();
						Calculator plus = new Calculator(data1, data2, "+");
						plus.print();
						break;
					case 2:
						System.out.print("뺄셈할 데이터1 입력 : ");
						data1 = sc.nextInt();
						System.out.print("뺄셈할 데이터2 입력 : ");
						data2 = sc.nextInt();
						Calculator minus = new Calculator(data1, data2, "-");
						minus.print();
						break;
					case 3:
						System.out.print("곱셈할 데이터1 입력 : ");
						data1 = sc.nextInt();
						System.out.print("곱셈할 데이터2 입력 : ");
						data2 = sc.nextInt();
						Calculator mul = new Calculator(data1, data2, "*");
						mul.print();
						break;
					case 4:
						System.out.print("나눗셈할 데이터1 입력 : ");
						data1 = sc.nextInt();
						System.out.print("나눗셈할 데이터2 입력 : ");
						data2 = sc.nextInt();
						Calculator div = new Calculator(data1, data2, "/");
						div.print();
						break;
					default: 
						System.out.println("올바른 값을 입력하세요!");
						
				}
				
			}
			
			System.out.println();
			
		}
		
	}

}
