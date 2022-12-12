package constructor;

class Employee {
	// 사용자 정의(매개변수 추가, 문장 추가)
	Employee(int id, String name, String title, String dept, double salary) {
		//System.out.println("Employee 생성자 호출");
		this.id = id;
		this.name = name;
		this.title = title;
		this.dept = dept;
		this.salary = salary;
	}
	// 생성자 overloading
	// 생성자에서 또다른 생성자 호출하는 방법 : this()
	Employee(int id, String name) {
		
		// * 생성자 내에서 또 다른 생성자 호출 *
		// new를 사용하면 또 다른 객체를 생성하는 것이 됨 (객체 추가 생성O)
		// this()를 사용하면 현재 객체에 포함된 생성자를 호출함 (객체 추가 생성X)
		this(id, name, "직급미정", "배치이전", -1);
	}
	
	Employee() {
		this(-1, "미상", "직급미정", "배치이전", -1);
	}
	
	int id;
	String name;
	String title;
	String dept;
	double salary;
	
	void printInform() {
		
		// 지역변수
		int id = 1000;
		
		System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f 입니다.\n ", 
				this.id, this.name, title, dept, salary); 
	}
}

public class EmployeeTest {
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(100, "이사원", "사원", "IT개발부", 10000);
		e1.printInform();
		
		// 사번과 이름만 아는 경우
		// title, dept, salary 모름
		Employee e2 = new Employee(200, "박대리");
		e2.printInform();
		
		// 아무 정보도 없는 경우
		Employee e3 = new Employee();
		e3.printInform();
		
		
	}

}
