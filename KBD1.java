//program to input data from keyboard
import java.util.*;

public class KBD1
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("String:");
        String str=s.next(); //waits for input
        System.out.println(str);
    }
}