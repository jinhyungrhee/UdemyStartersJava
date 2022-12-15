package chap9;

public class ObjectClassTest {

	public static void main(String[] args) {
		MyObject o1 = new MyObject("myobject");
		MyObject o2 = new MyObject("myobject");
		
		// toString()
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		// 패키지명.클래스명@16진수(해쉬코드)
		
		//System.out.println(o1.toString()); // java.lang.Object@3d012ddd
		System.out.println(o1); // 출력문에서 toString() 자동 호출됨
		//System.out.println(o2.toString()); // java.lang.Object@626b2d4a
		System.out.println(o2);
		
		System.out.println(o1 == o2); // false
		System.out.println(o1.equals(o2)); // false
		
		String s3 = new String("myobject");
		System.out.println(o1.equals(s3));
		
	}

}

class MyObject /*extends Object*/ {
	String message;
	MyObject(String message) {
		this.message = message;
	}
	// toString + equals + ... + Object 클래스 결과와 동일
	
	// toString 오버라이딩
	@Override
	public String toString() {
		return this.message;
	}

	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) { // MyObject -> Object로 자동형 변환됨!
		
		// 비교 전달 객체obj는 MyObject 타입이어야 하고
		// message 변수이 같은지 비교 -> 두 가지 조건을 모두 만족하면 true (타입이 다르거나 값이 다르면 false)
		if (obj instanceof MyObject) {
			return message.equals(((MyObject)obj).message);// 자식타입으로 되돌아가기(명시적 형변환)
		} else {
			return false;
		}

	}
	
	
	
	
}

