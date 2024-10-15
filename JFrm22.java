import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 
import java.awt.Color;
import javax.swing.event.*;

public class JFrm22  extends JFrame implements ChangeListener
{
    JLabel l1;
    SpinnerModel value;
    JSpinner spinner1;
    JFrm22()
    {
        super("Spinner");
        l1=new JLabel();
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setSize(250,100);
        value=new SpinnerNumberModel(5,0,10,1);
        spinner1=new JSpinner(value);
        spinner1.setBounds(100,100,50,50);
        setLayout(null);
        add(spinner1);
        add(l1);
        setSize(300,300);
        spinner1.addChangeListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
        public void stateChanged(ChangeEvent e)
        {
            l1.setText("Value:"+((JSpinner)e.getSource()).getValue());
        }
        public static void main(String[]args)
        {
            JFrm22 a=new JFrm22();
        }
}
