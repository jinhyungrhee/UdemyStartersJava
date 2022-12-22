package chap16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPReceiver {

	public static void main(String[] args) throws Exception{

		// Port Open - receiver 먼저 시작 
		DatagramSocket ds = new DatagramSocket(15000); // 받아야하는 쪽이 포트번호 지정
		System.out.println("[수신자 : 수신 시작]");
		
		// 수신
		byte[] b = new byte[1000]; // 수신받은 내용 저장 배열 (넉넉히 설정) **
		// 한글 영문 숫자 -> String 한 글자는 2 byte
		// getBytes() -> 영문자, 숫자, 특수문자 -> 1 byte, 한글(다국어) - 3byte 취급!
		
		// 저장
		DatagramPacket dp = new DatagramPacket(b, b.length);
		ds.receive(dp);
		
		// byte[] -> String
		String s = new String(b);
		
		// b와 dp.getData()는 동일함 = 바이트 배열
		// s.trim() : 의미없는 공백 문자열 삭제 **
		// Sender의 정보 조회 **
		System.out.println(dp.getAddress() + " 주소의 " + dp.getPort() + " 포트에서" + s.trim() + "받았습니다");
		System.out.println("[수신자 : 수신 종료]");

		
		// =======================  응답  ======================================
		// 응답 전송
		String time = new SimpleDateFormat("HH시 mm분 ss초").format(new Date());
		DatagramPacket timeDp = new DatagramPacket(time.getBytes(), time.getBytes().length,
				dp.getAddress(), dp.getPort());
		
		// 소켓으로 전송
		ds.send(timeDp);
		// ===================================================================
		
		ds.close();
		
	}

}
