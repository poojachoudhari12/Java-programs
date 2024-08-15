import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AWT5 extends Frame implements ActionListener,FocusListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    int no,mrk;
    String nm;
    AWT5()
    {
        super("Login");
        l1=new Label("Roll No:");
        l2=new Label("Name:");
        l3=new Label("marks:");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t1.addFocusListener(this);
        t3.addFocusListener(this);
        b1=new Button("Ok");
        b2=new Button("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new GridLayout(4,2,5,5));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        setSize(400,300);
        setResizable(false);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b2)
        System.exit(0);
        else
        {
            nm=t2.getText();
            String c="Roll no"+no+"\nName:"+nm+"\nMarks:"+mrk;
           // String d=t2.getText();
            JOptionPane.showMessageDialog(null,c);
            t1.requestFocus();
        }
       
    }
    public void focusGained(FocusEvent e)
    {
        b1.setEnabled(false);
    }
    public void focusLost(FocusEvent e)
    {
        TextField t=(TextField)e.getSource();
        if(t==t1)
        {
            try
            {
                no=Integer.parseInt(t1.getText());
            }
            catch(Exception e1)
            {
                t1.requestFocus();
                return;
            }
            if(no==0)
            {
                t1.requestFocus();
                return;
            }
        }
        if(t==t3)
        {
            try
            {
                mrk=Integer.parseInt(t3.getText());
            }
            catch(Exception e2)
            {
                t3.requestFocus();
                return;
            }
            if(mrk<0||mrk>100)
            {
                t3.requestFocus();
                return;
            }
            b1.setEnabled(true);
        }
    }
    public static void main(String[]args)
    {
        AWT5 a=new AWT5();
    }

}