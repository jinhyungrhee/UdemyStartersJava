package generic1;

class Apple {
	
	String origin;

	public Apple(String origin) {
		this.origin = origin;
	}
	
}

class Paper {
	
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
class Box<T> {
	
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

		System.out.println(aBox.contents.origin); // 형변환하지 않고도 변수 사용 가능
		System.out.println(pBox.contents.size); // 형변환하지 않고도 변수 사용 가능
		
		Box wBox = new Box(new Wine("로제와인")); 
		
	}

}
