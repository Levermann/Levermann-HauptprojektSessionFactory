import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
/*
 * Created by JFormDesigner on Sun Apr 28 13:51:27 CEST 2019
 */



/**
 * @author unknown
 */
public class LevermannGuiMuster extends JPanel {
    public LevermannGuiMuster() {
        initComponents();
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Florian
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- textField1 ----
        textField1.setText("Levermann Projekt");
        add(textField1, "cell 4 0 4 1");

        //---- button1 ----
        button1.setText("Show Database");
        add(button1, "cell 0 1");

        //---- button2 ----
        button2.setText("text");
        button2.addActionListener(e -> button2ActionPerformed(e));
        add(button2, "cell 0 2");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        add(scrollPane1, "cell 7 3");

        //---- bindings ----
        bindingGroup = new BindingGroup();
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            button1, BeanProperty.create("accessibleContext.accessibleSelection.accessibleSelection"),
            button1, BeanProperty.create("action"), "Datenbank"));
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            table1, BeanProperty.create("selectedElements"),
            table1, BeanProperty.create("selectedElements")));
        bindingGroup.bind();
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Florian
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JScrollPane scrollPane1;
    private JTable table1;
    private BindingGroup bindingGroup;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
