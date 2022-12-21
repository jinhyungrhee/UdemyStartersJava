package chap15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("키보드 입력을 대기중입니다. ");
		
		/*
		while(true) {
			int data = System.in.read(); // 키보드로부터 한 개의 데이터(1byte) 읽어옴 (InputStream)
			if (data == 'q') break;
			System.out.println((char)data);
		}
		*/
		
		// InputStream(System.in) to Reader(isr)
		// 유일하게 InputStreamReader만 InputStream을 받아서 Reader를 리턴함
		
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(isr); // BufferedReader는 Reader타입만 받음!
		
		/*
		while(true) {
			int data = isr.read(); // 키보드로부터 2byte 데이터 읽어옴 (InputStream)
			if (data == '큐') break;
			System.out.println((char)data);
		}
		*/
		/*
		while(true) {
			String data = br.readLine(); // 한줄 읽어들임
			if (data.equals("큐")) break;
			System.out.println(data);
		}
		*/
		
		// System.in - 키보드 객체
		Scanner key = new Scanner(System.in);
		// 정수형 입력 : nextInt()
//		while(key.hasNextInt()) {
//			int first = key.nextInt();
//			int second = key.nextInt();
//			System.out.println(first + second);
//		}
		// (공백 구분)문자열 입력 : next()
//		while(key.hasNext()) { // 공백이전 문자열
//			String first = key.next();
//			String second = key.next();
//			System.out.println(first + second);
//		}
		// (공백  포함) 문자열 입력 : nextLine()
		String first = key.nextLine();
		System.out.println(first);
		
	}

}
