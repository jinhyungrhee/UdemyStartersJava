package test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ProductTCPClient {

	public static void main(String[] args) throws Exception {

		Socket cSocket = new Socket("127.0.0.1", 11111);
		String targetIP = cSocket.getInetAddress().getHostAddress();
		System.out.println("$클라이언트가 " + targetIP + " 서버로 접속했습니다");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("상품 추가");
		System.out.print("상품명 : ");
		String name = sc.next();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("재고량 : ");
		int stock = sc.nextInt();
		String result = name + " " + price + " " + stock + "\n";
		
		// OutputStream으로 서버에 write
		OutputStream os = cSocket.getOutputStream();
		// String -> byte
		byte[] by = result.getBytes();
		os.write(by);
		
		// InputStream으로 서버에서 받은 내용 출력
		InputStream is = cSocket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String response = br.readLine();
		System.out.println("$서버로부터 <<" + response + ">> 라는 응답이 도착했습니다");
		
		// 연결 종료
		cSocket.close();
		System.out.println("$클라이언트가 서버 접속을 해제했습니다");
	}

}
