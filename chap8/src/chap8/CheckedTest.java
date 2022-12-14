package chap8;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedTest {

	public static void main(String[] args) {
		// sample.txt 입력용 사용 오픈 허락
		//  <<Checked Exception>>
		// java.io.FileNotFoundException 발생 - 컴파일러 경고하는 예외 -> try-catch 필수
		// class FileNotFoundException extends Exception
		
		try {
			
			FileReader fr = new FileReader("sample.txt");
			
		} catch(FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		}
		

		// <<Unchecked Exception>>
		// ArithmeticException 발생 - 컴파일러 경고 안하는 예외 (일단 실행) -> try-catch 필수X 
		// class RuntimeException extends Exception
		// class ArithmeticException extends RuntimeException
		System.out.println( 10 / 0 );
		
	}

}
