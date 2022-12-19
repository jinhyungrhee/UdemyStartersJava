package generic2;

import java.util.ArrayList;

//Wine은 안되게 Apple이나 Paper만 받을 수 있도록 함 ***
class Solid {
	public String tellName() {
		return "고체";
	}
}

class Apple extends Solid{
	
	String origin;

	public Apple(String origin) {
		this.origin = origin;
	}
	
}

class Paper extends Solid{
	
	String size;

	public Paper(String size) {
		this.size = size;
	}
	
}

class Wine {
	
	String kind;

	public Wine(String kind) {
		this.kind = kind;
	}
	
}

//미리 타입을 지정해서 받도록 설정
// T : 클래스명 아님. 전달되어지는 "type 매개변수".
// Box : 원시 타입(Raw Class Type) - Box만 봐서는 어떤 타입인지 아직 알 수 없음!
class Box<T extends Solid> { // Solid와 Solid의 자식클래스만 받도록 제한 *** (Wine 제외)
	
	T contents;

	public Box(T contents) {
		this.contents = contents;
	}

	public T getContents() {
		return contents;
	}

	public void setContents(T contents) {
		this.contents = contents;
	}

}

public class GenericTest {

	public static void main(String[] args) {
		
		Apple a = new Apple("대구");
		Paper p = new Paper("A4");
		
		// 타입을 미리 전달하여 해당 타입 전용으로 사용하는 것
		Box<Apple> aBox = new Box<>(a);
		Box<Paper> pBox = new Box<>(p);
		Box<Solid> sBox = new Box<>(new Solid()); // 가능

		// Wine은 안되게 Apple이나 Paper만 받을 수 있도록 함 ***
		// Box wBox = new Box(new Wine("로제와인")); // 컴파일 에러

		System.out.println(aBox.contents.origin); // 형변환하지 않고도 변수 사용 가능
		System.out.println(pBox.contents.size); // 형변환하지 않고도 변수 사용 가능
		
		//ArrayList<Solid> list = new ArrayList<Apple>(); // 잘못된 문장
		ArrayList<Solid> list = new ArrayList<>(); // 일단 Solid로 타입 지정하고-
		list.add(a); // 하위타입 객체들 저장
		list.add(p); 
		
		
	}

}
