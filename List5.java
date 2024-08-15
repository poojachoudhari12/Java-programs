

import javax.swing.*;
import java.util.*;

public class List5 {
public static void main(String[] args) {
    LinkedList<Integer>ls=new LinkedList<Integer>();
    int val=0;
    while(true)
    {
        try{
            val=Integer.parseInt(JOptionPane.showInputDialog(null,"Value"));
        }
        catch(Exception e)
        {
            continue;
        }
        if(val==0)
        break;
        ls.add(val);
    }
    JOptionPane.showInputDialog(null,"Data:\n"+ls);
    ls.removeFirst();
    JOptionPane.showInputDialog(null,"Data:\n"+ls);
    ls.removeLast();
    JOptionPane.showInputDialog(null,"Data:\n"+ls);
    ls.remove(2);//removes second element from list
    JOptionPane.showInputDialog(null,"Data:\n"+ls);
    
}    
}
