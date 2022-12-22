package test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductTCPServer {

	public static void main(String[] args) throws Exception {
		
		ServerSocket sSocket = new ServerSocket(11111);
		System.out.println("<서버는 11111번 포트에서 대기중입니다>");
		
		ArrayList<String> requests = new ArrayList<>();
		
		while(true) {
			
			Socket s = sSocket.accept();
			
			InputStream is = s.getInputStream();
			Scanner sc = new Scanner(is);
			String request = sc.nextLine();
			String response = null;
			
			if (requests.size() < 3) {
				requests.add(request);
				FileWriter fw = new FileWriter("product.txt", true);
				fw.write(request + "\n");
				response = "<서버에 상품이 추가되었습니다>\n";
				fw.close();
				
			} else {
				response = "<서버에 상품이 추가되지 않았습니다>";
			}

			OutputStream os = s.getOutputStream();
			byte[] by = response.getBytes();
			os.write(by);
			
			s.close();
			System.out.println("<서버는 클라이언트와 접속을 해제합니다>");
	
		}
		
	}

}
