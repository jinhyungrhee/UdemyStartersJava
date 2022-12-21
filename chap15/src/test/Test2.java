package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
	
	String name;
	int kor;
	int math;
	int eng;
	int sumScore;
	double avgScore;
	
	Student(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	void calc() {
		sumScore = kor + math + eng;
		avgScore = sumScore / 3;
	}	
	
	void print() throws IOException {

		FileWriter fw = new FileWriter("src/test/scores.txt", true);
		String result = name + " " + kor + " " + math + " " + eng + " " + sumScore + " " + avgScore + "\n";
		fw.write(result);
		fw.close();
		
	}
	
}

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		FileOutputStream fos = new FileOutputStream("src/chap15/scores.txt", true);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		Student st = new Student(name, kor, math, eng);
		st.calc();
		
		try {
			st.print();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
