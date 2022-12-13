package chap7;

// import java.lang.Math; // Math의 모든 변수와 메서드 사용 허락(static, non-static)

import static java.lang.Math.*; // Math 클래스 중 static으로 된 것만 사용
import static java.lang.Integer.*;

public class StaticImportTest {

	public static void main(String[] args) {

		int ran = (int) (Math.random() * 100) + 1; // 1 ~ 100 난수 발생
		System.out.println(ran);	
		System.out.println();
		System.out.println(MAX_VALUE);
		
	}

}
