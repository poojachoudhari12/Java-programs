//implementation of single inheritance
import javax.swing.*;
import java.util.*;

class Number2
{
    int rno;
    Number2()
    {
        rno=0;

    }
    
    Number2(int a)
    {
        rno=a;
    }
    void setData(int a)
    {
        rno=a;
    }
    void setData()
    {
        try
        {
            rno=Integer.parseInt(JOptionPane.showInputDialog(null,"Roll no:"));
        }
        catch(Exception e){}
    }
    public String toString()
    {
        String s="Roll no:"+rno;
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
}


class Marks2 extends Number2 {
    int[] mrk;

    Marks2() {
        super();
        mrk = new int[5]; // Initialize the array
    }

    Marks2(int a, int[] marks) {
        super(a);
        if (marks.length == 5) {
            mrk = marks; // Assign the array
        } else {
            System.out.println("Error: The marks array should have exactly 5 elements.");
        }
    }

    void setData(int a, int[] marks) {
        setData(a); // Calls the setData method of Number1 to set rno
        if (marks.length == 5) {
            mrk = marks; // Assign the array
        } else {
            System.out.println("Error: The marks array should have exactly 5 elements.");
        }
    }

    void setData() {
        super.setData(); // Calls the setData method of Number1 to set rno
        mrk = new int[5]; // Initialize the array
        try {
            for (int i = 0; i < 5; i++) {
                mrk[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter mark " + (i + 1) + ":"));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input for marks.");
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder(super.toString() + "\nMarks:");
        for (int i = 0; i < 5; i++) {
            s.append(" ").append(mrk[i]);
        }
        return s.toString();
    }

    void display() {
        JOptionPane.showMessageDialog(null, toString());
    }
}
public class SInh2
{
    public static void main(String[]args)
    {
        Number2 a=new Number2();
        a.setData();
        a.display();
        Marks2 b=new Marks2();
        b.setData();
        b.display();
        Number2 c=new Marks2();
        c.setData();
        c.display();
    }
}