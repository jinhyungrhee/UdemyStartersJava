package test;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerAnswer {

	public static void main(String[] args) throws Exception {
	
	
		// 10000번 포트 열어서 클라이언트의 요청 기다리는 소켓 생성
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("[서버는 10000번 포트에서 대기중입니다]");
		
		int cnt = 0;
		// 무한루프를 돌면서 클라이언트의 요청을 기다림
		while(true) {
		
			// 클라이언트 요청 대기
			Socket s = ss.accept();
			
			// 클라이언트 정보 가져오기
			// IP주소
			String clientIP = s.getInetAddress().getHostAddress(); 
			
			System.out.println("[서버는 " + clientIP + " 클라이언트 접속을 허용합니다]");
			cnt++;
			
			if(cnt == 4) { break; }
			FileWriter fw = new FileWriter("PRODUCT.txt", true);
			
			// 클라이언트 3개 " " 
			InputStream is = s.getInputStream();		
			Scanner sc = new Scanner(is);
			String name = sc.next(); // 공백이 나오기 전까지의 한 단어 읽어들임
			String price = sc.next(); // 공백이 나오기 전까지의 한 단어 읽어들임
			String balance = sc.next(); // 공백이 나오기 전까지의 한 단어 읽어들임

			fw.write(name + " - " + price + " - " + balance + "\n");
			fw.close();
			
		
			String response = "추가 완료되었습니다";
			OutputStream os = s.getOutputStream();
			byte[] by = response.getBytes();
			os.write(by);
			System.out.println("[서버는 클라이언트로 "+ " 응답을 전달합니다]");
		
			
			// 클라이언트와 연결 해제
			fw.close();
			is.close();
			os.close();
			s.close();
			System.out.println("[서버는 클라이언트 접속을 해제합니다]");
			
		}
		
	}

}
