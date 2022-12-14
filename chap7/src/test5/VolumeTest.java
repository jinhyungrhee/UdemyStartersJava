package test5;

class Speaker implements Volume{
	private int volLevel;
	
	Speaker() {}

	@Override
	public void volumeUp(int level) {
		
		volLevel += level;
		
		if (volLevel > 100) { volLevel = 100; }
		
		System.out.println("현재 스피커 음량은 " + volLevel +" 입니다.");
	}

	@Override
	public void volumeDonwn(int level) {
		
		volLevel -= level;
		
		if (volLevel < -100) { volLevel = -100; }
		
		System.out.println("현재 스피커 음량은 " + volLevel +" 입니다.");
		
	}
}

class Radio implements Volume {
	private int volLevel;
	
	Radio() {}

	@Override
	public void volumeUp(int level) {
		
		volLevel += level;
		System.out.println("현재 라디오 음량은 " + volLevel + " 입니다.");
		
	}

	@Override
	public void volumeDonwn(int level) {
		
		volLevel -= level;
		System.out.println("현재 라디오 음량은 " + volLevel + " 입니다.");
		
	}
	
}

class TV implements Volume {
	private int volLevel;
	
	TV() {}

	@Override
	public void volumeUp(int level) {
		
		volLevel += level;
		System.out.println("현재 TV 음량은 " + volLevel + " 입니다.");
		
	}

	@Override
	public void volumeDonwn(int level) {
		
		volLevel -= level;
		
		if (volLevel < 0) { volLevel = 0; }
		
		System.out.println("현재 TV 음량은 " + volLevel + " 입니다.");
		
	}
}

public class VolumeTest {

	public static void main(String[] args) {
		
		Volume[] v = new Volume[3];
		v[0] = new Speaker();
		v[1] = new TV();
		v[2] = new Radio();
		
		for (int i = 0; i < v.length; i++) {
			v[i].volumeUp(200);
			v[i].volumeDonwn(300);
		}

	}

}
