import java.awt.*;
import java.awt.event.*;

public class AWT26 extends Frame implements AdjustmentListener ,FocusListener,ActionListener
{
    Scrollbar sr,sg,sb;
    int r,g,b;
    TextField tr,tg,tb;
    Label lr,lg,lb,lclr;
    Button bx;
    Panel pan;
    AWT26()
    {
        super("ScrollBar");
        sr=new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
        sg=new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
        sb=new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);

        sr.addAdjustmentListener(this);
        sg.addAdjustmentListener(this);
        sb.addAdjustmentListener(this);

        lclr=new Label("Color");
        lr=new Label("R");
        lg=new Label("G");
        lb=new Label("B");

        tr=new TextField(10);
        tg=new TextField(10);
        tb=new TextField(10);

        tr.addFocusListener(this);
        tg.addFocusListener(this);
        tb.addFocusListener(null);

        bx=new Button("Exit");
        bx.addActionListener(this);
        setLayout(null);

        lr.setBounds(50,50,30,20);
        sr.setBounds(50,90,30,100);
        tr.setBounds(50,210,30,20);

        lg.setBounds(90,50,30,20);
        sg.setBounds(90,90,30,100);
        tg.setBounds(90,210,30,20);

        lb.setBounds(130,50,30,20);
        sb.setBounds(130,90,30,100);
        tb.setBounds(130,210,30,20);

        lclr.setBounds(170,50,100,20);
        pan=new Panel();
        pan.setBounds(170,90,100,100);
        bx.setBounds(170,210,50,20);

        add(lr);
        add(sr);
        add(tr);

        add(lg);
        add(sg);
        add(tg);

        add(lb);
        add(sb);
        add(tb);

        add(lclr);
        add(pan);
        add(bx);
        setSize(400,400);
        setVisible(true);
    }
    public void focusGained(FocusEvent e){}
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        r=sr.getValue();
        g=sg.getValue();
        b=sb.getValue();

        tr.setText(""+r);
        tg.setText(""+g);
        tb.setText(""+b);

        pan.setBackground(new Color(r,g,b));
    }
    public void focusLost(FocusEvent e)
    {
        TextField t=(TextField)e.getSource();
        int val=0;
        try
        {
            val=Integer.parseInt(t.getText());
        }
        catch(Exception e1){}

        if(val < 0  || val > 255)
        {
            t.requestFocus();
            return;
        }
        if(t==tr)
            r=val;
        if(t==tg)
            g=val;
        if(t==tb)
            b=val;
        sr.setValue(r);
        sg.setValue(g);
        sb.setValue(b);
        pan.setBackground(new Color(r,g,b));
        
    }

    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
    public static void main(String [] args)
    {
        AWT26 a=new AWT26();
    }
}
