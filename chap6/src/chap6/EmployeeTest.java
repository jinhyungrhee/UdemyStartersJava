package chap6;
// 자바 클래스명=자바 파일명 : 기본 원칙
// 아닌 경우 - 조건 : public 키워드 딱 1개 클래스에만 선언되어야 함 (public - 외부에 대표되는 클래스). main 메서드 있는 클래스에 public 붙임.


// 회사원 5개 객체변수 "클래스" 정의 (지역변수x, 클래스변수x, 매개변수x)
class Employee {
	int id;
	String name;
	String title;
	String dept;
	double salary;
	
	void printInform(String name) {
		
		int id = 1000; 
		
		System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f 입니다.\n ", 
				this.id, this.name, title, dept, salary); // this를 꼭 붙이지 않아도 됨!(구분할 필요가 있을 때만 붙임 -> 지역변수와 객체변수의 이름이 동일한 경우)
	}
}

public class EmployeeTest {
	
	// 자바 어플리케이션 클래스 (특정기능부여) - "대장" - main
	public static void main(String[] args) {
		
		// 배열 - Employee 객체만 10개 저장
		Employee arr[] = new Employee[10]; 
		
		Employee e1 = new Employee(); // 객체(복사본) 생성
		e1.id = 100; // 객체참조변수명(주소값).객체내부변수명
		e1.name = "이사원";
		e1.title = "사원";
		e1.dept = "it개발부";
		e1.salary = 10000;
		
		e1.printInform("1");
		
//		System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f 입니다.\n ", 
//				e1.id, e1.name, e1.title, e1.dept, e1.salary); // null
		
		Employee e2 = new Employee(); // 객체(복사본) 생성
		e2.id = 200;
		e2.name = "김대리";
		e2.title = "대리";
		e2.dept = "인재개발부";
		e2.salary = 15000;
		
		e2.printInform("2");
		
//		System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f 입니다.\n ", 
//				e2.id, e2.name, e2.title, e2.dept, e2.salary); // null
		
	}

}
