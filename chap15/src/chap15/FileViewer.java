package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileViewer {

	public static void main(String[] args) {
		
		// 파일 - windows \
		// 		 linux /
		FileInputStream fis = null;
		try{

			//FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\text.txt"); // 절대경로
			//FileInputStream fis = new FileInputStream("[기준]프로젝트경로명/.../.../"); // 상대경로 사용 시 기준은 [프로젝트명]**
			fis = new FileInputStream("src/chap15/FileViewer.java");
			
			while(true) {
				int data = fis.read(); // 4 byte 중에 1 byte만 활용
				if (data == -1) { break; }
				System.out.print((char)data); // 파일 입력 내용을 모니터에 출력
			}
			/*
			FileReader fis = new FileReader("C:\\Users\\user\\Desktop\\text.txt");
			
			while(true) {
				int data = fis.read(); // 4 byte 중에 2 byte만 활용
				if (data == -1) { break; }
				System.out.print((char)data); // 파일 입력 내용을 모니터에 출력
			}
			*/
			
		
		//} catch(FileNotFoundException e) {
		//	System.out.println("해당 파일은 존재하지 않습니다");
		} catch(IOException e) {
			//System.out.println("파일 입력 중 오류가 발생했습니다");
			e.printStackTrace();
		} finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		
	}

}
