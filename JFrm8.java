import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JFrm8 extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    String s1,s2;
    public JFrm8()
    {
        super("Login");
        s1="Manager";
        s2="Abc#2019";
        l1=new JLabel("Id");
        l2=new JLabel("Password");
        t1=new JTextField(20);
        t2=new JPasswordField(15);
        b1=new JButton("Ok");
        b2=new JButton("exit");
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new GridLayout(3,2,5,5));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        setSize(400,300);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b1)
            System.exit(0);
        else
        {
            String a=t1.getText();
            String c=t2.getText();
            if(a.equals(s1) && c.equals(s2))
                JOptionPane.showMessageDialog(null,"Login Success");
            else
                JOptionPane.showMessageDialog(null,"Login Fail");
        }
    }
    public static void main(String[]args)
    {
        JFrm8 a=new JFrm8();
    }
}