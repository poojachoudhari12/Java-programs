import javax.swing.*;
import java.util.*;
class Array7
{
    int []arr;
    Array7()
    {
        arr=new int[5];
    }
    void set(int pos,int d)
    {
        arr[pos]=d;
    }
    int get(int pos)
    {
        return arr[pos];
    }
    public String toString()
    {
        return "Data\n"+Arrays.toString(arr);
    }
}
class Stack7 extends Array7{
    int top;
    Stack7()
    {
        super();
        top=-1;
    }
    void push(int d)
    {
        if(top==arr.length-1)
        {
            JOptionPane.showMessageDialog(null,"Overflow");
            return;
        }
        set(++top,d);
    }
    void pop()
    {
        if(top==-1)
        {
            JOptionPane.showMessageDialog(null,"Underflow");
            return;
        }
        top--;
    }
    public String toString()
    {
        String s="Stack";
        if(top==-1)
        s=s+"Empty";
        else
        {
            for(int i=top;i>=0;i--)
            s=s+" "+get(i);
        }
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    void menu()
    {
        String []opt=new String[]
        {
            "push","pop","display","exit"
        };
        int option=0,d=0;
        while(true)
        {
            option=JOptionPane.showOptionDialog(null,"Choose one","Stack",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opt,0);
            if(option==3)
            break;
            switch(option)
            {
                case 0:
                    try
                    {
                        d=Integer.parseInt(JOptionPane.showInputDialog(null,"Data"));
                    }
                    catch(Exception e){}
                    push(d);
                    break;
                case 1:
                        pop();
                        break;
                 case 2:
                        display();
                        break;
            }
        }
    }
}

class Queue7 extends Array7{
    int fr,rr;
    Queue7()
    {
        super();
        rr=-1;fr=0;
    }
    void insert(int d)
    {
        if(rr==arr.length-1)
        {
            JOptionPane.showMessageDialog(null,"Overflow");
            return;
        }
        set(++rr,d);
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    void remove()
    {
        if(rr<fr)
        {
            JOptionPane.showMessageDialog(null,"underflow");
            return;
        }
        fr++;
    }
    public String toString()
    {
        String s="Queue";
        if(rr<fr)
        s=s+"Empty";
        else
        {
            for(int i=fr;i<=rr;i++)
            s=s+" "+get(i);
        }
        return s;
    }
    void menu()
    {
        String []opt=new String[]
        {
            "insert","remove","display","exit"
        };
        int option=0,d=0;
        while(true)
        {
            option=JOptionPane.showOptionDialog(null,"Choose one","Queue",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opt,0);
            if(option==3)
            break;
            switch(option)
            {
                case 0:
                    try
                    {
                        d=Integer.parseInt(JOptionPane.showInputDialog(null,"Data"));
                    }
                    catch(Exception e){}
                    insert(d);
                    break;
                case 1:
                        remove();
                        break;
                 case 2:
                        display();
                        break;
            }
        }
    }
}

public class HInh
{
     public static void main(String[] args)
    {
       /*Stack7 a=new Stack7();
        a.menu();*/
        String[] option =new String[]{"stack","queue","exit"};
        int opt=JOptionPane.showOptionDialog(null, "choose one","data structure",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,option ,0);
        if(opt==2)
        return ;

        if(opt==0)
        {
            (new Stack7()).menu();
        }
        else
        {
            
            (new Queue7()).menu();
        }
    }
}

