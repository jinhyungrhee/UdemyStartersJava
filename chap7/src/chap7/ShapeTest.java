package chap7;

abstract class Shape {
	
	abstract void area(); // 면적
	abstract void circum(); // 둘레
	void print() { // 구체메서드는 자식클래스가 반드시 오버라이딩 하지 않아도 됨 
		System.out.println("면적과 둘레 출력");
	}
	
}

class Rectangle extends Shape{
	int width, height;
	
	Rectangle(String width, String height) {
		this.width = Integer.parseInt(width);
		this.height = Integer.parseInt(height);
	}

	@Override
	void area() {
		System.out.println("가로 = " + width + "세로 = " + height + "인 사각형의 면적 : " + (width * height));
	}

	@Override
	void circum() {
		System.out.println("가로 = " + width + "세로 = " + height + "인 사각형의 둘레 : " + (2 * (width + height)));
	}
	
}

class Circle extends Shape {
	int radius;
	static final double pi = 3.14;
	
	Circle(String radius) {
		this.radius = Integer.parseInt(radius);
	}
	
	@Override
	void area() {
		System.out.println("반지름 = " + radius + "인 원의 면적 : " + (radius * radius * pi));
	}
	@Override
	void circum() {
		System.out.println("반지름 = " + radius + "인 원의 둘레 : " + (2 * pi * radius));
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		
		// 명령행 매개변수 입력
		// rect 6 8 - 3개 입력받고 첫번째 입력값 "rect"이면
		// Rectangle 객체 생성
		// 면적 - area() 메서드 호출 - 두번째(가로), 세번째(세로) 계산하여 면적 출력 
		// 둘레 - ...
		
		
		// cir 5 - 2개 입력받고 첫번째 "cir"이면
		// Circle 객체 생성
		// 두번째 반지름, 면적 둘레
		
		// "면적"과 "둘레" 구할 수 있어야 함 -> 구현 반드시 필수적으로 되어 있어야 함
		
		Shape s = null;
		
		if (args.length == 3 && args[0].equals("rect")) {
			
			s = new Rectangle(args[1], args[2]); // Rectangle은 Shape 타입이 될 수 있어야 함("상속"관계)
			
		} else if (args.length == 2 && args[0].equals("cir")) {
			
			s = new Circle(args[1]); // Circle은 Shape 타입이 될 수 있어야 함("상속" 관계)
		
		} else {
			System.out.println("지원되지 않는 도형입니다.");
		}
		
		// s가 Rectangle이건 Circle이건 두 개에 모두 두 메서드가 구현되어 있어야 함
		// Shape 타입이면 2개 필수 포함. 서로 다른 내용 실행 => 다형성(Polymorphism)
		s.area();
		s.circum();
		
	}

}
