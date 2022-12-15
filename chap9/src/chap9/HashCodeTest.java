package chap9;



public class HashCodeTest {

	public static void main(String[] args) {
		
		MyObject o1 = new MyObject("hashtest");
		MyObject o2 = new MyObject("hashtest");
		String s1 = new String("hashtest");
		String s2 = new String("hashtest");
		System.out.println("o1해시값 = " + o1.hashCode());
		System.out.println("o2해시값 = " + o2.hashCode());
		// String - hashCode 오버라이딩 되어 있음
		System.out.println("s1해시값 = " + s1.hashCode()); // 149147296
		System.out.println("s2해시값 = " + s2.hashCode()); // 149147296
		// String 오버라이딩 되기 전 값 출력
		System.out.println(System.identityHashCode(s1)); // 474675244
		System.out.println(System.identityHashCode(s2)); // 932583850
		
	}

}
