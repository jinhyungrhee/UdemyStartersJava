package chap10;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest3 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); // 2022-12-16
		
		Calendar end = Calendar.getInstance(); 
		end.set(2023, 2, 3); // 2023-3-3
		
		// 두 날짜 사이의 간격 구하기
		// 1) 1/1000 초 구하기 : getTimeInMills()
		long nowMil = now.getTimeInMillis();
		long endMil = end.getTimeInMillis();
		// 2) 두 날짜 값 빼기 (큰 값 - 작은 값)
		System.out.println(Math.abs(endMil - nowMil) + " (1/1000)초단위 입니다.");
		System.out.println(Math.abs(nowMil - endMil)/1000 + " 초 단위 입니다.");
		System.out.println(Math.abs(nowMil - endMil)/86400000 + " 일 단위 입니다.");
		/*
		 * 초 - ? / 1000
		 * 1분  - 60초 , 1시간 - 60분
		 * 1시간 - 60*60초
		 * 1일 - 24시간 - 24 * 60 * 60초 = 86400
		 * */
		
		
		// 예시 : 경매사이트
		// 2개월하고도 1일 23시간 11분 남았습니다. - now.get(Calendar.MONTH)?
		// 
		
	}
}
