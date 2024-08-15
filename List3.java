
import javax.swing.*;
import java.util.*;

public class List3 {
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
    int i=0,n=ls.size();
    String str=("data:\n");
    while(i<n)
    {
        str=str+" "+ls.get(i);
        i++;
    }
    JOptionPane.showMessageDialog(null, str);
    Iterator it=ls.iterator();
    str="Data\n";
    while(it.hasNext())
    {
        str=str+" "+it.next();

    }
    JOptionPane.showMessageDialog(null,  str);
}    
}
