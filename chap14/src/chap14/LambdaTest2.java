package chap14;

// 함수형 인터페이스1
@FunctionalInterface
interface Calculable {
	int sum(int a, int b); // 추상메서드 하나만 존재
}

// 함수형 인터페이스2
@FunctionalInterface
interface MyFunction {
	public int getValue(int x, int y); // 추상메서드 하나만 존재
}

// 함수형 인터페이스3
@FunctionalInterface
interface GenericInterface<T> {
	public T getValue(T x, T y);
}

public class LambdaTest2 {
	
	static int test(MyFunction fu, int a, int b) {
		return fu.getValue(a, b);
	}
	
	public static void main(String[] args) {
		// ======================= test3 : Generics ================================
		GenericInterface<String> gen = (str1, str2) -> str1 + str2;
		GenericInterface<Integer> gen2 = (str1, str2) -> str1 + str2;
	
		String result = gen.getValue("람다", "식");
		int result2 = gen2.getValue(10, 20);
		System.out.println(result);
		System.out.println(result2);
		
		// ======================= test2 : Parameter ================================
		
		MyFunction mf = (x, y)-> x>y?x:y; // 한 줄이면 return 생략 가능
		int maxValue = test(mf, 10 ,5); // 람다식도 매개변수로 들어갈 수 있음! **
		System.out.println(maxValue);
		
		// ====================== test1 ======================================
		
		// <<함수형 인터페이스 람다식 구현>>
		Calculable calc = null;
		// 1. 무명 클래스 (함수형 인터페이스가 아니어도 무명 클래스는 만들 수 있음)
		calc = new Calculable() {
			
			@Override
			public int sum(int a, int b) {
				return a + b;
			}
		};
		System.out.println(calc.sum(11, 22));
	
		// 2. 람다식 표현
		calc =  (int a, int b) -> { return a + b; }; // 식은 한 문장이므로 세미콜론으로 종료!
		System.out.println(calc.sum(11, 22));
		
		// 2-1. 매개변수 타입 유추 가능하므로 생략!
		calc =  (a, b) -> { return a + b; };
		System.out.println(calc.sum(11, 22));
		
		// 2-2. 실행문 안에 return문 한 줄만 있으면 , return 키워드와 블록 생략 가능!
		calc =  (a, b) -> a + b;
		System.out.println(calc.sum(11, 22));
		
		
	}

}
