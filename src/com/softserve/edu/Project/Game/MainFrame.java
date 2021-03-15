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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainFrame extends JFrame {
	private JButton btn11 = new JButton();
	private JButton btn22 = new JButton();
	private JPanel grid = new JPanel();

	public JButton getBtn11() {
		return btn11;
	}

	public MainFrame() {

		JFrame mainFrame = new JFrame("Crosses-Zeros");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setSize(500, 500);
		mainFrame.setPreferredSize(new Dimension(300, 300));
		mainFrame.setResizable(false);

		Font fnt = new Font("TimesRoman", Font.BOLD, 50);

		GridLayout layout = new GridLayout(3, 3, 5, 5);
		grid.setLayout(layout);
		Action action = new ClickAction();

		btn11 = new JButton(action);
		btn11.setFont(fnt);
		btn11.setName("11");
		grid.add(btn11);

		JButton btn12 = new JButton(action);
		btn12.setFont(fnt);
		btn12.setName("12");
		grid.add(btn12);

		JButton btn13 = new JButton(action);
		btn13.setFont(fnt);
		btn13.setName("13");
		grid.add(btn13);

		JButton btn21 = new JButton(action);
		btn21.setFont(fnt);
		btn21.setName("21");
		grid.add(btn21);

		btn22 = new JButton(action);
		btn22.setFont(fnt);
		btn22.setName("22");
		grid.add(btn22);

		JButton btn23 = new JButton(action);
		btn23.setFont(fnt);
		btn23.setName("23");
		grid.add(btn23);

		JButton btn31 = new JButton(action);
		btn31.setFont(fnt);
		btn31.setName("31");
		grid.add(btn31);

		JButton btn32 = new JButton(action);
		btn32.setFont(fnt);
		btn32.setName("32");
		grid.add(btn32);

		JButton btn33 = new JButton(action);
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
		// Получение панели содержимого
		Container container = dialog.getContentPane();
		// Размещение панели с кнопками внизу справа
		container.add(flow, BorderLayout.SOUTH);

		dialog.setLocationRelativeTo(null);
		dialog.setSize(350, 100);
		// dialog.pack();
		return dialog;

	}

	class ClickAction extends AbstractAction {

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private int[][] arr = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton btn = (JButton) e.getSource();
			JButton btnTmp = new JButton();
			int index = Integer.parseInt(btn.getName());// Index of button. Start from 11
			int indexC = 0; // for random index free random free button
			boolean isNext = true; // Check existing next step
			int chckWin = 0;
			int xchckWin = 0;

			if (btn.getText() == null) { // Player set 0 if field is empty
				arr[((index / 10) - 1)][((index % 10) - 1)] = 10;
				btn.setText("O");
				
				/*if ((((index / 10) - 1) == 0 || ((index / 10) - 1) == 2) && (((index % 10) - 1) == 0 || ((index % 10) - 1) == 2) ) {
					for (int i = 0; i < 3; i++) {
						chckWin = chckWin + arr[i][i];
					}
					
					if (chckWin == 30) {
						for (int k = 0; k < 3; k++) {

							btnTmp = (JButton) grid.getComponent((3 * k + k));
							btnTmp.setBackground(Color.red);

						}
						JDialog dialogWindow = createDialog("Game Over", "O win!!!", true);
						dialogWindow.setLocationRelativeTo(null);
						dialogWindow.setVisible(true);
						return;

					}
					
					chckWin = 0;
					for (int i = 2; i >= 0; i--) {
						chckWin = chckWin + arr[i][i];
					}
					
					if (chckWin == 30) {
						for (int k = 2; k >= 0; k--) {

							btnTmp = (JButton) grid.getComponent((2 * k + k));
							btnTmp.setBackground(Color.red);

						}
						JDialog dialogWindow = createDialog("Game Over", "X win!!!", true);
						dialogWindow.setLocationRelativeTo(null);
						dialogWindow.setVisible(true);
						return;

					}
					
					
					
				}*/
				
				

				for (int i = 0; i < 3; i++) {
					System.out.println("chckWin = chckWin + arr[" + i + "][" + ((index % 10) - 1) + "] - " + chckWin
							+ "+" + arr[i][((index % 10) - 1)]);
					chckWin = chckWin + arr[i][((index % 10) - 1)];
					System.out.println("chckWin = " + chckWin);
					if (chckWin == 30) {
						for (int k = 0; k < 3; k++) {

							btnTmp = (JButton) grid.getComponent((3 * k + (index % 10) - 1));
							btnTmp.setBackground(Color.red);

						}
						JDialog dialogWindow = createDialog("Game Over", "Zero win!!!", true);
						dialogWindow.setLocationRelativeTo(null);
						dialogWindow.setVisible(true);
						return;

					}
				}

				chckWin = 0;
				for (int j = 0; j < 3; j++) {
					System.out.println("chckWin = chckWin + arr[" + ((index / 10) - 1) + "][" + j + "] - " + chckWin
							+ "+" + arr[((index / 10) - 1)][j]);
					chckWin = chckWin + arr[((index / 10) - 1)][j];

					System.out.println("chckWin = " + chckWin);
					if (chckWin == 30) {
						for (int k = 0; k < 3; k++) {

							btnTmp = (JButton) grid.getComponent((3 * ((index / 10) - 1)) + k);
							btnTmp.setBackground(Color.red);

						}
						JDialog dialogWindow = createDialog("Game Over", "Zero win!!!", true);
						dialogWindow.setLocationRelativeTo(null);
						dialogWindow.setVisible(true);
						return;

					}
				}

				System.out.println("Value arrays element at index " + ((index / 10) - 1) + " " + ((index % 10) - 1)
						+ "-" + arr[(index / 10) - 1][(index % 10) - 1]);
				System.out.println("ButtonName: " + btn.getName());
//Computers step
				// Set priority. element [1][1] have higthest priority
				List<Integer> arrayRnd = new ArrayList<>();
				List<String> indxButton = new ArrayList<>();
				if (arr[1][1] == 0) {
					arr[1][1] = 1;
					indexC = 3 * 1 + 1;// number element in array is 3*i+j
					btnTmp = (JButton) grid.getComponent(indexC);
					btnTmp.setText("X");
					isNext = false;

				} else {
					// Define index button component on frame

					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							if (arr[i][j] == 0) {
								arrayRnd.add(3 * i + j);
								indxButton.add(String.valueOf(i) + String.valueOf(j));
							}

						}
					}

					int indxI = 0;
					int indxJ = 0;
					if (arrayRnd.size() != 0) {
						indexC = new Random().nextInt(arrayRnd.size());// random index in array of indexes of free cell
						System.out.println(
								"Random().nextInt(arrayRnd.length): " + arrayRnd.get(indexC) + "\nIndexC: " + indexC);
						btnTmp = (JButton) grid.getComponent(arrayRnd.get(indexC));// random free corner button
						btnTmp.setText("X");
						indxI = Integer.parseInt(indxButton.get(indexC).substring(0, 1));
						indxJ = Integer.parseInt(indxButton.get(indexC).substring(1));
						arr[indxI][indxJ] = 1;
						
						//----перевірка діагоналей
						if ((indxI == 0 || indxI == 2) && (indxJ == 0 || indxJ == 2) ) {
							for (int i = 0; i < 3; i++) {
								xchckWin = xchckWin + arr[i][i];
							}
							
							if (xchckWin == 3) {
								for (int k = 0; k < 3; k++) {

									btnTmp = (JButton) grid.getComponent((3 * k + k));
									btnTmp.setBackground(Color.red);

								}
								JDialog dialogWindow = createDialog("Game Over", "X win!!!", true);
								dialogWindow.setLocationRelativeTo(null);
								dialogWindow.setVisible(true);
								return;

							}
							
							xchckWin = 0;
							for (int i = 0; i <3; i++) {
								xchckWin = xchckWin + arr[i][i+2];
							}
							
							if (xchckWin == 3) {
								for (int k = 2; k >= 0; k--) {

									btnTmp = (JButton) grid.getComponent((3 * k + k));
									btnTmp.setBackground(Color.red);

								}
								JDialog dialogWindow = createDialog("Game Over", "X win!!!", true);
								dialogWindow.setLocationRelativeTo(null);
								dialogWindow.setVisible(true);
								return;

							}
							
							
							
						}

						xchckWin = 0;
						for (int i = 0; i < 3; i++) {
							System.out.println("X chckWin = XchckWin + arr[" + indxI + "][" + indxJ + "] - " + xchckWin
									+ "+" + arr[i][((index % 10) - 1)]);
							xchckWin = xchckWin + arr[i][indxJ];
							System.out.println("X chckWin = " + xchckWin);
							if (xchckWin == 3) {
								for (int k = 0; k < 3; k++) {

									btnTmp = (JButton) grid.getComponent((3 * k + indxJ));
									btnTmp.setBackground(Color.red);

								}
								JDialog dialogWindow = createDialog("Game Over", "X win!!!", true);
								dialogWindow.setLocationRelativeTo(null);
								dialogWindow.setVisible(true);
								return;

							}
						}

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
								JDialog dialogWindow = createDialog("Game Over", "X win!!!", true);
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

					isNext = false;

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
