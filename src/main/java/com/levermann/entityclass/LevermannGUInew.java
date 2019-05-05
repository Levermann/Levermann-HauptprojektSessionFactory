package com.levermann.entityclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LevermannGUInew extends JFrame {


    JMenuBar menubar;
    JMenu help;
    JMenuItem about;

    private JTextField input1;
    private JLabel result1;
    private JLabel result2;

    private JPanel dbfenster;
    private JPanel dberstellfenster;


    public LevermannGUInew() {

        setLayout(new FlowLayout());

        menubar = new JMenuBar();
        add(menubar);

        help = new JMenu("help");
        menubar.add(help);

        about = new JMenuItem("About");
        help.add(about);

        setJMenuBar(menubar);

        event e = new event();
        about.addActionListener(e);

/*

    createDatabaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result1.setText(input1.getText());
            }
        });
        showDatabaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result2.add(dbfenster);

            }
        });*/

    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            HelpWindow gui = new HelpWindow(LevermannGUInew.this);
            gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            gui.setSize(200, 100);
            gui.setLocation(600, 600);
            gui.setTitle("Second Window");
            gui.setVisible(true);

        }

    }


    public static void main(String[] args) {
        LevermannGUInew gui = new LevermannGUInew();

        gui.setTitle("Main Window");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(500,500);
        gui.setLocation(600, 50);


    }

}


// für die Levermannschritte ein try catch falls statt einem wert ein buchstabe übergeben wird
