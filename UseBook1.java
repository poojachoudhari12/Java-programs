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
        String s="\nBook Data\nNo:"+bno+"\nName:"+bnm+"\nPrice:"+bprice;
        return s;
    }
        void display()
        {
            JOptionPane.showMessageDialog(null, toString());
        }
        void setData(int n)
        {
            bno=n;
            try{
                bnm=JOptionPane.showInputDialog(null,"Name:");
                bprice=Integer.parseInt(JOptionPane.showInputDialog(null,"Price"));
            }
            catch(Exception e) {}

        }
    }   
public class UseBook1
  {
    Book2 bk;
    LinkedList<Book2>ls;
    public UseBook1()
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
                    return (i<n);
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
              JOptionPane.showMessageDialog(null, "Record exists");
                return;
            }
                    bk=new Book2();
                    bk.setData(no);
                    ls.add(bk);
                    JOptionPane.showMessageDialog(null, "Record Added\n");
                }
                void mod()
                {
                    int no=0;
                    try{
                        no=Integer.parseInt(JOptionPane.showInputDialog(null,"Book No:"));
                    }
                    catch(Exception e){
                        return;
                    }
                    if(search(no)==false)
                    {
                        JOptionPane.showMessageDialog(null, "Record not exists");
                        return;
                    }
                    
                    bk.setData(no);
                    JOptionPane.showMessageDialog(null, "Record modified");
                }
                void del()
                {
                    int no=0;
                    try{
                        no=Integer.parseInt(JOptionPane.showInputDialog(null,"Book No:"));
                    }
                    catch(Exception e){
                        return;
                    }
                    if(search(no)==false)
                    {
                        JOptionPane.showMessageDialog(null, "Record not exists");
                        return;
                    }
                    
                    ls.remove(bk);
                    JOptionPane.showMessageDialog(null, "Record delete");
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
                    String[]option=new String[]{"Add","mod","del","search","display","Exit"};
                    while(true)
                    {
                        opt=JOptionPane.showOptionDialog(null, "Choose option","Book",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,option,0);
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
                                try{
                                    no=Integer.parseInt(JOptionPane.showInputDialog(null,"BOoks No:"));
                                }    
                                catch(Exception e){
                                    continue;
                                }
                                if(search(no)==false)
                                {
                                    JOptionPane.showMessageDialog(null, "No Record");
                                }
                                else
                                    bk.display();
                        }
                    }
                }
                public static void main(String[] args) {
                    UseBook1 p=new UseBook1();
                    p.menu();

                }
            }
    

