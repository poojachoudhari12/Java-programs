import java.util.*;
public class KBD2
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        String[]a=null;
        a=new String[5];
        int i=0;
        while(i<a.length)
        {
            System.out.println("City Name:"+i+":");
            a[i]=s.next();
            i++;
        }
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}