import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrm25 extends JFrame
{
    JMenu menu;
    JMenuItem i1,i2,i3,i4,i5;
    JMenuBar mb;
    JSeparator separator; // declare separator variable

    JFrm25()
    {
        super("Separator in menu");
        mb=new JMenuBar();
        menu=new JMenu("Menu");
        i1=new JMenuItem("Item1");
        i2=new JMenuItem("Item2");
        i3=new JMenuItem("Item3");
        i4=new JMenuItem("Item4");
        i5=new JMenuItem("Item5");
        menu.add(i1);
        menu.add(i2);
        separator = new JSeparator(); // initialize separator
        menu.add(separator);
        menu.add(i3);
        menu.add(i4);
        menu.add(separator);
        menu.add(i5);
        mb.add(menu);
        setJMenuBar(mb);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        JFrm25 a=new JFrm25();
    }
}