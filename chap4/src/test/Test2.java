package test;

public class Test2 {

	public static void main(String[] args) {
		
		int time = 10000; // 초
		
		int total_second = time;
		int hour;
		int minute;
		int second;

		hour = time / 3600;
		time %= 3600;
		minute = time / 60;
		time %= 60;
		second = time;
		
		// 10000초는 xx시간 xx분 xx초입니다.
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.", total_second, hour, minute, second);
	}

}
