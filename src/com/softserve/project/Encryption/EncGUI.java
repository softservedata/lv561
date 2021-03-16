package com.softserve.project.Encryption;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EncGUI extends JFrame {
    private final JButton encr = new JButton("Encryption");
    private final JButton unEncr = new JButton("Unencryption");
    private final JTextArea input = new JTextArea(10,20);
    private final Font font = new Font("Dialog", Font.BOLD, 24);

    public EncGUI () {
        super("Encryption");
        this.setBounds(300,300,400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,1,5,5));
        container.add(input);
        input.setFont(new Font("",Font.PLAIN, 24));
        encr.addActionListener(new Encryption());
        unEncr.addActionListener(new UnEncryption());
        container.add(encr);
        encr.setFont(font);
        container.add(unEncr);
        unEncr.setFont(font);
    }

    public class Encryption implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = input.getText();
            Encrypt enc = new Encrypt(text);
            enc.inEncr(enc);
//            JOptionPane.showMessageDialog(null, enc.getText() , "Encryptioin", JOptionPane.PLAIN_MESSAGE);
            input.setText(enc.getText());
        }
    }

    public class UnEncryption implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = input.getText();
            Encrypt enc1 = new Encrypt(text);
            enc1.unEncr(enc1);
//            JOptionPane.showMessageDialog(null, enc1.getText(), "Unencryptioin", JOptionPane.PLAIN_MESSAGE);
            input.setText(enc1.getText());

        }
    }
}
