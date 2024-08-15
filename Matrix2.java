import java.util.*;
import javax.swing.*;

public class Matrix2
{
    public static void main(String[]args)
    {
        int [][]x=null;
        x=new int[3][];
        for(int i=0;i<3;i++)
            x[i]=new int[3];
       
        int i=0,j=0;
        
        System.out.println("Matrix Data");
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                try
                {
                    x[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"X["+i+"]["+j+"]"));
                }
                catch(Exception e)
                {
                    continue;
                }
                j++;
            }
            i++;
        }
        String str="Matrix\n"+Arrays.toString(x[0])+"\n"+Arrays.toString(x[1])+"\n"+Arrays.toString(x[2]);
        JOptionPane.showInputDialog(null,str);
    }    
}
