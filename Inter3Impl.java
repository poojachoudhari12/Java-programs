import javax.swing.*;
import java.util.*;

/**
 * Inter3Impl
 */
 interface Inter3 
 {
    void setData();
    void setData(int n);    
    void display();
}
interface ICal
{
    int getPrice();
    int getNo();
}

class Book3 implements ICal
{
    int No;
    String nm;
    int Price;

    public String toString()
    {
        String s="\n~~~~~~~~Books~~~~~~~~~~~\n"+"\nNo:"+No+"\nName:"+nm+"\nPrice"+Price;
        return s;
    }
    public int getNo()
    {
        return No;

    }
    public int getPrice()
    {
        return Price;
    }
    public void setData(int n)
    {
        this.No=n;
        try{
            nm=JOptionPane.showInputDialog(null,"\nName:");
            Price=Integer.parseInt(JOptionPane.showInputDialog(null,"\nPrice:"));
        }
        catch(Exception e){}
    }
    public void setData()
    {
        try{
            No=Integer.parseInt(JOptionPane.showInputDialog(null,"\nNumber:"));
            nm=JOptionPane.showInputDialog(null,"\nName:");
            Price=Integer.parseInt(JOptionPane.showInputDialog(null,"\nPrice:"));
        }
        catch(Exception e){}
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null, toString());
    }

}

public class Inter3Impl
{
    public static void main(String[]args)
    {
        Book3 a=new Book3();
        a.setData();
        a.display();
        a.setData(3);
        a.display();
        Book3 b=new Book3();
        b.setData();
        b.display();
        
    }
}