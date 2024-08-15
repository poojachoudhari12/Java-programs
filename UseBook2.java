import java.util.*;
import javax.swing.*;
class Book2
{
    int bno;
    String bnm;
    int bprice;
    Book2()
    {
        bno=bprice=0;
        bnm=new String();
    }
    public String toString()
    {
        String s="\n~~~~Book Data~~~\nNo:"+bno+"\nName:"+bnm+"\nPrice"+bprice;
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    void setData(int n)
    {
        bno=n;
        try
        {
            bnm=JOptionPane.showInputDialog(null,"\nName:");
            bprice=Integer.parseInt(JOptionPane.showInputDialog(null,"Price"));
        }
        catch(Exception e){}

    }
}

public class UseBook2 
{
    Book2 bk;
    LinkedList<Book2>ls;
    public UseBook2()
    {
        ls=new LinkedList<Book2>();
        bk=null;
    }
    boolean search(int no)
    {
        int i=0,n=ls.size();
        while(i<n)
        {
            bk=ls.get(i);
            if(bk.bno==no)
                break;
            i++;
        }
        if(i==n)
            bk=null;
            return(i<n);
    }
    void add()
    {
        int no=0;
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"Book No:"));
        }
        catch(Exception e)
        {
            return;
        }
        if(search(no)==true)
        {
            JOptionPane.showMessageDialog(null,"RECORD EXISTS\n");
            return;
        }
        bk=new Book2();
        bk.setData(no);
        ls.add(bk);                       //added in linkedlist
        JOptionPane.showMessageDialog(null,"RECORD ADDED\n");
     }
     
     void mod()
    {
        int no=0;
        try{
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"Book No:"));
        }
        catch(Exception e)
        {
            return;
        }
        if(search(no)==false)
        {
            JOptionPane.showMessageDialog(null,"RECORD NOT EXISTS\n");
            return;
        }
       
        bk.setData(no); 
        JOptionPane.showMessageDialog(null,"RECORD MODIFIED\n");
     }
     void del()
     {
         int no=0;
         try
         {
             no=Integer.parseInt(JOptionPane.showInputDialog(null,"Book No:"));
         }
         catch(Exception e)
         {
             return;
         }
         if(search(no)==false)
         {
             JOptionPane.showMessageDialog(null,"RECORD NOT EXISTS\n");
             return;
         }
         ls.remove(bk);
         JOptionPane.showMessageDialog(null,"RECORD DELETED\n");
    }
    void display()
    {
        int i=0,n=ls.size();
        while(i<n) 
        {
            bk=ls.get(i);
            bk.display();
            i++;
        }

    }
    void menu()
    {
        int opt,no;
        String[]option=new String[]{"Add","Modify","Delete","Search","Display","Exit"};
        while(true)
        {
            opt=JOptionPane.showOptionDialog(null,"Choose option","Book",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,option,0);
            if(opt==5)
            break;
            switch(opt)
            {
                case 0:
                    add();
                    break;
                case 1:
                    mod();
                    break;
                case 2:
                    del();
                    break;
                case 4:
                    display();
                    break;
                case 3:  
                    try
                    {
                        no=Integer.parseInt(JOptionPane.showInputDialog(null,"Book no"));
                    }
                    catch(Exception e){continue;}
                    if(search(no)==false)
                        JOptionPane.showMessageDialog(null,"NO Record");
                    else 
                    bk.display();
                    
                    
            }
        }
    }
    public static void main(String[]args)
    {
        UseBook2 p=new UseBook2();
        p.menu();
    }
}
    






