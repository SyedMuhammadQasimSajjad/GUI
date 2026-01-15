package gui;

import javax.swing.*;
import java .awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combo
{
    public static void main (String[] args) {
        box b1 = new box();
    }
}

class box extends JFrame implements ActionListener
{

    String[] string = {"dog","cat","lion","dear"} ;
    JComboBox c1;
    JLabel l1;
    JPanel p1;

    public box(){
        setLayout(new BorderLayout());
        c1 =new JComboBox(string);
        l1 =new JLabel("your choice?",JLabel.CENTER);
        add(c1,BorderLayout.NORTH);
        c1.addActionListener(this);

        p1 =new JPanel();
        add(p1,BorderLayout.CENTER);
        p1.add(l1);

        setTitle("Combo");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){
        String selected = c1.getSelectedItem().toString();
               l1.setText("Your Choice "+selected);
    }
}