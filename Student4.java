import javax.swing.*;
import java.util.*;
//use of comparable interface
public class Student4 implements Comparable<Student4>
{
    int no;
    String nm;
    Student4()
    {
        no=0;
        nm=new String();
    }
    Student4(int a,String b)
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
    public int  compareTo(Student4 a)
    {
        return nm.compareTo(a.nm);
    }
    public static void main(String []args)
    {
        Student4[]k=new Student4[5];
        k[0]=new Student4(13,"Kunal");
        k[1]=new Student4(6,"Shruti");
        k[2]=new Student4(3,"Kunal");
        k[3]=new Student4(11,"Atharv");
        k[4]=new Student4(2,"Sid");
        System.out.println(Arrays.toString(k));
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));
    }
}