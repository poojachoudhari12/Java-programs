import javax.swing.*;
import java.util.*;
abstract class Array8//The class Array8 is named abstract because it contains at least one abstract method, which is declared but not implemented in the class itself
{//In this specific code, Array8 is declared as abstract because it contains the abstract method menu(). This method is declared in the Array8 class but doesn't have an implementation
    int []arr;
    Array8()
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
    abstract void menu();
}
class Stack8 extends Array8{
    int top;
    Stack8()
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

class Queue8 extends Array8{
    int fr,rr;
    Queue8()
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

public class HInh8
{
     public static void main(String[] args)
    {
       /*Stack7 a=new Stack7();
        a.menu();*/
        String[] option =new String[]{"stack","queue","exit"};
        int opt=JOptionPane.showOptionDialog(null, "choose one","data structure",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,option ,0);
        if(opt==2)
        return ;

        Array8 ref=null;
        if(opt==0)
        {
            ref=new Stack8();
        }
        else
        {
             ref=new Queue8();
        }
        ref.menu();
    }
}

