import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class JFrm19 extends JFrame implements ActionListener
{
    JButton b1;
    JTextArea t1;
    JFrm19()
    {
        super("Color Chosser");
        b1=new JButton("Color");
        b1.addActionListener(this);
        b1.setBounds(200,250,100,30);
        t1=new JTextArea();
        t1.setBounds(10,10,300,200);
        setLayout(null);
        add(b1);
        add(t1);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Color c=JColorChooser.showDialog(this,"Choose Color", Color.white);
        t1.setBackground(c);
    }
    public static void main(String[] args)
    {
        JFrm19 a=new JFrm19();
    }
}