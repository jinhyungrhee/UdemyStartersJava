package chap16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerTest {

	public static void main(String[] args) throws Exception {
		
		// 10000번 포트 열어서 클라이언트의 요청 기다리는 소켓 생성
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("[서버는 10000번 포트에서 대기중입니다]");
		
		// 무한루프를 돌면서 클라이언트의 요청을 기다림
		while(true) {
		
			// 클라이언트 요청 대기
			Socket s = ss.accept();
			
			// 클라이언트 정보 가져오기
			// IP주소
			String clientIP = s.getInetAddress().getHostAddress(); 
			
			System.out.println("[서버는 " + clientIP + " 클라이언트 접속을 허용합니다]");
			
/////////////////////////////////////////////////////////////////////
			// 클라이언트-서버 통신
			// 클라이언트 요청 받음 = 입력스트림
			InputStream is = s.getInputStream();
			// [방법1]
			// BufferedReader : byte -> String
			//BufferedReader br = new BufferedReader(new InputStreamReader(is));
			//String request = br.readLine();
			
			// [방법2]
			Scanner sc = new Scanner(is);
			String request = sc.nextLine();
			System.out.println("[서버는 클라이언트로부터 " + request + " 요청을 전달받았습니다]");
////////////////////////////////////////////////////////////////////
		
			
///////////////////////////////////////////////////////////////////////
			String response = "1번 제목1   내용1   작성자1\n";
			OutputStream os = s.getOutputStream();
			byte[] by = response.getBytes();
			os.write(by);
			System.out.println("[서버는 클라이언트로 "+ " 응답을 전달합니다]");
		
///////////////////////////////////////////////////////////////////////
			
			
			// 클라이언트와 연결 해제
			s.close();
			System.out.println("[서버는 클라이언트 접속을 해제합니다]");
			
		}
		
	}

}
