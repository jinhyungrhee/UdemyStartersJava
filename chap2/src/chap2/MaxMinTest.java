package chap2;

public class MaxMinTest {

	public static void main(String[] args) {
		System.out.println("byte타입의 최대값 = " + Byte.MAX_VALUE);
		System.out.println("byte타입의 최소값 = " + Byte.MIN_VALUE);
		
		System.out.println("short타입의 최대값 = " + Short.MAX_VALUE);
		System.out.println("short타입의 최소값 = " + Short.MIN_VALUE);
		
		System.out.println("int타입의 최대값 = " + Integer.MAX_VALUE);
		System.out.println("int타입의 최소값 = " + Integer.MIN_VALUE);
		
		System.out.println("long타입의 최대값 = " + Long.MAX_VALUE);
		System.out.println("long타입의 최소값 = " + Long.MIN_VALUE);
		
		/*
		byte타입의 최대값 = 127
		byte타입의 최소값 = -128
		
		short타입의 최대값 = 32767
		short타입의 최소값 = -32768
		
		int타입의 최대값 = 2147483647
		int타입의 최소값 = -2147483648
		
		// 시간 계산 등 정밀 계산 필요 시 long타입 사용
		long타입의 최대값 = 9223372036854775807
		long타입의 최소값 = -9223372036854775808
		*/
		
		System.out.println("float타입의 최대값 = " + Float.MAX_VALUE);
		System.out.println("float타입의 최소값 = " + Float.MIN_VALUE);
		
		System.out.println("double타입의 최대값 = " + Double.MAX_VALUE);
		System.out.println("double타입의 최소값 = " + Double.MIN_VALUE);
		
		/*
		float타입의 최대값 = 3.4028235E38 // 3.4 * 10^38
		float타입의 최소값 = 1.4E-45
		
		double타입의 최대값 = 1.7976931348623157E308 // 1.79 * 10^308
		double타입의 최소값 = 4.9E-324 
		*/
		
	}

}
