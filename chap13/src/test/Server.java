package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 1개 서버 - 다수개 클라이언트 요청 - 처리
class LoginClient extends Thread {
	
	String id;
	String pw;
	
	LoginClient(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public void run() {
		System.out.println("로그인아이디" + id +"를 입력받습니다");
		System.out.println("로그인암호를 확인합니다");
		if (pw.equals("java")) {
			System.out.println("로그인암호 맞습니다");
		} else {
			System.out.println("로그인암호 올바르지 않습니다");
		}
	}
}

class RegisterClient extends Thread {

//	Date date;
	String dateStr;
	
	RegisterClient(Date date) {
//		this.date = date;
		dateStr = new SimpleDateFormat("yyyy년도 MM월 dd일").format(date);
	}
	
	public void run() {
		
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(date); // date to Calendar (?)
//		int year = cal.get(Calendar.YEAR); 
//		int month = cal.get(Calendar.MONTH)+1;
//		int day = cal.get(Calendar.DAY_OF_MONTH);
//		System.out.println(year + "년도 " + month + "월 " + day + "일에 회원가입요청합니다");
		
		System.out.println(dateStr + "에 회원가입요청합니다");
		System.out.println("회원가입요청 처리중입니다");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("회원가입요청 처리완료입니다");
		
	}
	
}

class BoardClient extends Thread {
	
	// @Overrie - modifier 같거나 더 넓고 리턴타입, 이름, 매개변수 일치하는지 체크
	// 부모클래스 throws 예외보다 더 많은다른 종류의 예외를 throws 할 수 없
	public void run() {
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("게시물 " + i + "번 작성합니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class Server {

	public static void main(String[] args) {
		
		LoginClient c1 = new LoginClient("java", "java");
		LoginClient c2 = new LoginClient("java", "1234");
		RegisterClient c3 = new RegisterClient(new Date());
		BoardClient c4 = new BoardClient();
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
	}

}

/*실행예시
로그인아이디java를 입력받습니다
로그인암호를 확인합니다
게시물 1 번작성합니다
로그인아이디java를 입력받습니다
로그인암호를 확인합니다
로그인암호 올바르지 않습니다
2022년도 12월 20일에 회원가입요청받았습니다
게시물 2 번작성합니다
로그인암호 맞습니다
게시물 3 번작성합니다
회원가입요청 처리중입니다
게시물 4 번작성합니다
게시물 5 번작성합니다
게시물 5개 작성 종료합니다.
회원가입요청 처리완료입니다
* */
