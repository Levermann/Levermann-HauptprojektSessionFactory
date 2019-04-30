package com.levermann.Gui;

import javax.swing.*;
import java.awt.event.*;

public class LevermannGUI {
    private JScrollBar scrollBar1;
    private JTextField levermannStrategieDerEntspannteTextField;
    private JButton createDatabaseButton;
    private JButton showDatabaseButton;
    private JPanel Strategie;
    private JPanel dbfenster;
    private JPanel dberstellfenster;


    public static void main(String[] args) {
        JFrame frame = new JFrame("LevermannGUI");
        frame.setContentPane(new LevermannGUI().Strategie);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400, 200);
    }

    public LevermannGUI() {
        showDatabaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Show now");

            }
        });

        createDatabaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Create now");

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        Strategie = new Form1().getPanel();
        dbfenster = new Form2().getPanel();
        dberstellfenster = new Form3().getPanel();
    }
}


// für die Levermannschritte ein try catch falls statt einem wert ein buchstabe übergeben wird
