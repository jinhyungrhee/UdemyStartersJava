package chap16;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class URLTest2 {

	public static void main(String[] args) {
		
		try {
//			URL url = new URL("http://www.google.com/index.html");
			URL url = new URL("http://localhost:8080/js/calculator_answer.html");
			
			String filePath = url.getFile(); // /js/calculator_answer.html
			// calculator_answer.html 저장 = 출력
			// split() 통해 파일명만 가져오기
			String fileName = filePath.split("/")[filePath.split("/").length - 1];
			// 파일에 저장하기 (FileWriter 사용)
			FileWriter fw = new FileWriter(fileName);
			
			// 네트워크를 통해 정보를 받는 스트림 객체 생성
			InputStream is = url.openStream();
			// ***
			// 보조스트림 생성 - inputstream객체를 Reader객체로 변경 필요
			// BufferedReader는 Reader객체만 받을 수 있기 때문!
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			// ***
			
			while(true) {
				
				String line = br.readLine();
				if (line == null) break;
				// 콘솔 출력
				System.out.println(line);
				// 파일에 출력
				fw.write(line + "\n");
				
			}
			
			br.close(); // buffer 연결된 것들 모두 close됨
			fw.close(); // 닫지 않으면 파일까지 저장하지 못하고 버퍼만 저장하고 종료됨
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
