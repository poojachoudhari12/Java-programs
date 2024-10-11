import java.awt.*;

public class AWTExample1 extends frame
{
    public AWTExample1()
    {
        Button b=new Button("Click on me ");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("This is my first basic example");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        AWTExample1 e=new AWTExample1();
    }
}