package inter;

class StudentWorker implements Student, Worker {
	// 자동포함 변수(상속)
	// String dept = "전산학과";
	// double score = 4.5;
	
	String title = "조교";

	// modifier가 기존과 동일하거나 더 넓어야함 (규칙)
	@Override
	public void work() {
		System.out.println("학교일하다");
	}

	@Override
	public void study() {
		System.out.println("도서관에서 공부하다");
	}

	@Override
	public void lunch() {
		System.out.println("학생식당이나 교직원식당에서 점심먹다");
	}
	
	// 이외의 생성자, 멤버변수, 메서드 추가 가능
	void team() {
		System.out.println("조교 모임 참석하다");
	}
	
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		
		// 객체 생성 불가
		//Worker worker = new Worker();
		//Student student = new Student();
		
		// <1> 인터페이스 상속받은 클래스 객체 직접 생성
		StudentWorker sw = new StudentWorker();
		sw.study();
		sw.lunch();
		sw.work();
		sw.team();
		
		// 변수 수정
		sw.title = "조교아님";
		//sw.dept = "국문학"; // final이므로 수정 불가능 (read-only)
		//sw.score = 3.5;   // final이므로 수정 불가능 (read-only)
		
		System.out.println(sw.title);
		System.out.println(sw.dept); 		// Worker 인터페이스에서 상속
		//System.out.println(Worker.dept); 	// 가능
		System.out.println(sw.score); 		// Student 인터페이스에서 상속
		//System.out.println(Student.score);// 가능
		
		// ===========================================================================
		// <2> 인터페이스를 활용한 형변환 (-> 자식클래스 객체를 생성하여 부모 인터페이스 타입으로 형변환)
		Worker w = new StudentWorker();
		/*
		 * 1. 자동 형변환 이후
		 * 3. w.overriding 메서드 -> StudentWorker 클래스 메서드 호출
		 * 4. Worker 인터페이스 포함 - StudentWorker가 재구현함
		 *    work() / lunch()
		 * */
		
		//w.study(); // Student (오버라이딩 메서드O)
		w.lunch();
		w.work();
		//w.team(); // StudentWorker 추가 (오버라이딩 메서드X)
		
		
		// ============================================================================
		// <3> 인터페이스를 활용한 형변환 (-> 자식클래스 객체를 생성하여 부모 인터페이스 타입으로 형변환)
		Student s = new StudentWorker();
		/*
		 * 1. 자동 형변환 이후
		 * 3. s.overriding 메서드 -> StudentWorker 클래스 메서드 호출
		 * 4. Student 인터페이스 포함 - StudentWorker가 재구현함
		 *    study() / lunch()
		 * */
		
		s.study(); 
		s.lunch();
		//s.work(); // Worker (오버라이딩 메서드O)
		//s.team(); // StudentWorker 추가 (오버라이딩 메서드X)
		
		
	}

}
