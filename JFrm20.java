import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class JFrm20 extends JFrame implements ActionListener
{
    JSlider s1;
    JPanel p1;

    JFrm20()
    {
        super("Slider");
        s1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 5);
        p1 = new JPanel();
        p1.add(s1);
        add(p1);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        // Implement the actionPerformed method as required by ActionListener
    }
    
    public static void main(String[] args)
    {
        new JFrm20();
    }
}