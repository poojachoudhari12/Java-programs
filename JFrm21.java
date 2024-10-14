import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;

public class JFrm21 extends JFrame implements ChangeListener
{
    JSlider s1;
    JPanel p1;
    JLabel l1;
    JFrm21()
    {
        super("Slider");
        s1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 5);
        p1 = new JPanel();
        l1 = new JLabel("Value: 5"); // Initialize l1
        p1.add(s1);
        p1.add(l1);
        s1.addChangeListener(this);

        add(p1);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void stateChanged(ChangeEvent e) // Correct method signature
    {
        l1.setText("Value:"+s1.getValue());
    }
    public void actionPerformed(ActionEvent e)
    {
        
    }
    
    public static void main(String[] args)
    {
        new JFrm21();
    }
}