import javax.swing.*;
import java.util.*;
//use of comparable interface
public class Student5 implements Comparable<Student5>
{
    int no;
    String nm;
    Student5()
    {
        no=0;
        nm=new String();
    }
    Student5(int a,String b)
    {
        no=a;   
        nm=b;
    }
    public String toString()
    {
        return "\nNo:"+no+"\tName:"+nm;
    }
    void display()
    {
        System.out.println(toString());
    }
    public int  compareTo(Student5 a)
    {
        int val=nm.compareTo(a.nm);
        if(val==0)
        return no-a.no;
        return val;
    }
    public static void main(String []args)
    {
        Student5[]k=new Student5[5];
        k[0]=new Student5(13,"Kunal");
        k[1]=new Student5(6,"Shruti");
        k[2]=new Student5(3,"Kunal");
        k[3]=new Student5(11,"Atharv");
        k[4]=new Student5(2,"Sid");
        System.out.println(Arrays.toString(k));
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));
    }
}