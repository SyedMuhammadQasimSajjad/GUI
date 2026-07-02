package gui;

import javax.swing.*;
import java.awt.*;

public class CheckBox extends JFrame {

    public CheckBox() {
        setLayout(new FlowLayout());

        JTextField t1 = new JTextField("Watch the font Style Change",20);
        JCheckBox c1 = new JCheckBox("plan");
        JCheckBox c2 = new JCheckBox("Bold");
        JCheckBox c3 = new JCheckBox("Italic");
        JCheckBox c4 = new JCheckBox("Bold/Italic");
        add(t1,BorderLayout.NORTH);
        JPanel p1 = new JPanel();
        add(p1,BorderLayout.CENTER);

        p1.add(c1);
        p1.add(c2);
        p1.add(c3);
        p1.add(c4);





        setVisible(true);
       setSize(400,200);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {

        CheckBox ch = new CheckBox();
    }
}
