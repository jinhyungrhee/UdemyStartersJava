package test2;

public class Duck extends Bird{
	
	private int web;
	
//	Duck(String name, int legs, int length, int web) {
//		super(name, legs, length);
//		this.web = web;
//	}
	
	Duck(String name, int web) {
		//super(name, legs, length);
		this.setName(name);
		this.web = web;
	}
	
	
	public void swim() {
		System.out.printf("오리(%s)가 %d개의 물갈퀴로 수영합니다.\n", getName(), web);
	}
	
	// Overriding
	@Override
	public void fly() {
		System.out.printf("오리(%s)는 날지 않습니다.\n", getName());
	}
	
	@Override
	public void sing() {
		System.out.printf("오리(%s)가 소리내어 웁니다.\n", getName());
	}
	
	@Override
	public void print() {
		System.out.printf("오리의 이름은 %s 입니다.\n", getName());
	}

}
