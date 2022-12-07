package chap4;

public class ScoreTest {

	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 100, eng = 100, mat = 100;
		int sum; // 총점
		double avg; // 실수평균
		int avgInt; // 정수평균
		
		sum = kor + eng + mat;
		avg = (double)sum / 3.0;
		avgInt = sum / 3;
		
		String grade; // 등급
		// 조건문
		// avgInt가 90이상 100이하면 A등급
		// avgInt가 80이상 90미만이면 B등급
		// avgInt가 70이상 80미만이면 C등급
		// avgInt가 60이상 70미만이면 D등급
		// acgInt가 그 외의 등급이면 낙제등급
		
		// [if-else]
		/*
		if (avgInt >= 90 && avgInt < 100) {
			grade = "A";
		} else if (avgInt >= 80 && avgInt < 90) {
			grade = "B";
		} else if (avgInt >= 70 && avgInt < 80) {
			grade = "C";
		} else if (avgInt >= 60 && avgInt < 70) {
			grade = "D";
		} else {
			grade = "낙제";
		}
		*/
		
		// [개선된 if-else문]
		/*
		if (avgInt >= 90) {
			grade = "A";
		} else if (avgInt >= 80) {
			grade = "B";
		} else if (avgInt >= 70) {
			grade = "C";
		} else if (avgInt >= 60) {
			grade = "D";
		} else {
			grade = "낙제";
		}
		*/
		
		// [switch-case]
		//System.out.println(avgInt);
		switch(avgInt / 10) {
			case 10: 
			case 9: 
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "낙제";
		}
		
		System.out.printf("%s 학생은 국어 = %3d 점, 영어 = %3d 점, 수학 = %3d 점입니다.\n"
				+ "총점은 %d 이고 평균(실수평균)은 %.2f 입니다.\n"
				+ "등급은 %s등급입니다.\n", name, kor, eng, mat, sum, avg, grade);
	}

}
