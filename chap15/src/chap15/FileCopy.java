package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

//  1. a.txt b.txt -> a.txt 파일 없다 (오류발생)
//  2. src/chap15/FileCopy.java copy.txt -> 출력 파일이 없어도 오류X(자동생성) / 콘솔 출력 결과X
//  3. (다른 파일 복사) src/chap15/FileViewr.java copy.txt : 기존 저장된 파일 삭제 후 출력
//  4. (다른 파일 복사 - 기존 내용 유지) - 두번째 매개변수 "true"
// 		FileOutputStream fos = new FileOutputStream(args[1], true);
//		../chap14/src/chap14/LambdaTest1.java copy.txt
//	public static void main(String[] args) throws FileNotFoundException {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1], true); // 기존 내용 밑으로 복사
		
		while(true) {
			int data = fis.read(); // 1Byte만 활용
			if (data == -1) break;
			fos.write(data);	
		}
		
		fis.close();
		fos.close();
		
		
	}

}
