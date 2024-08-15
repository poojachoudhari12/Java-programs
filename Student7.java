import javax.swing.*;
import java.util.*;
//use of comparable interface
public class Student7 implements Comparable<Student7>,Comparator<Student7>
{
    int no;
    String nm;
    double mrk;
    Student7()
    {
        no=0;
        nm=new String();
        mrk=0.0;
    }
    Student7(int a,String b,double c)
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
    public int  compareTo(Student7 a)
    {
        return no-a.no;
    }
    public int  compare(Student7 a,Student7 b)
    {
       Double p=new Double(a.mrk);
       Double q=new Double(b.mrk);
       return p.compareTo(q);
    }
    public static Comparator<Student7>ByName=new Comparator<Student7>()
    {
        public int compare(Student7 a,Student7 b)
        {
            return (a.nm).compareTo(b.nm);
        }
    };
    public static Comparator<Student7>ByNameNo=new Comparator<Student7>()
    {
        public int compare(Student7 a,Student7 b)
        {
            int val=(a.nm).compareTo(b.nm);
            if(val==0)
            return (a.no-b.no);
           else 
           return val;
        }
    };


    public static void main(String []args)
    {
        Student7[]k=new Student7[5];
        k[0]=new Student7(13,"Kunal",7.8);
        k[1]=new Student7(6,"Shruti",9.8);
        k[2]=new Student7(3,"Kunal",8.8);
        k[3]=new Student7(11,"Atharv",7.9);
        k[4]=new Student7(2,"Sid",6.6);
       
        System.out.println(Arrays.toString(k));
        Arrays.sort(k,Student7.ByName);
        System.out.println(Arrays.toString(k));
    }
}