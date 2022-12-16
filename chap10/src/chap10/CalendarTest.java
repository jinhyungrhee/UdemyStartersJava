package chap10;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

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
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR); // Static 변수
		int month = cal.get(Calendar.MONTH) + 1; // 몇 번째 월인지 나타냄(0번부터 시작)
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("현재 년도=%d 월=%d 일=%d, 현재 시각=%d:%d:%d\n", year, month, day, hour, minute, second);
	
	}
	

}
