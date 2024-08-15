import javax.swing.*;
public class static2 {
    static int no;
    static void input()
    {
        try{
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"data"));
        }
        catch(Exception e){}
    }
    static void display()
    {
        JOptionPane.showInputDialog(null, "No:",+no );
    }
    public static void main(String[] args) {
        input();
        display();
    }
}


