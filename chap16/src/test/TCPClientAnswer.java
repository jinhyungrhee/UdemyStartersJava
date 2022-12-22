package test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientAnswer {

	public static void main(String[] args) throws Exception {
		
		System.out.println("상품 정보를 입력하세요");
		Scanner key = new Scanner(System.in);
		System.out.print("상품명 : ");
		String name = key.next(); // 공백(" ")이나 엔터("\n")가 구분자 -> 제외하고 가져옴
		System.out.print("가격 : ");
		String price = key.next();
		System.out.print("수량 : ");
		String balance = key.next();
		
		Socket s = new Socket("127.0.0.1", 10000);
		String serverIP = s.getInetAddress().getHostAddress(); 
		
		System.out.println("=== 클라이언트가 " + serverIP + " 서버로 접속했습니다 ===");
		
		OutputStream os = s.getOutputStream();
		//String request = name + "-" + price + "-" + balance;
		//byte[] by = request.getBytes();
		//os.write(by); // 서버 read 한 번만
		
		name = name + " ";
		price = price + " ";
		balance = balance + " ";
		os.write(name.getBytes());
		os.write(price.getBytes());
		os.write(balance.getBytes()); // 서버 read 세 번 필요
		
		// 서버로부터 응답 = 입력스트림
		InputStream is = s.getInputStream();
		
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