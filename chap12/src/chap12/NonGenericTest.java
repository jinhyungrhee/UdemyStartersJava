package chap12;

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

class Box {
	
	// 장점 : 자유롭게 여러 타입을 받을 수 있음
	// 매번 바뀔 수 있음
	Object contents;

	public Box(Object contents) {
		this.contents = contents;
	}

	public Object getContents() {
		return contents;
	}

	public void setContents(Object contents) {
		this.contents = contents;
	}

}

public class NonGenericTest {

	public static void main(String[] args) {
		
		Apple a = new Apple("대구");
		Paper p = new Paper("A4");
		
		Box aBox = new Box(a);
		Box pBox = new Box(p);

		// 단점 : 각 타입별로 사용하는 변수가 달라서 일일이 타입 확인(instanceof) 및 형변환 필요
		System.out.println(((Apple)aBox.contents).origin); // 형변환
		System.out.println(((Paper)pBox.contents).size); // 형변환
		
	}

}
