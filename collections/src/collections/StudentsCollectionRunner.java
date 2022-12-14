package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparator 직접 구현
class DescendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}
	
}

public class StudentsCollectionRunner {

	public static void main(String[] args) {

		List<Student> students = List.of(new Student(1,"ranga"),
										new Student(100, "Adam"),
										new Student(2, "Eve"));
		
		System.out.println(students); // [1 ranga, 100 Adam, 2 Eve]
		
		// 학생들의 리스트를 정렬하기 위해 ArrayList 사용 -> 가변 리스트
		List<Student> studentsAl = new ArrayList<>(students);
		
		// 오름차순 정렬
		Collections.sort(studentsAl);
		System.out.println("Asc" + studentsAl);
		
		// 내림차순 정렬
		// 1)Comparator를 직접 정의하여 Collections.sort() 사용
		//Collections.sort(studentsAl, new DescendingStudentComparator());
		//System.out.println("Dsc" + studentsAl);
		
		// 2) Comparator를 직접 정의하여 ArrayList.sort() 사용
		studentsAl.sort(new DescendingStudentComparator());
		System.out.println("Dsc" + studentsAl);
		
	}

}
