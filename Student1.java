import javax.swing.*;
import java.util.*;
public class Student1 {

    int no;
    String nm;
    double mrk;
    Student1()
    {
        no=0;
        nm=new String();
        mrk=0.0;
    }
    Student1(int a,String b,double c)
    {
        no=a;
        nm=b;
        mrk=c;
    }
    int getNo()
    {
        return no;
    }
    double getMarks()
    {
        return mrk;
    }
    String getName()
    {
        return nm;
    }
  /*   public String toString()
    {
        String s="\nRoll no:"+no+"\nName:"+nm+"\nMarks:"+mrk;
        return s;
    }*/
   void  setData(int no)
   {
    this.no=no;
    try
    {
        nm=JOptionPane.showInputDialog(null,"Name");
        mrk=Double.parseDouble(JOptionPane.showInputDialog(null,"Marks"));

    }
    catch(Exception e){}
   }

   void SetData()
   {
    try{
        no=Integer.parseInt(JOptionPane.showInputDialog(null,"Roll no:"));
        nm=JOptionPane.showInputDialog(null,"Name:");
        mrk=Double.parseDouble(JOptionPane.showInputDialog(null,"Marks:"));
    }
    catch(Exception e){}

   }

   void display()
   {
    JOptionPane.showMessageDialog(null, toString());
   }

public static void main(String[] args) {
   /*  Student1 a=new Student1();
    a.setData(101);
    a.display();*/
   Student1 b=null;//b is a referance variable referce to type one
   b=new Student1(6,"Ravi",9.2);
   b.display();
    b.setData(6);
    b.display();
    Student1[]c=new Student1[5];//array of class 
    int i=0;
    while(i<c.length)
    {
        c[i]=new Student1();
        c[i].setData(i+1);
        i++;
    }
    for(i=0;i<5;i++)
    {
        c[i].display();
    }
    System.out.println(Arrays.toString(c));

}




}
