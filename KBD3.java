import java.util.*;
public class KBD3 
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        String[]a=null; //a is a reference variable to an array of type string
        a=new String[5]; //array creation to hold references to class type string
        int i=0;
        while(i<a.length)
        {
            System.out.println("City Name"+i+":");
            a[i]=s.next();
            i++;
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

