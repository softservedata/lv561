package com.softserve.edu.Project.Game;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;

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

	public int chckGame(int[][] arr, int indxI, int indxJ, String player) {
		// ----перевірка діагоналі -> X-player
		int xchckWin = 0 ;
		if ((indxI == 0 || indxI == 2) && (indxJ == 0 || indxJ == 2)) {
			for (int i = 0; i < 3; i++) {
				xchckWin = xchckWin + arr[indxI][indxI];
			}

			if (xchckWin == 3) {
				for (int k = 0; k < 3; k++) {
					return indxI*10+indxJ;
					//btnTmp = (JButton) grid.getComponent((3 * k + k));
					//btnTmp.setBackground(Color.red);

				}
				//JDialog dialogWindow = createDialog("Game Over", "Crosses win!!!", true);
				//dialogWindow.setLocationRelativeTo(null);
				//dialogWindow.setVisible(true);
				//return;
			}

			// перевірка діагоналі <-
			xchckWin = 0;
			for (int i = 0; i < 3; i++) {

				xchckWin = xchckWin + arr[i][Math.abs(i - 2)];
			}
			System.out.println("xchckWin = " + xchckWin);

			if (xchckWin == 3) {
				return indxI*10+indxJ;
				//for (int k = 2; k >= 0; k--) {
					//btnTmp = (JButton) grid.getComponent((2 * k + 2));
					//btnTmp.setBackground(Color.red);
				//}
				//JDialog dialogWindow = createDialog("Game Over", "X win!!!", true);
				//dialogWindow.setLocationRelativeTo(null);
				//dialogWindow.setVisible(true);
				//return;
			}

		}

		// перевірка сповчика для Х

		xchckWin = 0;
		for (int i = 0; i < 3; i++) {
			//System.out.println("X chckWin = XchckWin + arr[" + indxI + "][" + indxJ + "] - " + xchckWin
				//	+ "+" + arr[i][((index % 10) - 1)]);
			xchckWin = xchckWin + arr[i][indxJ];
			System.out.println("X chckWin = " + xchckWin);
			if (xchckWin == 3) {
				for (int k = 0; k < 3; k++) {

					//btnTmp = (JButton) grid.getComponent((3 * k + indxJ));
					//btnTmp.setBackground(Color.red);

				}
				//JDialog dialogWindow = createDialog("Game Over", "Crosses win!!!", true);
				//dialogWindow.setLocationRelativeTo(null);
				//dialogWindow.setVisible(true);
				//return;
				return indxI*10+indxJ;
			}
		}
		// перевірка рядка для Х
		xchckWin = 0;
		for (int j = 0; j < 3; j++) {
		//	System.out.println("X chckWin = xchckWin + arr[" + indxI + "][" + j + "] - " + xchckWin + "+"
		//			+ arr[((index / 10) - 1)][j]);
			xchckWin = xchckWin + arr[indxI][j];

			System.out.println("X chckWin = " + xchckWin);
			if (xchckWin == 3) {
				for (int k = 0; k < 3; k++) {

					//btnTmp = (JButton) grid.getComponent((3 * indxI) + k);
					//btnTmp.setBackground(Color.red);

				}
			//	JDialog dialogWindow = createDialog("Game Over", "X win!!!", true);
			//	dialogWindow.setLocationRelativeTo(null);
			//	dialogWindow.setVisible(true);
			//	return;
				return indxI*10+indxJ;

			}
		}
		return 0;

	}
}
