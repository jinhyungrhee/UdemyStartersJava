package test;

/*
 * 교육생 객체 표현 클래스 - 이름 자유
 * 1.변수(6개) - 이름, 과정명, 교육기관, 교육비, 부가금, 환급비
 * 2.단, 교육기관 = '새싹' 으로 모든 교육생 동일(공유 가능 -> static)
 * 3.단, 부가금 = 5000원 고정 (수정 불가능, 공유X) -> 어떤 modifier 붙이면 되는지 고민
 * 4. 메서드 - calc()
 * 	 4-1. 과정명이 "자바"면 환급금 = 교육비의 20% + 부가금
 *   4-2. 과정명이 "jsp"이면 환급금 = 교육비의 15% + 부가금*2
 *   4-3. 과정명이 "spring"이면 환급금 = 교육비의 10% + 부가금
 *   4-4. 그 외의 과정명은 환급금 = 0
 * 
 * 실행 main 메서드 클래스
 * */

class Student {
	
	String name;
	String course;
	static String institute = "새싹";
	int cost;
	final int penalty = 5000;
	int refund;
	
	void calc(String course) {
		
		
		if (course.equals("자바")) {
			refund = (int)(cost * 0.2) + penalty;
		} else if (course.equals("jsp")) {
			refund = (int)(cost * 0.15) + (penalty * 2);
		} else if (course.equals("spring")) {
			refund = (int)(cost * 0.1) + penalty;
		} else {
			refund = 0;
		}
		
		return; 
	}
	
	
}

public class Test1 {

	public static void main(String[] args) {
	
		//교육생 a1 = new 교육생();
		//이름, 과정명, 교육비 - 실행시 명령행 매개변수로 입력받은 값으로 할당 (초기 string값)
		// 교육생 환급비 계산 메서드 호출
		// 리턴 결과 출력
		// 이름 : xxx
		// 과정명 : xxx
		// 교육비 : xxx
		// 교육기관 : 새싹
		// 부가금 : 5000
		// 환급비 : xxx
		
		Student a1 = new Student();
		// 홍길동 자바 50000 -> String
		a1.name = args[0];
		a1.course = args[1];
		a1.cost = Integer.parseInt(args[2]);
		a1.calc(a1.course);
		
		System.out.printf("이름 : %s\n과정명 : %s\n교육비 : %d\n교육기관 : %s\n부가금 : %d\n환급비 : %d", a1.name,a1.course, a1.cost, Student.institute, a1.penalty, a1.refund);
		
	}

}
