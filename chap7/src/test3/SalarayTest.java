package test3;

public class SalarayTest {

	public static void main(String[] args) {
		
		// Employee타입 배열을 선언하여 여러 타입에 대해 대응함 (다형성)
		Employee e[] = new Employee[4];
		
		e[0] = new Employee(1000, "이사원", 10000, 5000);
		e[1] = new Manager(2000, "김간부", 20000, 10000, 10000);
		e[2] = new Engineer(3000, "박기술", 15000, 7500, 5000, 5000);
		e[3] = new Secretary(4000, "최비서", 15000, 7000, 10000);
		
		System.out.println("사번  : 이름   : 본봉   : 총급여");
		for (Employee emp : e) {
			// 계산
			emp.calcSalary(); // 오버라이딩 메서드 (각각의 메서드가 호출됨)
			// 출력
			System.out.println(emp.getSeq() + " : " + emp.getName() + " : " + emp.getOriginalSalary() + " : " + emp.getTotalSalary());
			// 형변환 타입 조사(= instanceof 키워드)
			if (emp instanceof Engineer) {
				// **참조형 변수 형변환 (부모 클래스에서 자식클래스의 메서드 사용하는 법)**
				System.out.println("기술직사원의 경우 : " + ((Engineer)emp).getCertificateBonus() + "  " + ((Engineer)emp).getEngineerBonus());
			}
		}
		

	}

}
