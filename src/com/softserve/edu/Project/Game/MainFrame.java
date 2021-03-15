package com.softserve.edu.Project.Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainFrame extends JFrame {
	private JButton btn11 = new JButton();
	private JButton btn12 = new JButton();
	private JButton btn13 = new JButton();
	private JButton btn21 = new JButton();
	private JButton btn22 = new JButton();
	private JButton btn23 = new JButton();
	private JButton btn31 = new JButton();
	private JButton btn32 = new JButton();
	private JButton btn33 = new JButton();
	private JPanel grid = new JPanel();
	private int[][] arr = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
	private int chckWin = 0;
	private int xchckWin = 0;

	private int chckRow = 0;
	private int chckColumn = 0;
	private int chckDiagL = 0;
	private int chckDiagR = 0;

	public void setArr() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.arr[i][j] = 0;
			}
		}
	}

	public JButton getBtn11() {
		return btn11;
	}

	public JButton getBtn12() {
		return btn12;
	}

	public JButton getBtn13() {
		return btn13;
	}

	public JButton getBtn21() {
		return btn21;
	}

	public JButton getBtn22() {
		return btn22;
	}

	public JButton getBtn23() {
		return btn23;
	}

	public JButton getBtn31() {
		return btn31;
	}

	public JButton getBtn32() {
		return btn32;
	}

	public JButton getBtn33() {
		return btn33;
	}

	public MainFrame() {

		JFrame mainFrame = new JFrame("Tic-Tac-Toe");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setSize(500, 500);
		mainFrame.setPreferredSize(new Dimension(300, 300));
		mainFrame.setResizable(false);

		Font fnt = new Font("TimesRoman", Font.BOLD, 50);

		GridLayout layout = new GridLayout(3, 3, 5, 5);
		grid.setLayout(layout);
		Action action = new ClickAction();

		btn11.setAction(action);

		btn11.setFont(fnt);
		btn11.setName("11");
		grid.add(btn11);

		btn12.setAction(action);
		btn12.setFont(fnt);
		btn12.setName("12");
		grid.add(btn12);

		btn13.setAction(action);
		btn13.setFont(fnt);
		btn13.setName("13");
		grid.add(btn13);

		btn21.setAction(action);
		btn21.setFont(fnt);
		btn21.setName("21");
		grid.add(btn21);

		btn22.setAction(action);
		btn22.setFont(fnt);
		btn22.setName("22");
		grid.add(btn22);

		btn23.setAction(action);
		btn23.setFont(fnt);
		btn23.setName("23");
		grid.add(btn23);

		btn31.setAction(action);
		btn31.setFont(fnt);
		btn31.setName("31");
		grid.add(btn31);

		btn32.setAction(action);
		btn32.setFont(fnt);
		btn32.setName("32");
		grid.add(btn32);

		btn33.setAction(action);
		btn33.setFont(fnt);
		btn33.setName("33");
		grid.add(btn33);

		mainFrame.getContentPane().add(grid);

		mainFrame.pack();
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);

	}

	private JDialog createDialog(String title, String msg, boolean modal) {
		JDialog dialog = new JDialog(this, title, modal);
		dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JButton dialogButton = new JButton("OK");
		JLabel dialogLabel = new JLabel(msg);
		JPanel grid = new JPanel(new GridLayout(2, 1, 2, 2));
		grid.add(dialogLabel);
		grid.add(dialogButton);
		JPanel flow = new JPanel(new FlowLayout(FlowLayout.CENTER));
		flow.add(grid);

		Container container = dialog.getContentPane();

		container.add(flow, BorderLayout.SOUTH);

		dialogButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				dialog.dispose();
				JDialog newGame = CreateDialogNewGame("Start new Game?", "Do you want start new game?", true);
				newGame.setLocationRelativeTo(null);
				newGame.setVisible(true);

			}
		});

		dialog.setLocationRelativeTo(null);
		dialog.setSize(350, 100);

		return dialog;

	}

	private JDialog CreateDialogNewGame(String title, String msg, boolean modal) {
		JDialog newGame = new JDialog(this, "Start new Game?", true);
		newGame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JButton yesButton = new JButton("Yes");
		JButton noButton = new JButton("No");
		JLabel dialogLabel = new JLabel(msg);
		JPanel gridLabel = new JPanel(new GridLayout(1, 1, 2, 2));
		JPanel gridButton = new JPanel(new GridLayout(1, 2, 2, 2));
		JPanel grid = new JPanel(new GridLayout(2, 1, 2, 2));
		gridLabel.add(dialogLabel);
		gridButton.add(yesButton);
		gridButton.add(noButton);
		grid.add(gridLabel);
		grid.add(gridButton);
		JPanel flow = new JPanel(new FlowLayout(FlowLayout.CENTER));
		flow.add(grid, BorderLayout.CENTER);

		Container container = newGame.getContentPane();

		container.add(flow);
		noButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		yesButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				newGame.dispose();
				initGame();

			}
		});

		newGame.setLocationRelativeTo(null);
		newGame.setSize(350, 100);
		return newGame;

	}

	public void initGame() {
		Color bg = new Color(238, 238, 238);
		getBtn11().setText("");
		getBtn11().setBackground(bg);

		getBtn12().setText("");
		getBtn12().setBackground(bg);

		getBtn13().setText("");
		getBtn13().setBackground(bg);

		getBtn21().setText("");
		getBtn21().setBackground(bg);

		getBtn22().setText("");
		getBtn22().setBackground(bg);

		getBtn23().setText("");
		// getBtn23().
		getBtn23().setBackground(bg);

		getBtn31().setText("");
		getBtn31().setBackground(bg);

		getBtn32().setText("");
		getBtn32().setBackground(bg);

		getBtn33().setText("");
		getBtn33().setBackground(bg);

		setArr();
		chckWin = 0;
		xchckWin = 0;
	}

	public int chckGame(int[][] arr, int indxI, int indxJ, String player) {
		// ----перевірка діагоналі -> X-player
		int xchckWin = 0;
		if ((indxI == 0 || indxI == 2) && (indxJ == 0 || indxJ == 2)) {
			for (int i = 0; i < 3; i++) {
				xchckWin = xchckWin + arr[indxI][indxI];
			}

			if (xchckWin == 3) {
				JDialog dialogWindow = createDialog("Game Over", player + " win!!!", true);
				dialogWindow.setLocationRelativeTo(null);
				dialogWindow.setVisible(true);
				return indxI * 10 + indxJ;
				// for (int k = 0; k < 3; k++) {

				// btnTmp = (JButton) grid.getComponent((3 * k + k));
				// btnTmp.setBackground(Color.red);

				// }

			}

			// перевірка діагоналі <-
			xchckWin = 0;
			for (int i = 0; i < 3; i++) {

				xchckWin = xchckWin + arr[i][Math.abs(i - 2)];
			}
			// System.out.println("xchckWin = " + xchckWin);

			if (xchckWin == 3) {
				JDialog dialogWindow = createDialog("Game Over", player + " win!!!", true);
				dialogWindow.setLocationRelativeTo(null);
				dialogWindow.setVisible(true);
				return indxI * 10 + indxJ;
				// for (int k = 2; k >= 0; k--) {
				// btnTmp = (JButton) grid.getComponent((2 * k + 2));
				// btnTmp.setBackground(Color.red);
				// }

				// return;
			}

		}

		// перевірка сповчика для Х

		xchckWin = 0;
		for (int i = 0; i < 3; i++) {
			// System.out.println("X chckWin = XchckWin + arr[" + indxI + "][" + indxJ + "]
			// - " + xchckWin
			// + "+" + arr[i][((index % 10) - 1)]);
			xchckWin = xchckWin + arr[i][indxJ];
			// System.out.println("X chckWin = " + xchckWin);
			if (xchckWin == 3) {
				// for (int k = 0; k < 3; k++) {

				// btnTmp = (JButton) grid.getComponent((3 * k + indxJ));
				// btnTmp.setBackground(Color.red);

				// }
				JDialog dialogWindow = createDialog("Game Over", "Crosses win!!!", true);
				dialogWindow.setLocationRelativeTo(null);
				dialogWindow.setVisible(true);
				// return;
				return indxI * 10 + indxJ;
			}
		}
		// перевірка рядка для Х
		xchckWin = 0;
		for (int j = 0; j < 3; j++) {
			// System.out.println("X chckWin = xchckWin + arr[" + indxI + "][" + j + "] - "
			// + xchckWin + "+"
			// + arr[((index / 10) - 1)][j]);
			xchckWin = xchckWin + arr[indxI][j];

			// System.out.println("X chckWin = " + xchckWin);
			if (xchckWin == 3) {
				// for (int k = 0; k < 3; k++) {

				// btnTmp = (JButton) grid.getComponent((3 * indxI) + k);
				// btnTmp.setBackground(Color.red);

				// }
				JDialog dialogWindow = createDialog("Game Over", "X win!!!", true);
				dialogWindow.setLocationRelativeTo(null);
				dialogWindow.setVisible(true);
				// return;
				return indxI * 10 + indxJ;

			}
		}
		return 0;

	}

	class ClickAction extends AbstractAction {

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton btn = (JButton) e.getSource();
			// System.out.println(btn.getBackground());
			JButton btnTmp = new JButton();
			int index = Integer.parseInt(btn.getName());// Index of button. Start from 11
			int indexC = 0; // for random index free random free button
			boolean xNext = true;

			if (btn.getText() == null || btn.getText().equals("")) { // Player set 0 if field is empty
				arr[((index / 10) - 1)][((index % 10) - 1)] = 10;
				btn.setText("O");

				/*-	int chckG = chckGame(arr, ((index / 10) - 1), ((index % 10) - 1), "ZEROS");
					if(chckG!=0) {
						
					}*/

				// Перевірка діагоналі ->
				chckWin = 0;
				if ((((index / 10) - 1) == 0 || ((index / 10) - 1) == 2)
						&& (((index % 10) - 1) == 0 || ((index % 10) - 1) == 2)) {
					for (int i = 0; i < 3; i++) {
						chckWin = chckWin + arr[i][i];
					}

					if (chckWin == 30) {
						for (int k = 0; k < 3; k++) {

							btnTmp = (JButton) grid.getComponent((3 * k + k));
							btnTmp.setBackground(Color.red);

						}
						JDialog dialogWindow = createDialog("Game Over", "ZEROS win!!!", true);
						dialogWindow.setLocationRelativeTo(null);
						dialogWindow.setVisible(true);
						return;
					}

					// Перевірка діагоналі <-
					chckWin = 0;
					for (int i = 2; i >= 0; i--) {
						chckWin = chckWin + arr[i][Math.abs(i - 2)];
					}

					if (chckWin == 30) {
						for (int k = 2; k >= 0; k--) {

							btnTmp = (JButton) grid.getComponent((2 * k + 2));
							btnTmp.setBackground(Color.red);

						}
						JDialog dialogWindow = createDialog("Game Over", "ZEROS win!!!", true);
						dialogWindow.setLocationRelativeTo(null);
						dialogWindow.setVisible(true);
						return;

					}

					// перевірка стовпчика
					chckWin = 0;
					for (int i = 0; i < 3; i++) {
						System.out.println("chckWin = chckWin + arr[" + i + "][" + ((index % 10) - 1) + "] - " + chckWin
								+ "+" + arr[i][((index % 10) - 1)]);
						chckWin = chckWin + arr[i][((index % 10) - 1)];
					}
					System.out.println("chckWin = " + chckWin);
					if (chckWin == 30) {
						for (int k = 0; k < 3; k++) {

							btnTmp = (JButton) grid.getComponent((3 * k + (index % 10) - 1));
							btnTmp.setBackground(Color.red);

						}
						JDialog dialogWindow = createDialog("Game Over", "ZEROS win!!!", true);
						dialogWindow.setLocationRelativeTo(null);
						dialogWindow.setVisible(true);
						return;

					}

					// Перевірка чи в стовпці є вже два Нулика в стовпчику, indexC вільної кнопки

					if (chckWin == 20) {
						for (int l = 0; l < 3; l++) {
							if (arr[l][((index % 10) - 1)] == 0) {
								indexC = 3 * l + ((index % 10) - 1);
								arr[l][((index % 10) - 1)] = 1;
							}
						}
						btnTmp = (JButton) grid.getComponent(indexC);
						btnTmp.setText("X");
						xNext = false;

						xchckWin = 0;
						if ((((index / 10) - 1) == 0 || ((index / 10) - 1) == 2)
								&& (((index % 10) - 1) == 0 || ((index % 10) - 1) == 2)) {
							for (int i = 0; i < 3; i++) {
								xchckWin = xchckWin + arr[i][i];
							}

							if (xchckWin == 3) {
								for (int k = 0; k < 3; k++) {

									btnTmp = (JButton) grid.getComponent((3 * k + k));
									btnTmp.setBackground(Color.red);

								}
								JDialog dialogWindow = createDialog("Game Over", "Crosses win!!!", true);
								dialogWindow.setLocationRelativeTo(null);
								dialogWindow.setVisible(true);
								return;
							}

							// Перевірка діагоналі <-
							xchckWin = 0;
							for (int i = 2; i >= 0; i--) {
								chckWin = chckWin + arr[i][Math.abs(i - 2)];
							}

							if (xchckWin == 3) {
								for (int k = 2; k >= 0; k--) {

									btnTmp = (JButton) grid.getComponent((2 * k + 2));
									btnTmp.setBackground(Color.red);

								}
								JDialog dialogWindow = createDialog("Game Over", "Crosse win!!!", true);
								dialogWindow.setLocationRelativeTo(null);
								dialogWindow.setVisible(true);
								return;

							}

							// перевірка стовпчика
							xchckWin = 0;
							for (int i = 0; i < 3; i++) {
								System.out.println("xchckWin = xchckWin + arr[" + i + "][" + ((index % 10) - 1) + "] - "
										+ xchckWin + "+" + arr[i][((index % 10) - 1)]);
								xchckWin = xchckWin + arr[i][((index % 10) - 1)];
							}
							System.out.println("xchckWin = " + xchckWin);
							if (xchckWin == 3) {
								for (int k = 0; k < 3; k++) {

									btnTmp = (JButton) grid.getComponent((3 * k + (index % 10) - 1));
									btnTmp.setBackground(Color.red);

								}
								JDialog dialogWindow = createDialog("Game Over", "ZEROS win!!!", true);
								dialogWindow.setLocationRelativeTo(null);
								dialogWindow.setVisible(true);
								return;
							}

							// перевірка рядка
							xchckWin = 0;
							for (int j = 0; j < 3; j++) {
								System.out.println("xchckWin = xchckWin + arr[" + ((index / 10) - 1) + "][" + j + "] - "
										+ xchckWin + "+" + arr[((index / 10) - 1)][j]);
								xchckWin = xchckWin + arr[((index / 10) - 1)][j];
							}

							System.out.println("xchckWin = " + xchckWin);

							if (xchckWin == 3) {
								for (int k = 0; k < 3; k++) {

									btnTmp = (JButton) grid.getComponent((3 * ((index / 10) - 1)) + k);
									btnTmp.setBackground(Color.red);

								}
								JDialog dialogWindow = createDialog("Game Over", "Crosses win!!!", true);
								dialogWindow.setLocationRelativeTo(null);
								dialogWindow.setVisible(true);
								return;

							}

						}

// перевірка рядка
						chckWin = 0;
						for (int j = 0; j < 3; j++) {
							System.out.println("chckWin = chckWin + arr[" + ((index / 10) - 1) + "][" + j + "] - "
									+ chckWin + "+" + arr[((index / 10) - 1)][j]);
							chckWin = chckWin + arr[((index / 10) - 1)][j];
						}

						System.out.println("chckWin = " + chckWin);

						if (chckWin == 30) {
							for (int k = 0; k < 3; k++) {

								btnTmp = (JButton) grid.getComponent((3 * ((index / 10) - 1)) + k);
								btnTmp.setBackground(Color.red);

							}
							JDialog dialogWindow = createDialog("Game Over", "ZEROS win!!!", true);
							dialogWindow.setLocationRelativeTo(null);
							dialogWindow.setVisible(true);
							return;

						}

						System.out.println("Value arrays element at index " + ((index / 10) - 1) + " "
								+ ((index % 10) - 1) + "-" + arr[(index / 10) - 1][(index % 10) - 1]);

						System.out.println("ButtonName: " + btn.getName());
					}
				} else {
					return;
				}

//Computers step
				// Set priority. element [1][1] have higthest priority
				List<Integer> arrayRnd = new ArrayList<>();
				List<String> indxButton = new ArrayList<>();
				if (arr[1][1] == 0) {
					arr[1][1] = 1;
					indexC = 3 * 1 + 1;// number element in array is 3*i+j
					btnTmp = (JButton) grid.getComponent(indexC);
					btnTmp.setText("X");

				} else {
					if (xNext == true) {

						int indxI = 0;
						int indxJ = 0;

						// Define index button component on frame

						for (int i = 0; i < 3; i++) {
							for (int j = 0; j < 3; j++) {
								if (arr[i][j] == 0) {
									arrayRnd.add(3 * i + j);
									indxButton.add(String.valueOf(i) + String.valueOf(j));
								}
							}
						}

						if (arrayRnd.size() != 0) {
							indexC = new Random().nextInt(arrayRnd.size());// random index in array of indexes of free
																			// cell
							System.out.println("Random().nextInt(arrayRnd.length): " + arrayRnd.get(indexC)
									+ "\nIndexC: " + indexC);
							btnTmp = (JButton) grid.getComponent(arrayRnd.get(indexC));// random free corner button
							btnTmp.setText("X");
							indxI = Integer.parseInt(indxButton.get(indexC).substring(0, 1));
							indxJ = Integer.parseInt(indxButton.get(indexC).substring(1));
							arr[indxI][indxJ] = 1;

							// ----перевірка діагоналі -> X-player
							xchckWin = 0;
							if ((indxI == 0 || indxI == 2) && (indxJ == 0 || indxJ == 2)) {
								for (int i = 0; i < 3; i++) {
									xchckWin = xchckWin + arr[i][i];
								}

								if (xchckWin == 3) {
									for (int k = 0; k < 3; k++) {

										btnTmp = (JButton) grid.getComponent((3 * k + k));
										btnTmp.setBackground(Color.red);

									}
									JDialog dialogWindow = createDialog("Game Over", "Crosses win!!!", true);
									dialogWindow.setLocationRelativeTo(null);
									dialogWindow.setVisible(true);
									return;
								}

								// перевірка діагоналі <-
								xchckWin = 0;
								for (int i = 0; i < 3; i++) {

									xchckWin = xchckWin + arr[i][Math.abs(i - 2)];
								}
								System.out.println("xchckWin = " + xchckWin);

								if (xchckWin == 3) {
									for (int k = 2; k >= 0; k--) {
										btnTmp = (JButton) grid.getComponent((2 * k + 2));
										btnTmp.setBackground(Color.red);
									}
									JDialog dialogWindow = createDialog("Game Over", "Crosses win!!!", true);
									dialogWindow.setLocationRelativeTo(null);
									dialogWindow.setVisible(true);
									return;
								}

							}

							// перевірка сповчика для Х

							xchckWin = 0;
							for (int i = 0; i < 3; i++) {
								System.out.println("X chckWin = XchckWin + arr[" + indxI + "][" + indxJ + "] - "
										+ xchckWin + "+" + arr[i][((index % 10) - 1)]);
								xchckWin = xchckWin + arr[i][indxJ];
								System.out.println("X chckWin = " + xchckWin);
								if (xchckWin == 3) {
									for (int k = 0; k < 3; k++) {

										btnTmp = (JButton) grid.getComponent((3 * k + indxJ));
										btnTmp.setBackground(Color.red);

									}
									JDialog dialogWindow = createDialog("Game Over", "Crosses win!!!", true);
									dialogWindow.setLocationRelativeTo(null);
									dialogWindow.setVisible(true);
									return;

								}
							}
							// перевірка рядка для Х
							xchckWin = 0;
							for (int j = 0; j < 3; j++) {
								System.out.println("X chckWin = xchckWin + arr[" + indxI + "][" + j + "] - " + xchckWin
										+ "+" + arr[((index / 10) - 1)][j]);
								xchckWin = xchckWin + arr[indxI][j];

								System.out.println("X chckWin = " + xchckWin);
								if (xchckWin == 3) {
									for (int k = 0; k < 3; k++) {

										btnTmp = (JButton) grid.getComponent((3 * indxI) + k);
										btnTmp.setBackground(Color.red);

									}
									JDialog dialogWindow = createDialog("Game Over", "Crosses win!!!", true);
									dialogWindow.setLocationRelativeTo(null);
									dialogWindow.setVisible(true);
									return;

								}
							}

						} else {
							JDialog dialogWindow = createDialog("Game Over", "Nobady win!!!", true);
							dialogWindow.setLocationRelativeTo(null);
							dialogWindow.setVisible(true);
							return;

						}
					}

					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							System.out.print(arr[i][j] + "| ");
						}
						System.out.println("\n-----------");
					}

				}
			}
		}
	}
}
