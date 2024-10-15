import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 
import java.awt.Color;
import javax.swing.event.*;

public class JFrm23 extends JFrame {
    JProgressBar p1;
    int i=0;
    JFrm23()
    {
        super("ProgressBar");
        p1=new JProgressBar(0,10000);
        p1.setBounds(40,40,160,30);
        p1.setValue(0);
        p1.setStringPainted(true);
        add(p1);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void iterate()
    {
        while(i<=10000)
        {
            p1.setValue(i);
            i+=20;
            try{
                Thread.sleep(100);
            }
            catch(Exception e){}
        }
    }
    public static void main(String[]args)
    {
        JFrm23 a=new JFrm23();
        a.setVisible(true);
        a.iterate();
    }

}
