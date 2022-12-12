package test2;

public class Bird {
	
	private String name;
	private int legs;
	private int length;
	
//	Bird(String name, int legs, int length) {
//		this.name = name;
//		this.legs = legs;
//		this.length = length;
//	}
	
	// setter & getter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void fly() {
		System.out.println("새가 날아다닙니다");
	}
	
	public void sing() {
		System.out.println("새가 소리내어 웁니다.");
	}
	 
	public void print() {
		System.out.printf("새의 이름은 %s 입니다.\n", getName());
	}

}
