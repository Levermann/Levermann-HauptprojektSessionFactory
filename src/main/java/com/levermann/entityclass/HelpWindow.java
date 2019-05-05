package com.levermann.entityclass;

import javax.swing.*;
import java.awt.*;

public class HelpWindow extends JDialog {
    JLabel label;

    public HelpWindow(JFrame frame){
        super(frame, "Help Window", true);
        setLayout(new FlowLayout());

        label = new JLabel("I am tired, this is a help digga" );
            add(label);

    }


}
