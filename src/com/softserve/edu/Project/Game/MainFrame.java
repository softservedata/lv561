package com.softserve.edu.Project.Game;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private JButton btn11 = new JButton();
	private JButton btn22 = new JButton();

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
		JPanel grid = new JPanel();
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

	class ClickAction extends AbstractAction {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int[][] arr = { { -1, -1, -1 }, { -1, -1, -1 }, { -1, -1, -1 } };

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton btn = (JButton) e.getSource();
			int index = Integer.parseInt(btn.getName());

			if (btn.getText() == null) {

				arr[(index / 10) - 1][(index % 10 - 1)] = 0;
				btn.setText("O");
			}

			System.out.println(arr[(index / 10) - 1][(index % 10) - 1]);
			System.out.println(btn.getName());

			if (arr[1][1] == -1) {
				arr[1][1] = 1;
				btn22.setText("X");
			}

			
			  for(int i = 0; i< 3; i++) { System.out.println( );
			  
			 for (int j = 0; j < 3; j++) { System.out.print( arr[i][j]+" ");
			  
			 } }
			 
			/*
			 * switch ( btn.getText() ){ case "X" : btn.setText("O"); break; case "O" :
			 * btn.setText("X"); break; }
			 */

		}

	}

}
