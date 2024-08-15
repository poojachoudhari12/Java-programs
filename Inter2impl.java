
import javax.swing.*;
import java.util.*;

interface Inter2
 {
    void setData();
    void display();
}

 interface IComp
 {
    int total();
    int avg();
 } 

 
  interface IArray2 extends Inter2,IComp
 {
    int size=5;
 }

 class ArrayImpl implements IArray2
 {
    int[]arr;
    ArrayImpl()
    {
        arr=new int[size];
    }

    public int total()
    {
        int tot=arr[0],i=1;
        while(i<size)
        {
        tot+=arr[i++];
        }
        return tot;
    }

    public int avg()
    {
        return total()/size;
    }

    public String toString()
    {
        String s="Data\n"+Arrays.toString(arr)+"\nTotal:"+total()+"\nAvg:"+avg();
        return s;
        
    }

    public void setData()
    {
        int i=0;
        while(i<size)
        {
            try
            {
                arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Data:"));

            }
            catch(Exception e){continue; }
            i++;
        }
    }

    public void display()
    {
        JOptionPane.showMessageDialog(null, toString());
    }

 }

 public class Inter2Impl
 {
    public static void main(String[]args)
    {
        ArrayImpl a=new ArrayImpl();
        a.setData();
        a.display();

        ArrayImpl b=new ArrayImpl();
        Inter2 c=b;
        c.setData();
        c.display();
        IComp d=b;
        System.out.println("TotAL:"+d.total());
        System.out.println("Avg:"+d.avg());
    }
 }


 