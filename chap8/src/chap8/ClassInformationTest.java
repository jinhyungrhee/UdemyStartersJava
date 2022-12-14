package chap8;

public class ClassInformationTest {

	public static void main(String[] args) {

		// 객체, 존재여부, 변수, 메서드, 생성자 정보 = Class.forName("java.lang.Object");
		
		// java.lang.Object - 존재합니다
		// chap8.A - 존재하지 않습니다
		// chap8.CheckedTest - 존재합니다
		try {
			Class.forName(args[0]);
			System.out.println("존재합니다.");
		} catch(ClassNotFoundException e) {
			System.out.println("존재하지 않습니다.");
		}
		
		
	}

}
