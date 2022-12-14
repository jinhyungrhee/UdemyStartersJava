package test5;

interface Volume2 {
	
	void volumeUp(int vol);
	void volumeDown(int vol);
	
	// static method 추가 (1.8버전 이후) -> "오버라이딩 불가"
	static void print1(String name) { // 절대 수정되지 않도록 설정 (static)
		System.out.println(name + "클래스가 볼륨업 수행중입니다."); 
	}
	
	static void print2(String name) { // 절대 수정되지 않도록 설정 (static)
		System.out.println(name + "클래스가 볼륨다운 수행중입니다."); 
	}
	
	// default method 추가 (1.8 버전 이후) -> "선택적 오버라이딩"
	default void print3() {
		System.out.println("뒤늦게 해당 메서드 추가 - 자식 클래스는 오버라이딩 해도 되고 안해도 됨!");
	}
}

class Speaker2 implements Volume2 {
	
	int VolLevel;
	
	Speaker2(int vol) {
		VolLevel = vol;
		System.out.println("현재 speaker의 볼륨 = " + VolLevel);
	}
	
	// - 100 ~ 100
	public void volumeUp(int vol) {
		
		Volume2.print1("Speaker");
		
		VolLevel += vol;
		if (VolLevel > 100) {
			VolLevel = 100;
		}
		System.out.println("현재 speaker의 볼륨 = " + VolLevel);
	}
	
	public void volumeDown(int vol) {
		
		Volume2.print2("Speaker");
		
		VolLevel -= vol;
		if (VolLevel < -100) {
			VolLevel = -100;
		}
		System.out.println("현재 speaker의 볼륨 = " + VolLevel);
	}
	
	// Speaker에서만 default 메서드 오버라이딩 (1.8버전이후) - 선택적 오버라이딩
	public void print3() {
		System.out.println("default method(선택적 오버라이딩) - Speaker 클래스에서만 오버라이딩 합니다.");
	}
	
}

class TV2 implements Volume2 {
	
	int VolLevel;
	
	TV2(int vol) {
		VolLevel = vol;
		System.out.println("현재 tv의 볼륨 = " + VolLevel);
	}
	
	public void volumeUp(int vol) {
		Volume2.print1("TV");
		VolLevel += vol;
		System.out.println("현재 tv의 볼륨 = " + VolLevel);
	}
	
	public void volumeDown(int vol) {
		Volume2.print2("TV");
		VolLevel -= vol;
		if (VolLevel < 0) {
			VolLevel = 0;
		}
		System.out.println("현재 tv의 볼륨 = " + VolLevel);
	}
	
}

class Radio2 implements Volume2 {
	
	int VolLevel;
	
	Radio2(int vol) {
		VolLevel = vol;
		System.out.println("현재 radio의 볼륨 = " + VolLevel);
	}
	
	public void volumeUp(int vol) {
		Volume2.print1("Radio");
		VolLevel += vol;
		System.out.println("현재 radio의 볼륨 = " + VolLevel);
	}
	
	public void volumeDown(int vol) {
		Volume2.print2("Radio");
		VolLevel -= vol;
		System.out.println("현재 radio의 볼륨 = " + VolLevel);
	}
	
}



public class VolumeTestAnswer {

	public static void main(String[] args) {
		
		Volume2[] v = new Volume2[3];
		// 서로 다른 클래스에 관계 맺어줌 (인터페이스 형변환 or 클래스 형변환)
		v[0] = new Speaker2(50);
		v[1] = new TV2(40);
		v[2] = new Radio2(30);
		
		for (int i = 0; i < v.length; i++) {
			v[i].volumeUp(200);
			v[i].volumeDown(300);
			v[i].print3();
		}

	}

}
