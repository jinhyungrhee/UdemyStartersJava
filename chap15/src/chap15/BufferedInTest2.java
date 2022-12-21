package chap15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Bufferedxxx <- 메모리복사 -> 원본 

public class BufferedInTest2 {
	
	public static void main(String[] args) throws Exception {
		
		long start = 0, end = 0;
		
		// [TEST1] : 파일로부터 직접 입력 소요 시간
		FileReader fis = new FileReader("C:\\Users\\user\\Desktop\\컬렉션프레임워크실습예제.pdf");
		
		start = System.currentTimeMillis();
		while(true) {
			int data = fis.read();
			if(data == -1) break;
		}
		end = System.currentTimeMillis();
		System.out.println("버퍼 미사용시 소요시간 = " + (end - start) + "ms"); // 10ms
		
		// [TEST2] : 버퍼 저장 입력 소요 시간
		fis = new FileReader("C:\\Users\\user\\Desktop\\컬렉션프레임워크실습예제.pdf");
		BufferedReader br = new BufferedReader(fis, 10);
			
		start = System.currentTimeMillis();
		while(true) {
			// read() : int 데이터 리턴
			int data = br.read(); // 한 글자씩 읽어옴
			if (data == -1) { break; }
			//System.out.print((char)data); 
			
			// 더 간단
			// readLine() : String 데이터 리턴
			/*
			String line = br.readLine(); //한 줄 통째로 읽음
			if(line == null) break;
			System.out.println(line);
			*/
		}
		end = System.currentTimeMillis();
		System.out.println("버퍼 사용시 소요시간 = " + (end - start) + "ms"); // 4ms
		br.close(); // 버퍼에 남아있는 것 모두 출력하고 종료
		
	}

}
