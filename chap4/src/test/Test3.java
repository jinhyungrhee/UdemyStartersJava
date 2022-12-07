package test;

public class Test3 {

	public static void main(String[] args) {

		int books = 100; // 도서의 수
		int cntOfStu = 12; // 학생의 수
		
		int cntOfBooks;
		int remainder;
		// 12명의 학생에게 xxx권씩 나누어줍니다.
		// if 남은 도서가 있을 경우
		// 그리고 남은 책은 xxx권입니다.
		// else 남은 도서가 없을 경우
		// 출력 X
		
		cntOfBooks = books / cntOfStu;
		remainder = books % cntOfStu;
		
		System.out.printf("%d 명의 학생에게 %d권씩 나누어줍니다.\n", cntOfStu, cntOfBooks);
		if (remainder != 0) {
			System.out.printf("그리고 남은 책은 %d권입니다.", remainder);
		}
		
		
		
	}

}
