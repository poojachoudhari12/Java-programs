import java.util.*;
import javax.swing.*;

interface Int1
{
    void setData();
    void display();
}

interface Int2
{
    int total();
    int avg();
}

interface Int3
{
    int findmax();
    int findmin();
}

interface Int4 extends Int2,Int3
{
    int size=5;
}
public class ArrayImpl14 implements Int1,Int4
{
    int[]arr;
    ArrayImpl14()
    {
        arr=new int[size];
    }
    public int total()
    {
        int i=1,tot=arr[0];
        while(i<size)
        {
            tot+=arr[i];
            i++;
        }
        return tot;
    }
    public int avg()
    {
        return total()/size;
    }
    public int findMax()
    {
        int max=arr[0],i=1;
        while(i<size)
        {
            if(arr[i]>max)
                max=arr[i];
            i++;
        }
        return max;
    }
    public int findMin()
    {
        int min=arr[0],i=1;
        while(i<size)
        {
            if(arr[i]<min)
                min=arr[i];
            i++;
        }
        return min;
    }
    public void setData()
    {
        int i=0;
        while(i<size)
        {
            try
            {
                arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"data:"));
            }
            catch(Exception e){continue;}
            i++;
        }
    }
    public String toString()
    {
        String s="Data\n"+Arrays.toString(arr)+"\nTotal:"+total()+"\nAvg:"+avg()+"\nMin value:"+findMin()+"\nMax Value:"+findMax();
        return s;
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    public static void main(String[]args)
    {
        ArrayImpl14 a=new ArrayImpl14();
        a.setData();
        a.display();
    }
    
}