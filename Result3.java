import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;
import java.util.*;


 class Result3 {
    int rno;
    Vector<Integer>mrk;
    Result3()
    {
        rno=0;
        mrk=new Vector<Integer>();
    }
    int total()
    {
        int tot=0,i=0,n=mrk.size();
        while(i<n)
        {
            tot+=tot+(mrk.get(i)).intValue();
            i++;
        }
        return tot;
    }
    int Average()
    {   
        return total()/mrk.size();


    }
    public String toString()
    {
        return "roll no:"+rno+"\nMarks\n"+mrk+"\nTotal:"+total()+"\nAvg:"+Average();
    }
    void display()
        {
            JOptionPane.showMessageDialog(null,toString());
        }
     void setData(int n)
     {
        rno=n;
        int val=0;
        while(true)
        {
            try{
                val=Integer.parseInt(JOptionPane.showInputDialog(null,"Marks:"));
            }
            catch(Exception e){continue;}
            if(val==0)
            break;
            mrk.add(val);
        }
     }   
     public static void main(String[] args) {
        Result3 a=new Result3();
        a.setData(101);
        a.display();
     }
    
}
