package gui;

import javax.swing.*;
import java.awt.*;

public class textfield extends JFrame {

    JTextField t1;
    JTextField t2;
    JLabel l1,l2;
    public textfield() {
        setLayout(new FlowLayout());
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        l1 = new JLabel("Enter name");
        l2 = new JLabel("Enter age");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        textfield t1 = new textfield();
    }

}
