package chap6;

class Data {
	int k = 10;
}

class C {
	
	// call by value
	void add(int i) { // 기본형 매개변수(parameter) = 입력변수
		System.out.println(i++);
	}
	
	// call by reference
	void addData(Data d) { // 참조형 매개변수
		System.out.println(d.k++); 
	}
}

public class CallByValueTest {

	public static void main(String[] args) {
		C c1 = new C();
		
		// 기본형 변수 전달 테스트 코드
		int j = 10;
		c1.add(j); // 인수(argument) = 실제로 매개변수로 전달해주는 값
		System.out.println("main에서 add종료 후 j = " + j); // 연관관계가 없으므로 바뀌지 않음
		
		// 참조형 변수 전달 테스트 코드
		Data main_d = new Data();
		c1.addData(main_d);
		System.out.println("main에서 addData 종료 후 main_d= " + main_d.k); // 같은 객체를 가리키므로 변경이 서로에게 영향을 미침
		
	}

}
