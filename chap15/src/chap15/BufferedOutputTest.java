package chap15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputTest {

	public static void main(String[] args) throws IOException {
		
		// 원본스트림 + 보조스트림 
		// 원본스트림
		FileOutputStream fos = new FileOutputStream("buffer.txt");
		// 보조스트림 - 메모리 복사
		BufferedOutputStream bos = new BufferedOutputStream(fos, 5); // 두번째 인자 - 메모리 버퍼 크기(5 byte) - 크기를 넘어가면 알아서 조정이 됨 (단, close 꼭 필요!)
		// 써야 할 것 모두 메모리에 담아놓음 (= bos)
		for (int i = 48; i <= 57; i++) { // '0' - 48 ~ '9' - 57			
			bos.write(i); // write(int) -> int에 해당하는 '문자'데이터가 저장
			// 중단
		}	
		
		bos.close(); // close하지 않으면, buffer에 남아있는 내용 저장하지 않고 그냥 버림 (주의) = "출력하다 중단하는 것과 동일"
		fos.close();
		
	}

}
