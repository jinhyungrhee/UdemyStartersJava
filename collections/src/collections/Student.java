package collections;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id + " " + name;
	}

	@Override
	public int compareTo(Student that) {
		// 현재 학생을 인자로 입력받은 학생과 비교하기
		// 정렬 기준 : id가 늘어나는 순서대로 정렬 (오름차순)
		return Integer.compare(this.id, that.id);
	}
}
