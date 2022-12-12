package constructor;

public class VarInitTest {

	// 객체 변수
	// 객체 변수를 선언 -> "자동" 초기화
	int a;
	double b;
	String c;
	
	// 생성자
	VarInitTest(int a, double b) {
		this.a = a;
		this.b = b;
		//c = "생성자에서 사용";
	}
	// "초기화 블럭"(이름없는 블럭) : 여러객체 생성 시 공통변수값 초기화 시킬 때 사용
	{
		c = "초기화블럭에서 사용";
	}
	
	public static void main(String[] args) {
		
		// 지역변수
		// 지역변수는 자동 초기화되지 않음 -> 사용자 초기화 필요!
		int d = 0;
		System.out.println(d);
		
		// 자기 자신 클래스의 변수를 쓸 때도 객체 생성한 뒤에 사용해야함 -> main이 static 메서드이기 때문!
		// 객체마다 생성될 때 값이 달라져야 하는 경우 -> 생성자 필요!
		VarInitTest test = new VarInitTest(100, 100.99);
		VarInitTest test2 = new VarInitTest(1000, 1000.99);
		System.out.printf("a = %d, b = %f, c = %s\n", test.a, test.b , test.c);
		System.out.printf("a = %d, b = %f, c = %s\n", test2.a, test2.b , test2.c);
		
	}

}

// static 메서드에서는 static 변수만 사용 가능