package chap16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {

		DatagramSocket ds = new DatagramSocket(); // 랜덤 포트번호 부여
		System.out.println("[발신자 : 발신 시작]");
		
		//String data = "오늘 오후 5시반에 종료합니다.";
		String data = "지금 몇 시에요?";
		
		// String -> bytes : getBytes()
		byte[] by = data.getBytes();
		DatagramPacket dp = new DatagramPacket(by, by.length, 
				new InetSocketAddress("127.0.0.1", 15000));
		
		// 전송
		ds.send(dp);
		System.out.println("[발신자 : 발신 처리]");
		System.out.println("[발신자 : 발신 종료]");
		
		
		
		// =============== 응답 받기(수신) ==============================
		byte[] b = new byte[1000]; // 수신받은 내용 저장 배열 (넉넉히 설정) **
		// 한글 영문 숫자 -> String 한 글자는 2 byte
		// getBytes() -> 영문자, 숫자, 특수문자 -> 1 byte, 한글(다국어) - 3byte 취급!
		
		// 저장
		DatagramPacket receiveDp = new DatagramPacket(b, b.length);
		ds.receive(receiveDp);
		// byte[] -> String
		String s = new String(b);
		
		// b와 dp.getData()는 동일함 = 바이트 배열
		// s.trim() : 의미없는 공백 문자열 삭제 **
		// Sender의 정보 조회 **
		System.out.println(dp.getAddress() + " 주소의 " + dp.getPort() + " 포트에서" 
		+ s.trim() + "결과를 받았습니다");
		
		//==========================================================
		
		ds.close();
	}

}
