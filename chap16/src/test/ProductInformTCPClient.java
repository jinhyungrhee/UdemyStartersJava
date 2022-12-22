package test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ProductInformTCPClient {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		Socket s = new Socket("127.0.0.1", 55555);
		
		
		System.out.println("$조회할 상품명을 입력하세요");
		System.out.print("$상품명 : ");
		String name = sc.next();
		name = name + "\n";
		
		// 서버로 전송
		OutputStream os = s.getOutputStream();
		byte[] by = name.getBytes();
		os.write(by);
		
		// 응답
		InputStream is = s.getInputStream();
		Scanner sc2 = new Scanner(is);
		String response = sc2.nextLine();
		
		System.out.println("$서버로부터 응답이 도착했습니다 : " + response);
		
		sc.close();
		sc2.close();
		s.close();
	
		
	}

}
