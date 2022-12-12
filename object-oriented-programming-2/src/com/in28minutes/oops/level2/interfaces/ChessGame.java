package com.in28minutes.oops.level2.interfaces;

public class ChessGame implements GamingConsole {

	// 이 버튼들에 각자 무엇을 하고 싶은지 정의하면 됨!
	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Move piece up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Move piece down");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Move piece left");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Move piece right");
	}

}
