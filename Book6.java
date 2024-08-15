import javax.swing.*;
import java.util.*;
//use of comparable interface
public class Book6 implements Comparable<Book6>
{
    int no;
    String nm;
    Book6()
    {
        no=0;
        nm=new String();
    }
    Book6(int a,String b)
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
    public int  compareTo(Book6 a)
    {
        return no-a.no;
    }
    public static void main(String []args)
    {
        Book6[]k=new Book6[5];
        k[0]=new Book6(13,"OOps");
        k[1]=new Book6(6,"Java");
        k[2]=new Book6(3,"Cpp");
        k[3]=new Book6(11,"HTML");
        k[4]=new Book6(2,"C lang");
        System.out.println(Arrays.toString(k));
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));
    }
}