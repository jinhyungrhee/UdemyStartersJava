package chap16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) {
		// windows ipconfig
//		try {
//			InetAddress[] iparr = InetAddress.getAllByName("www.naver.com");
//			for (InetAddress ip : iparr ) {
//				System.out.println(ip.getHostAddress()); // 도메인명 없이 IP주소만 출력
//			}
//		} catch(UnknownHostException e) {
//			e.printStackTrace();
//		}
		
		// 내 컴퓨터에 대한 정보
		try {
			InetAddress ip = InetAddress.getLocalHost();
			System.out.println(ip.getHostAddress()); // IP 주소
			System.out.println(ip.getHostName()); // 도메인 이름(= 내 컴퓨터 이름)
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
