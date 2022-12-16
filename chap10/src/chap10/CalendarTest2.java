package chap10;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest2 {

	public static void main(String[] args) {
		//Date now = new Date();
		//System.out.println(now);
		//now.getYear(); // deprecated
		//System.out.println(now.getYear()); // 122
		
		// Calendar는 instance를 만들 수 없음 -> abstract 클래스
		// abstract인 이유 : 나라마다 시간과 포맷이 다름 - 하위 클래스까지 제공
		// Calendar = 추상클래스
		//          = 구현 자식클래스("한국시간") 
		// Calendar 객체를 생성해서 리턴해주는 static 메서드 : getInstance()
		// getInstance() : locale(os) 설정에 맞는 시간,날짜 생성하는 클래스 객체 리턴
		Calendar cal = Calendar.getInstance(); // 현재시각
		//cal.set(2022, 11, 11); // 2023년도 1월 11일 -> 연,월,일 한꺼번에 변경(set) 
		cal.set(Calendar.YEAR, 2024); // 연도만 변경(set)
		cal.add(Calendar.MONTH, 1); // 현재 날짜값에서 값을 추가(add)

		
		int year = cal.get(Calendar.YEAR); // Static 변수
		int month = cal.get(Calendar.MONTH) + 1; // 몇 번째 월인지 나타냄(0번부터 시작)
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		// 모든 날짜 정보에 대한 국가별 포맷이 다를 수 있음 (int로 주는 이유)
		// 1-일, 2-월, 3-화, 4-수, 5-목, 6-금, 7-토 
		int date = cal.get(Calendar.DAY_OF_WEEK);
		// 불변 - final
		final String[] weekdays = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		System.out.printf("현재 년도=%d 월=%d 일=%d, 현재 시각=%d:%d:%d, %s요일\n", year, month, day, hour, minute, second, weekdays[date]);
	
	}
}
