package chap6;
// 자바 클래스명=자바 파일명 : 기본 원칙
// 아닌 경우 - 조건 : public 키워드 딱 1개 클래스에만 선언되어야 함 (public - 외부에 대표되는 클래스). main 메서드 있는 클래스에 public 붙임.


// 회사원 5개 변수 "클래스" 정의
/*
class Employee {
	int id;
	String name;
	String title;
	String dept;
	double salary;
}
*/

public class EmployeeArrayTest {
	
	// 자바 어플리케이션 클래스 (특정기능부여) - "대장" - main
	public static void main(String[] args) {
		
		// 배열 - Employee 객체만 2개 저장
		Employee arr[] = new Employee[2]; 
		
		Employee e1 = new Employee(); // 객체(복사본) 생성
		e1.id = 100; // 객체참조변수명(주소값).객체내부변수명
		e1.name = "이사원";
		e1.title = "사원";
		e1.dept = "it개발부";
		e1.salary = 10000;
		
		arr[0] = e1;
		
		Employee e2 = new Employee(); // 객체(복사본) 생성
		e2.id = 200;
		e2.name = "김대리";
		e2.title = "대리";
		e2.dept = "인재개발부";
		e2.salary = 15000;
		
		arr[1] = e2;
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			
			System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f 입니다.\n", 
					arr[i].id, arr[i].name, arr[i].title, arr[i].dept, arr[i].salary); // null
		}
		
	}

}
