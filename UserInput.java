package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserInput
{
    public static void main(String[] args) {
        Radio r = new Radio();
    }
}


class Radio extends JFrame implements ActionListener
{
    JTextField t1;
    JRadioButton r1,r2;
    JButton b1;
    JLabel l;
    public Radio (){


        t1 = new JTextField(20);
        r1 = new JRadioButton("male");
        r2 = new JRadioButton("Female");
        b1=new JButton("ok");
        l = new JLabel("Welcome",JLabel.CENTER);

        add(t1);
        add(r1);
        add(r2);
        add(b1);
        add(l);
        b1.addActionListener(this);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(8,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String s = t1.getText();
        if(r1.isSelected()){
            s= "Hello MR "+s;
        }
        else{
            s= "Hello MS "+s;
        }
        l.setText(s);
        t1.setText("");

    }


}