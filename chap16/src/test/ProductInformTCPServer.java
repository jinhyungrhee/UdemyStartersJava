package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductInformTCPServer {

	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(55555);
		ArrayList<String> products = new ArrayList<>();
		
		// 클라이언트 연결
		Socket cs = ss.accept();
		System.out.println(">클라이언트와 연결되었습니다");
			
		// *** 파일 읽어오기 ***
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		String str = null;
		while((str = br.readLine()) != null) {
			//System.out.println(str);
			products.add(str);
		}
		// *****************
		
		InputStream is = cs.getInputStream();
		Scanner sc = new Scanner(is);
		String name = sc.next();
		String response = null;
		boolean flag = false;
		
		for (String product : products) {
			//System.out.println(product.split(" ")[0]);
			if (name.equals(product.split(" ")[0])) {
				response = product;
				flag = true;
			}
		}
		
		if (!flag) response = "찾으시는 상품이 없습니다!";
		
		OutputStream os = cs.getOutputStream();
		byte[] by = response.getBytes();
		os.write(by);
		
		cs.close();
		System.out.println(">클라이언트 접속을 종료합니다");
		br.close();
		ss.close();
		
	}

}
