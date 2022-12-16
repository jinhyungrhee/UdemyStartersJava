package chap10;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarCastingTest {

	public static void main(String[] args) {
		
		// Calendar 객체 -> Date 객체로 변환
		Calendar cal = Calendar.getInstance();
		Date calDate = cal.getTime(); // Calendar -> Date 객체로 변경 (서로 상속 관계X - 자동 형변환 불가)
		System.out.println(calDate.getClass().getName()); // java.util.Date
		
		// Date 객체 -> Calendar 객체로 변환
		Date d = new Date();
		cal.setTime(d);
		System.out.println(cal.getClass().getName()); // java.util.GregorianCalendar

	}

}
