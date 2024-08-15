
//didgit cout+

import java.io.*;
public class KBD15 {
    public static void main(String[]args)
    {
        BufferedReader br=null;
        try
        {
            br=new BufferedReader(new InputStreamReader(System.in));

        }
        catch(Exception e) {}
        int no=0;
        String str="";
        System.out.println("Enter no:");
        try{
            str=br.readLine();
        }
        catch(Exception e) {}
        try{
            no=Integer.parseInt(str);
        }
        catch(Exception e)
        {
            System.out.println("Invalide Input");
            return;
        }
       System.out.println("Length:"+str.length());
    }
}

