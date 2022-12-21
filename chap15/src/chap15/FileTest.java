package chap15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일이나 디렉토리명을 입력하세요");
		String input = sc.nextLine();
		// 파일 객체 생성
		File f = new File(input); // b.java
		
		if(!f.exists()) {
			System.out.println("파일이나 디렉토리가 존재하지 않습니다");
			return;
		}
		
		if(f.isFile()) {
			
			System.out.println("파일명 = " + f.getName());
			System.out.println("파일경로1 = " + f.getAbsolutePath());
			System.out.println("파일경로2 = " + f.getCanonicalPath()); // 해석된 경로를 보여줌ㅋ
			System.out.println("파일크기(byte) = " + f.length());
			
			// SimpleDateFormat 사용하여 날짜 삭 
			Date d = new Date(f.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 hh시 mm분 ss초 yyyy년도");
			String dStr = sdf.format(d);
			
			System.out.println("파일최종수정시각 = " + dStr);
			System.out.println("파일읽기여부 = " + f.canRead());
			System.out.println("파일쓰기여부 = " + f.canWrite());
			
		} else { // 디렉토리명
			
			/*
			String[] details = f.list(); // String 배열 (이름만 리턴)
			for (String s : details) {
				// 디렉토리 - {xxx}, {파일명}
				System.out.println(s); // 세부목록 보여줌
			}
			*/
			
			File[] details2 = f.listFiles(); // 파일 타입으로 리턴
			for (File s2 : details2) {
				System.out.println(
				s2.isDirectory() ? "{" + s2.getName() + "}" : "/" + s2.getName() + "/"
				);
			}
		}
		

	}

}
