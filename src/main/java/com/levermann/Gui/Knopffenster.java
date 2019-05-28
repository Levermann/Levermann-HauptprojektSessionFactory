package com.levermann.Gui;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Knopffenster extends JFrame implements ActionListener {
    private JButton buttonHallo;
    private JButton buttonServus;

    public Knopffenster() {
        super("KnopfFenster");

        // Standard-Layout setzen (einfach so lassen...)
        getContentPane().setLayout(new FlowLayout());

        // Standardaktion beim Klicken auf den Fenster-Button "Schließen"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Button erzeugen. Im Konstruktor steht der Name, der im Knopf erscheinen soll
        buttonHallo = new JButton("Hallo");

        // Button wird dem Fenster hinzugefügt
        add(buttonHallo);

        // Jetzt wird dem Knopf gesagt, dass bei einem Knopfdruck die actionPerformed Methode
        // aufgerufen werden soll. Sieht etwas verwegen aus, einfach so übernehmen.
        buttonHallo.addActionListener(this);

        // Das ganze nochmal für einen zweiten Knopf
        buttonServus = new JButton("Servus");

        buttonServus.setPreferredSize(new Dimension(80, 40)); //Standardgröße für den Button setzen

        add(buttonServus);
        buttonServus.addActionListener(this);

        // Muss am Ende stehen, damit die eingetragenen Sachen sichtbar werden
        pack();

        //Fenster auf dem Bildschirm zentrieren
        setLocationRelativeTo(null);

        // Fenster soll sichtbar sein (immer als letzte Anweisung!)
        setVisible(true);
    }

    // Wenn irgendeiner der Knöpfe gedrückt wird, dann wird diese Methode
    // automatisch aufgerufen. Eine Art von auslösender Aktion
    public void actionPerformed(ActionEvent event) {
        System.out.print("Irgendein Knopf wurde gedrückt...");
        // Wir müssen nun herausfinden, welcher Knopf gedrückt wurde...

        // Handelt es sich bei der Quelle der Aktion um das Objekt buttonHallo? Dann gib "Hallo" aus.
        if(event.getSource() == buttonHallo) {
            System.out.println("Hallo");
        }

        else if(event.getSource() == buttonServus) {
            System.out.println("Servus");
        }

    }

    public static void main(String args[]) {
        new Knopffenster();
    }
}




