package com.softserve.edu.Project.MyWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JDesktopPane jdpMyDesktop;
	
	
	public MyWindow() {
		super("Caption: MyWindow");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jdpMyDesktop = new JDesktopPane();

		setContentPane(jdpMyDesktop);
		// createChildWindow();

		// Menu
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(createView());
		menuBar.add(createMenuDictionary());
		menuBar.add(createExit());

		menuBar.add(Box.createHorizontalGlue());
		setJMenuBar(menuBar);

		setPreferredSize(new Dimension(1024, 680));
		pack();
		setVisible(true);

	}

	class MyChildWindow extends JInternalFrame {

		public MyChildWindow() {
			super("Дочірнє вікно", true, true, true, true);
			setSize(600, 500);
			setLocation(200, 50);
		}

	}

	protected void createChildWindow() {
		MyChildWindow chFrame = new MyChildWindow();
		chFrame.setVisible(true);
		jdpMyDesktop.add(chFrame);
		try {
			chFrame.setSelected(true);
		} catch (java.beans.PropertyVetoException e) {

		}

	}

	private JMenu createMenuDictionary() {
		JMenu dictionary = new JMenu("Довідники");
		JMenu menuItemStreet = new JMenu("Довідник вулиць");
		dictionary.add(menuItemStreet);
		JMenuItem viewStreet = new JMenuItem(new ShowStreetAction());
		JMenuItem dropStreet = new JMenuItem("Видалити");
		JMenuItem loadStreet = new JMenuItem("Завантажити");
		menuItemStreet.add(viewStreet);
		menuItemStreet.add(loadStreet);
		menuItemStreet.addSeparator();
		menuItemStreet.add(dropStreet);
		return dictionary;
	}

	private JMenu createView() {
		JMenu view = new JMenu("Перегляд");
		JMenuItem viewAll = new JMenuItem("Перегляути все");
		JMenuItem find = new JMenuItem("Пошук");
		view.add(viewAll);
		view.add(find);
		return view;
	}

	private JMenuItem createExit() {
		JMenuItem exit = new JMenuItem(new ExitAction());

		return exit;

	}

	class ExitAction extends AbstractAction {
		private static final long serialVersionUID = 1L;

		ExitAction() {
			putValue(NAME, "Вихід");
		}

		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	class ShowStreetAction extends AbstractAction {

		public ShowStreetAction() {
			// TODO Auto-generated constructor stub
			putValue(NAME, "Перегляд");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// createChildWindow();
			MyChildWindow chFrame = new MyChildWindow();
			chFrame.setTitle("Заголовок: Перегляд - Довідник вулиць");
			JTable table = new JTable(5, 4);
			chFrame.add(table);
			JScrollPane scroll = new JScrollPane(table);
			chFrame.getContentPane().add(scroll, BorderLayout.SOUTH);

			chFrame.setVisible(true);
			jdpMyDesktop.add(chFrame);
			try {
				chFrame.setSelected(true);
			} catch (java.beans.PropertyVetoException ex) {

			}
			
			//----------------
			DbConnection dbCon = new DbConnection();
			dbCon.Connect("admin", "root");

			Statement stm = null;
			try {
				stm = dbCon.getConnection().createStatement();
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(ex.getMessage() + " \nNo Ok");
			}
			ResultSet executeQuery = null;
			try {
				executeQuery = stm.executeQuery("SELECT * FROM STREET");
				while (executeQuery.next()) {
					System.out.println(executeQuery.getString(1) + " " + executeQuery.getString(2) + " "
							+ executeQuery.getString(3) + " " + executeQuery.getString(4) + " ");
					
					
				}
			} catch (SQLException exx) {
				// TODO Auto-generated catch block
				exx.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		// JFrame.setDefaultLookAndFeelDecorated(true);
		new MyWindow();
		
		// dao_mssql ins = new dao_mssql();
		// ins.setURL("localhost+", "DbPerson",1433);
		// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// ins.Connect ("admin","root");
		

	}
}
