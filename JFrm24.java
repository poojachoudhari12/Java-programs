import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 
import java.awt.Color;
import javax.swing.event.*;

public class JFrm24 extends JFrame
{
    JLabel l1,l2;
    JSeparator s1;
    JFrm24()
    {
        super("Separator");
        l1=new JLabel("Above Separator");
        l2=new JLabel("Below Separator");
        s1=new JSeparator();
        setLayout(new GridLayout(0,1));
        add(l1);
        add(s1);
        add(l2);
        setSize(400,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        JFrm24 a=new JFrm24();
    }
}