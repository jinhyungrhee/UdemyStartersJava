package com.in28minutes.oops.level2;

public abstract class AbstractRecipe {
	
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}
	
	// prepare
	// recipe
	// cleanup
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanup();

	// 하위 클래스들이 구현하도록 남겨둠	
	
}
