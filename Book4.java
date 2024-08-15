import javax.swing.*;
import java.util.*;
//use of comparable interface
public class Book4 implements Comparable<Book4>
{
    int no;
    String nm;
    Book4()
    {
        no=0;
        nm=new String();
    }
    Book4(int a,String b)
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
    public int  compareTo(Book4 a)
    {
        int val=nm.compareTo(a.nm);
        if(val==0)
        return no-a.no;
        return val;
    }
    public static void main(String []args)
    {
        Book4[]k=new Book4[5];
        k[0]=new Book4(13,"Oops");
        k[1]=new Book4(6,"Cpp");
        k[2]=new Book4(3,"Java");
        k[3]=new Book4(11,"Cpp");
        k[4]=new Book4(2,"Networking");
        System.out.println(Arrays.toString(k));
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));
    }
}