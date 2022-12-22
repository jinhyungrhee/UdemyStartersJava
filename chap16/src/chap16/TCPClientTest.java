package chap16;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientTest {

	public static void main(String[] args) throws Exception {
		
		// 클라이언트 소켓은 서버 ip와 포트번호 필요
		Socket s = new Socket("127.0.0.1", 10000);
		String serverIP = s.getInetAddress().getHostAddress(); 
		
		System.out.println("=== 클라이언트가 " + serverIP + " 서버로 접속했습니다 ===");
		
		/////////////////////////////////////////////////////////////
		// 클라이언트-서버 통신
		// 클라이언트가 먼저 "1번 게시물 주세요" 요청 => 출력스트림
		OutputStream os = s.getOutputStream();
		// String -> byte : getBytes()
		String request = "1번 게시물 주세요\n"; // \n - 종료표시
		byte[] by = request.getBytes();
		os.write(by);
		/////////////////////////////////////////////////////////////
		
/////////////////////////////////////////////////////////////////////
		// 서버로부터 응답 = 입력스트림
		InputStream is = s.getInputStream();
		// [방법1]
		// BufferedReader : byte -> String
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		//String request = br.readLine();
		
		// [방법2]
		Scanner sc = new Scanner(is);
		String response = sc.nextLine();
		System.out.println("=== 클라이언가 서버로부터 " + response + " 응답을 전달받았습니다] ===");
////////////////////////////////////////////////////////////////////
		
		
		s.close();
		System.out.println("=== 클라이언트가 서버 접속을 해제했습니다 ===");
		
	}

}

// 클라이언트를 먼저 실행하면 에러
// java.net.ConnectException: Connection refused: connect