package com.in28minutes.oops.level2.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		
		//MarioGame game = new MarioGame();
		//ChessGame game = new ChessGame();
		
		//GamingConsole game = new MarioGame();
		GamingConsole game = new ChessGame();
		
		game.up();
		game.left();
		game.down();
		game.right();
	}

}
