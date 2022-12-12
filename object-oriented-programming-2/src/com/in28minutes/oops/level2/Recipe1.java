package com.in28minutes.oops.level2;

public class Recipe1 extends AbstractRecipe{

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Get thw raw materials");
		System.out.println("Get the utensils");
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("do the dish");
		
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("Cleanup the utensils");
	}

}
