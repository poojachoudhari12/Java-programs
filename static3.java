import java.util.*;
import javax.swing.*;


public class static3 {
  static int[]x;
  static 
  {
    x=new int[5];
  }  
  static void input()
  {
    for(int i=0;i<5;i++)
    {
        try{
            x[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Data"));
        }
        catch(Exception e){}
    }
  }
  static void display()
  {
    JOptionPane.showMessageDialog(null,Arrays.toString(x));
  }
}
