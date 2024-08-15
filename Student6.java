import javax.swing.*;
import java.util.*;
//use of comparable interface
public class Student6 implements Comparable<Student6>,Comparator<Student6>
{
    int no;
    String nm;
    double mrk;
    Student6()
    {
        no=0;
        nm=new String();
        mrk=0.0;
    }
    Student6(int a,String b,double c)
    {
        no=a;   
        nm=b;
        mrk=c;
    }
    public String toString()
    {
        String s="\nRoll No:"+no+"\tName:"+nm+"\tMarks:"+mrk;
        return s;
    }
    void display()
    {
        System.out.println(toString());
    }
    public int  compareTo(Student6 a)
    {
        return no-a.no;
    }
    public int  compare(Student6 a,Student6 b)
    {
       Double p=new Double(a.mrk);
       Double q=new Double(b.mrk);
       return p.compareTo(q);
    }

    public static void main(String []args)
    {
        Student6[]k=new Student6[5];
        k[0]=new Student6(13,"Kunal",7.8);
        k[1]=new Student6(6,"Shruti",9.8);
        k[2]=new Student6(3,"Kunal",7.8);
        k[3]=new Student6(11,"Atharv",7.9);
        k[4]=new Student6(2,"Sid",6.6);
       
        System.out.println(Arrays.toString(k));
        Arrays.sort(k,new Student6());
        System.out.println(Arrays.toString(k));
    }
}