package academy; // B클래스 저장 폴더 설정(첫문장!)

import java.util.Date;
import java.util.HashSet;

/* import 생략해도 되는 경우
 * 1. B클래스와 같은 패키지에 속한 클래스 -> 자동 import
 * 2. java.lang.패키지에 속한 클래스 -> 자동 import
 * */

// sba 패키지의 모든 클래스 가져옴
//import sba.A; // A클래스의 패키지명 알려줌.
import sba.A;

public class B {

	public static void main(String[] args) {
		// 다른 패키지에 존재하는 클래스 사용방법 1 : 클래스명 앞에 패키지명 명시
		//sba.A a1 = new sba.A();
		
		// 다른 패키지에 존재하는 클래스 사용방법 2 : import
		A a1 = new A(); // 사용자 정의 클래스
		Date now = new Date(); // 라이브러리 제공 클래스
		
		HashSet set = new HashSet();
		// java.util - 유틸리티 기능을 가진 40여개의 클래스 
		
		
		
		
	}

}
