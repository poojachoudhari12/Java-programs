import javax.swing.*;
import java.util.*;
//use of comparable interface
public class Book5 implements Comparable<Book5>
{
    int no;
    String nm;
    Book5()
    {
        no=0;
        nm=new String();
    }
    Book5(int a,String b)
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
    public int  compareTo(Book5 a)
    {
        return nm.compareTo(a.nm);
    }
    public static void main(String []args)
    {
        Book5[]k=new Book5[5];
        k[0]=new Book5(13,"Oops");
        k[1]=new Book5(6,"Cpp");
        k[2]=new Book5(3,"C lang");
        k[3]=new Book5(11,"Java");
        k[4]=new Book5(2,"HTML");
        System.out.println(Arrays.toString(k));
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));
    }
}