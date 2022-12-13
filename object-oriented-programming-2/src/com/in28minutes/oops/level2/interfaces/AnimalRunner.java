package com.in28minutes.oops.level2.interfaces;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {
	public void bark() {
		System.out.println("Meow Meow");
	}
}

public class AnimalRunner {
	
	public static void main(String[] args) {
		// 배열을 사용하면 여러가지 경우에 대응 가능!
		Animal[] animals = {new Cat(), new Dog()};
		
		for (Animal animal : animals) {
			animal.bark();
		}
	}

}
