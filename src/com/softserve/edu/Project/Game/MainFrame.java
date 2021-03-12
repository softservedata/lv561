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
import java.util.ArrayList;
import java.util.List;
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

    class ClickAction extends AbstractAction {

        /**
         *
         */
        private static final long serialVersionUID = 1L;
        private int[][] arr = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            JButton btn = (JButton) e.getSource();
            JButton btnTmp = new JButton();
            int index = Integer.parseInt(btn.getName());// Index of button. Start from 11
            int indexC = 0; //
            boolean isNext = true; // Check existing next step

            if (btn.getText() == null) { // Player set 0 if field is empty
                arr[((index / 10) - 1)][((index % 10) - 1)] = 0;
                btn.setText("O");
                System.out.println("Value arrays elemrnt at index " + ((index / 10) - 1) + " " + ((index / 10) - 1) + "-" + arr[(index / 10) - 1][(index % 10) - 1]);
                System.out.println("ButtonName: " + btn.getName());
//Computers step
                //Set priority. element [1][1] have higthest priority
                if (isNext == true && arr[1][1] == -1) {
                    arr[1][1] = 1;
                    indexC = 3 * 1 + 1;// number element in array is 3*i+j
                    btnTmp = (JButton) grid.getComponent(indexC);
                    btnTmp.setText("X");
                    isNext = false;
                }
                // Define index button component on frame
                List<Integer> arrayRnd = new ArrayList<>();
                if (isNext == true) {
                    if (arr[0][0] == -1) {
                        arrayRnd.add(0);
                    }
                    if (arr[0][2] == -1) {
                        arrayRnd.add(2);
                    }

                    if (arr[2][0] == -1) {
                        arrayRnd.add(6);
                    }
                    if (arr[2][2] == -1) {
                        arrayRnd.add(8);
                    }
                    // HAVE PROBLEM!!!!
                    if (arrayRnd.size() != 0) {
                        indexC = new Random().nextInt(arrayRnd.size());// random index in array of indexes of free cell
                        System.out.println("Random().nextInt(arrayRnd.length): " + arrayRnd.get(indexC) + "\nIndexC: " + indexC);
                        btnTmp = (JButton) grid.getComponent(arrayRnd.get(indexC));// random free button
                        btnTmp.setText("X");
                        arr[((Integer.parseInt(btnTmp.getText())) / 10 - 1)][((Integer.parseInt(btnTmp.getText())) % 10 - 1)] = 1;

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

