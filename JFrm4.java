import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanel extends JPanel
{
    int x,y;
    MyPanel()
    {
        super();
        setBorder(BorderFactory.createLineBorder(Color.RED,5));
        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                x=e.getX();
                y=e.getY();
                draw();
            }
        });
    }
    
    void draw()
    {
        Graphics g=getGraphics();
        g.drawRect(x,y,20,20);
    }
}
class JFrm4 extends JFrame
{
    MyPanel pd;
    JFrm4()
    {
        super("Frame");
        pd=new MyPanel();
        add(pd);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String [] args)
    {
        JFrm4 a=new JFrm4();
    }
}
