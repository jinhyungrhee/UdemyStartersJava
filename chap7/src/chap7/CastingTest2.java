package chap7;


public class CastingTest2 {
	
	void setParent(Parent target) { // 형변환에 의해서 세 개 모두 전달받을 수 있음 -> 어느 것이 전달될지 모르니 한 개의 타입으로 통일!
		Parent p = target;
	}

	public static void main(String[] args) {
		
		CastingTest2  ct2 = new CastingTest2();
		ct2.setParent(new Child1());
		ct2.setParent(new Child2());
		ct2.setParent(new Parent());
		
		/*
		// 배열 내에 여러 객체를 모은 것
		Parent[] array  = new Parent[3];
		// 자동형변환 - 여러가지 타입 객체 1개 타입 통일
		array[0] = new Parent();
		array[1] = new Child1();
		array[2] = new Child2();
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].getClass().getName() + " : "+ i + "번 인덱스 객체 : ");
			array[i].print(); // overriding 메서드 - 서로 다른 메서드
			
			//Child2 객체인 경우에만 mc2 메서드 호출 - instanceof로 어느 타입인지 알아보고 사용(실행오류 방지)
			if (array[i] instanceof Child2) {
				System.out.println("if문 : " + i);
				((Child2)array[i]).mc2();
			}
		}
		*/
	}

}
