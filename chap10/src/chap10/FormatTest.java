package chap10;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public static void main(String[] args) {
		
		// ==================== DecimalFormat =================================
		
		double d = 3.14 * 10;
		d = 1234.5678;
		d = -12.5678;
		d = 1234567.89;
		System.out.println(d);
		
		// # - 1자리 10진수 포맷, 0이면 표시 X
		// 0 - 1자리 10진수 포맷, 0도 표시 O
		//DecimalFormat df = new DecimalFormat("##.#");
		//DecimalFormat df = new DecimalFormat("000.00");
		
		// 0?? - 십의 자리, 일의자리 없이 백의자리에 0을 표현할 수 없음
		// DecimalFormat("0##.#0"); / /불가능
		// DecimalFormat("#00.0#"); // 가능
		// 가급적이면 통일해서 사용하는 것이 좋음!
		
		// 정수 vs 실수
		//DecimalFormat df = new DecimalFormat("000.00"); // 정수는 자리수가 부족해도 다 표현 (소수점이하는 자동으로 '반올림'됨)
		
		// 양수 vs 음수
		//DecimalFormat df = new DecimalFormat("000.00+;000.00-"); // 양수+;음수-
		//DecimalFormat df = new DecimalFormat("###.##+;000.00-"); // 패턴 동일하게 사용!
		
		// 콤마 표시
		DecimalFormat df = new DecimalFormat("###,###.00"); // 3자리마다 콤마 찍기
		//DecimalFormat df = new DecimalFormat("#,###,###.00"); // 동일
		
		String dStr = df.format(d); // String 리턴
		System.out.println(dStr);
		
		// ================= SimpleDateFormat ==================================
		
		// y-연도(자리수)
		// M-월
		// d-일(이번달 중에서 며칠째인지) : dd
		// D-일(이번년 중에서 며칠째인지) : DDD
		// H-시간 (24시간)
		// h-시간 (12시간)
		// m-분
		// s-초
		// E-요일
		
		// Calendar 객체는 매번 get()메서드로 가져와야 함 -> 번거로움
		// SimpleDateFormat이 훨씬 표현이 간단함! **
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd / DDD / HH-mm-ss E");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년도 MM월 dd일 / DDD(1년중 몇번째일) / HH시 mm분 ss초 E요일");
		
		// 현재 시각 정보
		Calendar date = Calendar.getInstance();
		//CAL -> Date : getTime()메서드 
		String dateStr = sdf.format(date.getTime()); // String 리턴
		System.out.println(dateStr);
		
		// 데이터 입력 받기(명령행 매개변수) - 2023 1 2 3 4 5
		// 2023년 1월 2일 3시 4분 5초 -> Calendar 객체로 생성
		// 1년 중 몇 주 째(w)인지 출력
		// 해당 월의 몇 주 째(W)인지 출력
		// 요일(E) 출력
		
		System.out.println("============= SimpleDateFormat 예제 ===================");
		
		if (args.length < 6) {
			return;
		}
		
		// int로 바꿔서 저장하는 배열
		int[] argsInt = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			argsInt[i] = Integer.parseInt(args[i]);
		}
		
		Calendar cal = Calendar.getInstance();
		cal.set(argsInt[0], argsInt[1]-1, argsInt[2], argsInt[3], argsInt[4], argsInt[5]);
		
//		cal.set(Calendar.YEAR, Integer.parseInt(args[0]));
//		cal.set(Calendar.MONTH, Integer.parseInt(args[1]));
//		cal.set(Calendar.DAY_OF_YEAR, Integer.parseInt(args[2]));
//		cal.set(Calendar.HOUR, Integer.parseInt(args[3]));
//		cal.set(Calendar.MINUTE, Integer.parseInt(args[4]));
//		cal.set(Calendar.SECOND, Integer.parseInt(args[5]));
		
//		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
//		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
//		System.out.println(cal.get(Calendar.DATE));
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("w / W / E");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy 년도의 w번째 주이고, MM월의 W번째 주입니다. E요일입니다.");
		String weekday = dateFormat.format(cal.getTime());
		System.out.println(weekday);
	}

}
