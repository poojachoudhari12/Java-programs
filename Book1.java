import javax.swing.*;

public class Book1 {
    int no;
    String nm;
    double price;
    
    Book1()
    {
        no=0;
        nm=new String();
        price=0.0;
    }
    Book1(int a,String b,double c)
    {
        no=a;
        nm=b;
        price=c;
    }
    int getNo()
    {
        return no;
    }
    String getName()
    {
        return nm;
    }
    double getPrice()
    {
        return price;
    }
    public String toString()
    {
        String s="\nBook no:"+no+"\nBook Name:"+nm+"\nBook price:"+price;
        return s;
    }
    void setData(int no)
    {
        this.no=no;
        try{
            nm=JOptionPane.showInputDialog(null,"\nName:");
            price=Double.parseDouble(JOptionPane.showInputDialog(null,"\nPrice:"));
        }
        catch(Exception e) {}
    }

    void setData()
    {
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"\nNO:"));
            nm=JOptionPane.showInputDialog(null,"\nName:");
            price=Double.parseDouble(JOptionPane.showInputDialog(null,"\nPrice"));
        }
        catch(Exception e){}
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    public static void main(String[] args) {
        /*  Student1 a=new Student1();
         a.setData(101);
         a.display();*/
        Book1 b=null;//b is a referance variable referce to type one
        b=new  Book1(623,"Balbharti",20.0);
        b.display();
         b.setData(234);
         b.display();
         Book1[]c=new Book1[5];//array of class 
         int i=0;
         while(i<c.length)
         {
             c[i]=new Book1();
             c[i].setData(i+1);
             i++;
         }
         for(i=0;i<5;i++)
         {
             c[i].display();
         }
     }

    
}
