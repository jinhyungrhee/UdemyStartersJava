package chap3;

public class OperatorTest {

	public static void main(String[] args) {
		// + - * / % ++ --
		int avgInt = 10 / 3; // 3
		//double avgDouble = 10.0 / 3.0;
		double avgDouble = 10 / (double) 3;
		
		System.out.println(avgInt); // 3
		System.out.println(avgDouble); // 3.33333..5
		System.out.println(10 % 3); // 1
		
		int a = 10;
		int b = 20;
	
		// a = a + b - 1 * 3 / 5;
		// 연산 우선순위 : () > */ > +- > =
		
		// a = a + b;
		a += b; // 덧셈(우선순위 높음) 먼저하고 그 다음에 대입(우선순위 낮음)
		
		/*
		[단항연산자, 이항연산자]
		형변환연산자 (데이터타입)       : 단항
		산술연산자 ++ -- + - * / %  : 단항
		비교연산자 == != > >= < <=  : 이항
		논리연산자 &&, ||, !        : 이항
		대입연산자 = += -=          : 이항
		 
		[삼항연산자]
		조건삼항연산자 조건식(t/f) ? true연산결과 : false연산결과 : 삼항 
		
		자바언어에는 typeof 연산자 없음!
		자바언어에는 데이터타입변환 연산자는 있음!
		
		*연산자우선순위* : (괄호) > 단항 > 이항(산술>비교>논리) > 삼항 > 대입연산(=)
		(char) i
		(char) ++i : 값 증가 먼저하고 형변환
		(char) i++ : 형변환 먼저하고 값 증가
		*/
		
	}

}
