package test2;

public class PlayBird {

	public static void main(String[] args) {

		//Duck duck = new Duck("꽥꽥이", 2, 50, 2);
		Duck duck = new Duck("꽥꽥이", 2);
		duck.fly();
		duck.sing();
		duck.swim();
		duck.print();
		
//		Sparrow sparrow = new Sparrow("짹짹", 2, 5);
		Sparrow sparrow = new Sparrow("짹짹");
		sparrow.fly();
		sparrow.sing();
		sparrow.makeFriend();
		sparrow.print();
		
	}

	

}
