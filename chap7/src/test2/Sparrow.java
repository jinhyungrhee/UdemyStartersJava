package test2;

public class Sparrow extends Bird{
	
	private String friend;
	
//	Sparrow(String name, int legs, int length) {
//		super(name, legs, length);
//	}
	
	Sparrow(String name) {
//		super(name, legs, length);
		this.setName(name);
	}
	
	public void makeFriend() {
		
		friend = "허수아비";
		System.out.printf("참새의 친구는 %s입니다.\n", friend);
	}
	
	// Overriding
	@Override
	public void fly() {
		System.out.printf("참새(%s)가 날아다닙니다.\n", getName());
	}
	
	@Override
	public void sing() {
		System.out.printf("참새(%s)가 소리내어 웁니다.\n", getName());
	}
	
	@Override
	public void print() {
		System.out.printf("참새의 이름은 %s 입니다.\n", getName());
	}

}
