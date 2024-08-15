/*
Syntax:
    1.    interface<interface_name>
          {
            <field_declaration>
            <method_declaration>
          }
    2.
        interface<sub_interface>extends<list_of_superinterface>
        {
            <field_declaration>
            <method_declaration>           
        }

Syntax for implementation of interfaces
    1.  
        class<class_name>implements<list_of_interface>
        {
            ..;
        }
    2.
        class<sub_class>extends<super_class>implements<list_of_interface>
        {
            ...;
        }
*/
import javax.swing.*;

interface Inter1
{
    void setData();
    void display();
}  

public class Inter1Impl implements Inter1
{
    int no;
    String nm;
    Inter1Impl()
    {
        no=0;
        nm=new String();
    }

   public void setData()
   {
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"No"));
            nm=(JOptionPane.showInputDialog(null,"Name:"));

        }
        catch(Exception e){}
   } 

   public String toString()
   {
        return "No:"+no+"\nName"+nm;
   }

   public void display()
   {
        JOptionPane.showMessageDialog(null,toString());
   }
   
   public static void main(String[] args) 
   {
        Inter1Impl a=new Inter1Impl();
        a.setData();
        a.display();
    }
}
