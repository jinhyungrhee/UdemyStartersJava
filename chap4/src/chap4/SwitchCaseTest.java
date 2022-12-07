package chap4;

public class SwitchCaseTest {

	public static void main(String[] args) {

		String condition = "내용";
		
		// [if-else 문]
		/*
		if (condition == "제목") {
			System.out.println("제목으로 검색합니다.");
		} else if (condition == "작성자") {
			System.out.println("작성자로 검색합니다.");
		} else if (condition == "내용") {
			System.out.println("내용으로 검색합니다.");
		} else {
			System.out.println("검색이 불가능합니다.");
		}
		*/
		
		// [switch 문]
		switch(condition) {
			case "제목" : 
				System.out.println("제목으로 검색합니다.");
				break; // switch 블록 종료
			case "내용" : 
				System.out.println("내용으로 검색합니다.");
				break; // switch 블록 종료
			case "작성자" : 
				System.out.println("작성자로 검색합니다.");
				break; // switch 블록 종료
			default : 
				System.out.println("검색이 불가능합니다.");
			
		}
		
	}

}
