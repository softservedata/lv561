package com.softserve.edu.Project.Game;



public class Game {
	private MainFrame game = new MainFrame();

	public MainFrame getGame() {
		return game;
	}

	public void initGame() {

		game.getBtn11().setText("");

		game.getBtn12().setText("");
		game.getBtn13().setText("");

		game.getBtn21().setText("");
		game.getBtn22().setText("");
		game.getBtn23().setText("");

		game.getBtn31().setText("");
		game.getBtn32().setText("");
		game.getBtn33().setText("");
		game.setArr();
	}

}
