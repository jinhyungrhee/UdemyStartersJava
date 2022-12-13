package com.in28minutes.oops.level2.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		
		//MarioGame game = new MarioGame();
		//ChessGame game = new ChessGame();
		
		//GamingConsole game = new MarioGame();
		//GamingConsole game = new ChessGame();
		
		// 배열로 만들어서 다양한 타입에 대한 대응이 가능해짐!
		GamingConsole[] games = {new MarioGame(), new ChessGame()};
		
		for (GamingConsole game : games) {
			game.up();
			game.left();
			game.down();
			game.right();
		}
		
	}

}
