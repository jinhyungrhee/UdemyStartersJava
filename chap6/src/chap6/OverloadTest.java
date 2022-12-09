package chap6;

class D {
	
	int add(int i, int j) {
		return i + j; // 산술 연산 덧셈
	}
	
	String add(String i, String j) {
		return i + j; // 문자 결합
	}
	
	double add(double i, double j) {
		return i + j;
	}
	 
}

public class OverloadTest {
	

	public static void main(String[] args) {
		
		D d1 = new D();
		String result1 = d1.add("spring", "framework");
		double result2 = d1.add(2.5, 1.1);
		int result3 = d1.add(1, 2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		System.out.println(d1.add(3.14, 5)); // implicit type casting (int -> double)
		System.out.println(d1.add(3, 5.14));
		System.out.println(d1.add(3, 'a')); // 100
		
		int dec = Integer.parseInt("100"); 
		// "100" -> 10진수 변환 (2진수, 8진수, 16진수?)
		int bin = Integer.parseInt("100", 2); // 2진수로 해석
		
		System.out.println(dec); // 100
		System.out.println(bin); // 4 : 2진수 100이 10진수(=4)로 변환돼서 출력됨
		
	}

}
