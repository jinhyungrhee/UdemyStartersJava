package chap15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Bufferedxxx <- 메모리복사 -> 원본 

public class BufferedInTest {
	
	public static void main(String[] args) throws Exception {
		
		
		FileReader fis = new FileReader("src/chap15/FileViewer.java");
		BufferedReader br = new BufferedReader(fis, 10);
		
		while(true) {
			// read() : int 데이터 리턴
//			int data = br.read(); // 한 글자씩 읽어옴
//			if (data == -1) { break; }
//			System.out.print((char)data); 
			
			// 더 간단
			// readLine() : String 데이터 리턴
			String line = br.readLine(); //한 줄 통째로 읽음
			if(line == null) break;
			System.out.println(line);
		}
		
		br.close(); // 버퍼에 남아있는 것 모두 없애고 종료
		
	}

}
