package gui;

import javax.swing.*;
import java.awt.*;

public class list {
    public static void main(String[] args) {
        list1 l1=new list1();

    }
}

class list1 extends JFrame {
    JLabel l1;
    JList list;
    String[] str= {"football","Cricket","Badminton","volleyball","hockey","squash","snooker","Tekken","PUBG","FIFA"};
    JPanel p1;

    public list1() {
        setLayout(new BorderLayout());
        l1 = new JLabel("Your List is ");
        list = new JList(str);
        add(l1,BorderLayout.NORTH);
        p1 = new JPanel();
        p1.add(new  JScrollPane(list),BorderLayout.CENTER);



        add(p1,BorderLayout.CENTER);


        setTitle("List");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
